grammar Expr;

prog:   ID(fsuj | nfsuj);

fsuj:   NEWLINE
        (
        ID ID (VIRGULE ID)* PTVIRGULE NEWLINE
        )*
        POINT
        ;

nfsuj:  (
         ID ID (VIRGULE ID)* POINT
        )*
        ;

VIRGULE:    ',';
PTVIRGULE: ';';
POINT:  '.';
ID  :   '<'('a'..'z'|'A'..'Z')+'>' ;
NEWLINE:'\r'? '\n' ;
WS  :   (' '|'\t')+ {skip();} ;
