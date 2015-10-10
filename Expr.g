grammar Expr;

doc:    lines;

lines:  line lines | ;

line:   entity fact [$entity.value] '.';

fact [String sub]
    :
    (entity objs[sub, $entity.value])(';' fact[sub] | )
    ;

objs[String sub, String pred]
    :
    (
    entity {System.out.println(sub + " " + pred + " " + $entity.value + ".");}
    |
    text {System.out.println(sub + " " + pred + " " + $text.value + ".");}
    )
    (',' objs[sub, pred] | )
    ;

entity returns [String value]
    :
    '<' ID '>' {$value = '<' + $ID.text + '>';}
    ;

text returns [String value]
    :
    '"' ID '"' {$value = '"' + $ID.text + '"';}
    ;

WS  :   (' '|'\t')+ {skip();} ;
ID  :   ('a'..'z'|'A'..'Z'|'0'..'9'|' '|'_'|'-')+ ;
NEWLINE:('\r'? '\n')+ {skip();} ;
