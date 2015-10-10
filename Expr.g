grammar Expr;

doc:    prog+;

prog:   entite fact '.';
fact:   (entite rest)(';' fact | );
rest:   (entite | text)(',' rest | );

entite: '<' ID '>';
text:   '"'ID'"';
ID  :   ('a'..'z'|'A'..'Z'|'0'..'9'|' ')+ ;
NEWLINE:('\r'? '\n')+ {skip();} ;
WS  :   (' '|'\t')+ {skip();} ;
