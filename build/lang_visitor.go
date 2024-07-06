// Code generated from src/Lang.g4 by ANTLR 4.13.1. DO NOT EDIT.

package BaseLang // Lang
import "github.com/antlr4-go/antlr/v4"

// A complete Visitor for a parse tree produced by LangParser.
type LangVisitor interface {
	antlr.ParseTreeVisitor

	// Visit a parse tree produced by LangParser#unit.
	VisitUnit(ctx *UnitContext) interface{}
}
