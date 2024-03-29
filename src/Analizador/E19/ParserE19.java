
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sun Sep 08 15:26:16 CST 2019
//----------------------------------------------------

package Analizador.E19;

import java_cup.runtime.*;
import Analizador.util.*;
import intefaz.Principal;
import java.util.Stack;
import java.util.ArrayList;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sun Sep 08 15:26:16 CST 2019
  */
public class ParserE19 extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public ParserE19() {super();}

  /** Constructor which sets the default scanner. */
  public ParserE19(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ParserE19(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\004\000\002\002\003\000\002\002\004\000\002\003" +
    "\005\000\002\003\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\010\000\004\030\005\001\002\000\006\002\001\012" +
    "\011\001\002\000\004\022\010\001\002\000\004\002\007" +
    "\001\002\000\004\002\000\001\002\000\006\002\ufffe\012" +
    "\ufffe\001\002\000\004\022\012\001\002\000\006\002\uffff" +
    "\012\uffff\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\010\000\006\002\005\003\003\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ParserE19$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ParserE19$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$ParserE19$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    /**Metodo al que se llama automáticamente ante algún error sintactico.*/
    public void syntax_error(Symbol s){
        System.err.println("Error en la Línea " + (s.right+1) +" Columna "+(s.left+1)+ ". Identificador "
        +s.value + " no reconocido." );
        Analizador.AnalizadorLenguaje.getErrores().add(new MiError("identificador \""+s.value+"\" no identificado", TipoError.SINTACTICO, 
        "",(s.right+1), (s.left+1)));
        
    }

    /**Metodo al que se llama en el momento en que ya no es posible una recuperación de
    getErrores().*/
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{
        System.err.println("Error en la Línea " + (s.right+1)+ "Columna "+(s.left+1)+". Identificador " +
        s.value + " no reconocido.");  
        Analizador.AnalizadorLenguaje.getErrores().add(new MiError("identificador \""+s.value+"\" no identificado", TipoError.SINTACTICO, 
        "",(s.right+1), (s.left+1)));
  
    }


}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$ParserE19$actions {




  private final ParserE19 parser;

  /** Constructor */
  CUP$ParserE19$actions(ParserE19 parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$ParserE19$do_action(
    int                        CUP$ParserE19$act_num,
    java_cup.runtime.lr_parser CUP$ParserE19$parser,
    java.util.Stack            CUP$ParserE19$stack,
    int                        CUP$ParserE19$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ParserE19$result;

      /* select the action based on the action number */
      switch (CUP$ParserE19$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // A ::= color id 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ParserE19$stack.elementAt(CUP$ParserE19$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ParserE19$stack.elementAt(CUP$ParserE19$top-1)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$ParserE19$stack.elementAt(CUP$ParserE19$top-1)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$ParserE19$stack.peek()).left;
		int pright = ((java_cup.runtime.Symbol)CUP$ParserE19$stack.peek()).right;
		String p = (String)((java_cup.runtime.Symbol) CUP$ParserE19$stack.peek()).value;
		RESULT= new Atributo(p+" es "+a+"\n",a);
              CUP$ParserE19$result = parser.getSymbolFactory().newSymbol("A",1, ((java_cup.runtime.Symbol)CUP$ParserE19$stack.elementAt(CUP$ParserE19$top-1)), ((java_cup.runtime.Symbol)CUP$ParserE19$stack.peek()), RESULT);
            }
          return CUP$ParserE19$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // A ::= A coma id 
            {
              Object RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$ParserE19$stack.elementAt(CUP$ParserE19$top-2)).left;
		int valright = ((java_cup.runtime.Symbol)CUP$ParserE19$stack.elementAt(CUP$ParserE19$top-2)).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$ParserE19$stack.elementAt(CUP$ParserE19$top-2)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$ParserE19$stack.peek()).left;
		int pright = ((java_cup.runtime.Symbol)CUP$ParserE19$stack.peek()).right;
		String p = (String)((java_cup.runtime.Symbol) CUP$ParserE19$stack.peek()).value;
		
Atributo att = (Atributo)val;
RESULT= new Atributo(att.getValor()+p+" es "+att.getColor()+"\n",att.getColor());

              CUP$ParserE19$result = parser.getSymbolFactory().newSymbol("A",1, ((java_cup.runtime.Symbol)CUP$ParserE19$stack.elementAt(CUP$ParserE19$top-2)), ((java_cup.runtime.Symbol)CUP$ParserE19$stack.peek()), RESULT);
            }
          return CUP$ParserE19$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ParserE19$stack.elementAt(CUP$ParserE19$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ParserE19$stack.elementAt(CUP$ParserE19$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$ParserE19$stack.elementAt(CUP$ParserE19$top-1)).value;
		RESULT = start_val;
              CUP$ParserE19$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ParserE19$stack.elementAt(CUP$ParserE19$top-1)), ((java_cup.runtime.Symbol)CUP$ParserE19$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ParserE19$parser.done_parsing();
          return CUP$ParserE19$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // INICIO ::= A 
            {
              Object RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$ParserE19$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$ParserE19$stack.peek()).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$ParserE19$stack.peek()).value;
		
Atributo att = (Atributo)val;
Principal.escribirMensajeEnConsola(att.getValor());

              CUP$ParserE19$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$ParserE19$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserE19$stack.peek()), RESULT);
            }
          return CUP$ParserE19$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

