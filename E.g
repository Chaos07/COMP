
prog: ENTITE list '.' ( prog | );

list: (field ';' list) | field;

field: '<titre>' CHAINE | ENTITE taglist;

taglist: ENTITE (',' taglist | );

ENTITE: '<' ID '>';

CHAINE: '"' ID '"';

ID: ('a'..'z' | 'A'..'Z' | '_' | '0'..'9') ini;
ini: ('a'..'z' | 'A'..'Z' | '_') ini | ;

WS: 
