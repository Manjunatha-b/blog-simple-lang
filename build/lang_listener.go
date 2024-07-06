// Code generated from src/Lang.g4 by ANTLR 4.13.1. DO NOT EDIT.

package BaseLang // Lang
import "github.com/antlr4-go/antlr/v4"

// LangListener is a complete listener for a parse tree produced by LangParser.
type LangListener interface {
	antlr.ParseTreeListener

	// EnterUnit is called when entering the unit production.
	EnterUnit(c *UnitContext)

	// ExitUnit is called when exiting the unit production.
	ExitUnit(c *UnitContext)
}
