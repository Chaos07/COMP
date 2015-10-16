grammar ExprAST;
options {
    output=AST;
    ASTLabelType=CommonTree;
}

tokens {
    Doc;
    S;
    P;
    O;
}

doc:    lines -> ^(Doc lines);

lines:  line lines | ;

line:   entity fact '.' -> ^(S entity fact)
        ;

fact:
    entobj(';'! fact | )
    ;

entobj:
    entity objs -> ^(P entity objs)
    ;

objs:
    obj(','! objs | )
    ;

obj:
    (
    entity  -> ^(O entity)
    |
    text    -> ^(O text)
    )
    ;

entity:
    '<' ID '>'
    ;

text:
    '"' ID '"'
    ;

WS  :   (' '|'\t')+ {skip();} ;
ID  :   ('a'..'z'|'A'..'Z'|'0'..'9'|' '|'_'|'-')+ ;
NEWLINE:('\r'? '\n')+ {skip();} ;
