grammar GramNew;

r: '<?php' body '?>';

WS : [ \t\r\n]+ -> skip;


ID  :  ('$') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
  ;

INT :  '0'..'9'+
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')*
    |   '.' ('0'..'9')+
    |   ('0'..'9')+  '.0'
    ;

STR
  :   ('`'|'"') ('a'..'z'|'A'..'Z'|'!'|'.'|',')* ('`'|'"')
  ;

BOOL
  : 'true'|'false'|'NaN'
  ;

OPER
  :  ('+'|'-'|'*'|'/'|'**'|'%'|'++'|'--')
  ;

COMP
    : ('<' | '>' | '<=' | '>=' | '==')
    ;


assignbool
  :  (ID '=' BOOL ';' )+
  ;

assignsstr
  :  (ID '=' STR ';')+
  ;

var
    : (INT | BOOL | STR | FLOAT)
    ;

numVar
    : (INT | FLOAT | ID)
    ;

assignsdigit
  :  (ID '=' INT ';')+
  |  (ID '=' FLOAT ';')+
  ;

list
    : INT
    | FLOAT
    | STR
    | BOOL
    ;

assignlist
  :  ID '=' '[' (list (',' list)*)? ']' ';'
  ;

var_1
   : numVar
   ;

var_2
  : numVar
  ;

operations
  :  ID '=' (var_1 OPER var_2) ';'
  | ID OPER ';'
  ;

input
  :  ID '=' 'input()' ';'
  ;

print_var
   : var
   ;

output
   : 'echo(' (print_var)* ')' ';'
   ;

body
  :  (assignbool | assignsstr | assignsdigit | assignlist | input | output | operations | cycle | conditional_operator)+
  ;


cycle
    : 'while' '(' condition ')' '{' body+ '}'
    ;

else_block
   : 'else' '{' body+ '}'
   ;

conditional_operator
   :  'if' '(' condition ')' '{' body+ '}' ('else if' '(' condition ')' '{' body+ '}' )? (else_block)?
   ;

cond_1
   : var
   ;

cond_2
   : var
   ;

condition
    : ID? '='? cond_1 COMP cond_2
    ;