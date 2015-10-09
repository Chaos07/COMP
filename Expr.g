grammar Expr;

prog:   ID(fsub | nfsub);

fsub:
	factor
	POINT
	;

factor:
	ID
	ID
	fpred
	PTVIRGULE
	;

fpred:
	VIRGULE
	ID
	fpred
	|
	;




nfsub: nfsubb nfsub | ;
nfsubb: ID ID id POINT;
id:
	VIRGULE
	ID 
	id 
	|;

VIRGULE:    ',';
PTVIRGULE: ';';
POINT:  '.';
ID  :   ('a'..'z'|'A'..'Z')+ ;
NEWLINE:('\r'? '\n')+ {skip();} ;
WS  :   (' '|'\t')+ {skip();} ;

prog:	( ID ((IoD (VIR ID)* PTVG)* | ID (VIR ID)* PT) )*

