
package Analizador.E16;
import java_cup.runtime.Symbol;
import Analizador.util.MiError;
import Analizador.util.TipoError;
%%
%cupsym sym
%class ScannerE16
%cup
%public
%unicode
%line
%column
%char
%ignorecase

//------------------------------------------------------------------------
//EXPRESIONES REGULARES
LETRA =[a-zA-ZÑñ]+
ENTERO =[0-9]+
DECIMAL ={ENTERO}"."{ENTERO}
ID =({LETRA}|("_"{LETRA}))({LETRA}|{ENTERO}|"_")*
CADENA =[\"\“\'] [^\"\”\'\n]* [\"\”\'\n]
CHAR =[\'] [^\'\n]{1} [\'\n]
BLANCOS=[ \t\r\f\n]+

%state LINEA_COMENT,BLOQUE_COMENT
%%
<YYINITIAL>"+" {return new Symbol(sym.mas,yycolumn,yyline,yytext());}
<YYINITIAL>"-" {return new Symbol(sym.menos,yycolumn,yyline,yytext());}
<YYINITIAL>"*" {return new Symbol(sym.por,yycolumn,yyline,yytext());}
<YYINITIAL>"/" {return new Symbol(sym.div,yycolumn,yyline,yytext());}
<YYINITIAL>"(" {return new Symbol(sym.par1,yycolumn,yyline,yytext());}
<YYINITIAL>")" {return new Symbol(sym.par2,yycolumn,yyline,yytext());}
<YYINITIAL>";" {return new Symbol(sym.puntoycoma,yycolumn,yyline,yytext());}
<YYINITIAL>"{" {return new Symbol(sym.llave1,yycolumn,yyline,yytext());}
<YYINITIAL>"}" {return new Symbol(sym.llave2,yycolumn,yyline,yytext());}
<YYINITIAL>"," {return new Symbol(sym.coma,yycolumn,yyline,yytext());}
<YYINITIAL>"[" {return new Symbol(sym.cor1,yycolumn,yyline,yytext());}
<YYINITIAL>"]" {return new Symbol(sym.cor2,yycolumn,yyline,yytext());}
<YYINITIAL>":" {return new Symbol(sym.dospuntos,yycolumn,yyline,yytext());}

<YYINITIAL>"char" {return new Symbol(sym.pr_char,yycolumn,yyline,yytext());}
<YYINITIAL>"int" {return new Symbol(sym.pr_int,yycolumn,yyline,yytext());}
<YYINITIAL>"struct" {return new Symbol(sym.pr_struct,yycolumn,yyline,yytext());}

<YYINITIAL>"//" {yybegin(LINEA_COMENT);}
<YYINITIAL>"/*" {yybegin(BLOQUE_COMENT);}


//ER
<YYINITIAL>{ENTERO} {return new Symbol(sym.entero,yycolumn,yyline,yytext());}
<YYINITIAL>{DECIMAL} {return new Symbol(sym.decimal,yycolumn,yyline,yytext());}
<YYINITIAL>{CHAR} {return new Symbol(sym.caracter,yycolumn,yyline,yytext());}
<YYINITIAL>{CADENA} {return new Symbol(sym.cadena,yycolumn,yyline,yytext());}
<YYINITIAL>{ID} {return new Symbol(sym.id,yycolumn,yyline,yytext());}

<LINEA_COMENT>[^"\n"] {}
<LINEA_COMENT>"\n" {yybegin(YYINITIAL);}

<BLOQUE_COMENT>[^"*/"] {}
<BLOQUE_COMENT>"*/" {yybegin(YYINITIAL);}

//BLANCOS
<YYINITIAL>{BLANCOS} {/* Se ignora */}

.   {
    System.err.println("Error lexico: "+yytext()+ " Linea:"+(yyline+1)+" Columna:"+(yycolumn+1));
    Analizador.AnalizadorLenguaje.getErrores().add(new MiError("\""+yytext()+"\" Caracter desconocido", TipoError.LEXICO, 
    "",(yyline+1), (yycolumn+1)));    
}


