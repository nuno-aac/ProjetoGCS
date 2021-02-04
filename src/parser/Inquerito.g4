grammar Inquerito;

list returns[ListStr lista, int numPares]: { $lista = new ListStr(); $numPares=0; }
       OBRACKET
       elemento                             { if($elemento.numPar){$numPares++} else if(!$elemento.palavra.equals('')){lista.snoc($elemento.palavra)} }
       (VIR elemento { if($elemento.numPar){$numPares++} else if(!$elemento.palavra.equals('')){lista.snoc($elemento.palavra)} })*
       EBRACKET;

elemento returns[boolean numPar, String palavra]:
    PALAVRA { $numPar = false; palavra = $PALAVRA.text }
    | NUM   { $numPar = (&NUM.int % 2 == 0) ; palavra = '' };

NUM: [0-9]+;
PALAVRA: [a-zA-Z]+;
VIR: ',';
OBRACKET: '[';
EBRACKET: ']';
