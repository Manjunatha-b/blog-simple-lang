package lang

import (
	parser "customlang/build"
	"strconv"

	"github.com/antlr4-go/antlr/v4"
)

func Execute(code string) float64 {
	executor := &LangVisitor{}

	inputStream := antlr.NewInputStream(code)
	lexer := parser.NewLangLexer(inputStream)
	commonTokenStream := antlr.NewCommonTokenStream(lexer, 0)
	parser := parser.NewLangParser(commonTokenStream)
	tree := parser.Unit()

	return executor.Visit(tree).(float64)
}

type LangVisitor struct {
	parser.BaseLangVisitor
}

func (v *LangVisitor) Visit(tree antlr.ParseTree) interface{} {
	// traverse the tree
	return tree.Accept(v)
}

func (v *LangVisitor) VisitUnit(ctx *parser.UnitContext) interface{} {
	if ctx.OpenParen() != nil && ctx.CloseParen() != nil {

		// [brackets] case
		return ctx.GetBracketContent().Accept(v)

	} else if ctx.GetBase() != nil {

		// [plain number] case
		num, _ := strconv.ParseFloat(ctx.DecimalLiteral().GetText(), 64)
		return num

	} else {

		// [/, *, +, -] case
		// get left and right operands for the operation
		left := ctx.GetLeft().Accept(v).(float64)
		right := ctx.GetRight().Accept(v).(float64)

		if ctx.Divide() != nil {
			return left / right
		} else if ctx.Multiply() != nil {
			return left * right
		} else if ctx.Plus() != nil {
			return left + right
		} else if ctx.Minus() != nil {
			return left - right
		}
	}

	return nil
}
