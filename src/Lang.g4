grammar Lang;

// Parser

unit: OpenParen bracketContent = unit CloseParen 
  | left = unit ( Divide ) right = unit
	| left = unit ( Multiply) right = unit
	| left = unit ( Plus) right = unit
	| left = unit ( Minus) right = unit
	| base=DecimalLiteral
;

// Lexer

OpenParen: '(';
CloseParen: ')';
Plus: '+';
Minus: '-';
Multiply: '*';
Divide: '/';

// Ignore whitespaces
WhiteSpaces: [\t ]+ -> channel(HIDDEN);

// can be a decimal | integer  
DecimalLiteral:
	DecimalIntegerLiteral '.' [0-9]*
	| DecimalIntegerLiteral;

// this looks weird, but its done to ignore numbers like 0002, 0005 ( leading zeros )
fragment DecimalIntegerLiteral: '0' | [1-9] [0-9_]*;
