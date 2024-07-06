grammar Lang;

unit: OpenParen bracketContent = unit CloseParen 
  | left = unit ( Divide ) right = unit
	| left = unit ( Multiply) right = unit
	| left = unit ( Plus) right = unit
	| left = unit ( Minus) right = unit
	| base=DecimalLiteral
;

OpenParen: '(';
CloseParen: ')';

Plus: '+';
Minus: '-';
Multiply: '*';
Divide: '/';

WhiteSpaces: [\t ]+ -> channel(HIDDEN);

DecimalLiteral:
	DecimalIntegerLiteral '.' [0-9]*
	| DecimalIntegerLiteral;

fragment DecimalIntegerLiteral: '0' | [1-9] [0-9_]*;
