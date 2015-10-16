tree grammar ExprASTWalker;
options {
    tokenVocab=ExprAST;
    ASTLabelType=CommonTree;
}

doc
    :
    ^(Doc line+);

line
    :
    ^(S id fact[$id.value]+)
    ;

fact[String sub]
    :
    ^(P id objs[sub, $id.value]+)
    ;

objs[String sub, String pred]
    :
    ^(O id)
    {System.out.println(sub + " " + pred + " " + $id.value + " .");}
    ;

id returns [String value]
    :
    '<'ID'>' {$value = '<' + $ID.text + '>';}
    |
    '"'ID'"' {$value = '"' + $ID.text + '"';}
    ;
