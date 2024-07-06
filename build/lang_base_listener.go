// Code generated from src/Lang.g4 by ANTLR 4.13.1. DO NOT EDIT.

package BaseLang // Lang
import "github.com/antlr4-go/antlr/v4"

// BaseLangListener is a complete listener for a parse tree produced by LangParser.
type BaseLangListener struct{}

var _ LangListener = &BaseLangListener{}

// VisitTerminal is called when a terminal node is visited.
func (s *BaseLangListener) VisitTerminal(node antlr.TerminalNode) {}

// VisitErrorNode is called when an error node is visited.
func (s *BaseLangListener) VisitErrorNode(node antlr.ErrorNode) {}

// EnterEveryRule is called when any rule is entered.
func (s *BaseLangListener) EnterEveryRule(ctx antlr.ParserRuleContext) {}

// ExitEveryRule is called when any rule is exited.
func (s *BaseLangListener) ExitEveryRule(ctx antlr.ParserRuleContext) {}

// EnterUnit is called when production unit is entered.
func (s *BaseLangListener) EnterUnit(ctx *UnitContext) {}

// ExitUnit is called when production unit is exited.
func (s *BaseLangListener) ExitUnit(ctx *UnitContext) {}
