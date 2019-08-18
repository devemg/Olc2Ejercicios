
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Mon Aug 05 14:45:09 CST 2019
//----------------------------------------------------

package Analizador.E6;

import java_cup.runtime.*;
import Analizador.util.*;
import intefaz.Principal;
import java.util.ArrayList;
import java.util.Stack;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Mon Aug 05 14:45:09 CST 2019
  */
public class ParserE6 extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public ParserE6() {super();}

  /** Constructor which sets the default scanner. */
  public ParserE6(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ParserE6(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\007\000\002\002\003\000\002\002\004\000\002\003" +
    "\005\000\002\004\005\000\002\004\003\000\002\005\003" +
    "\000\002\005\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\014\000\004\013\006\001\002\000\004\002\001\001" +
    "\002\000\004\002\016\001\002\000\006\013\006\021\010" +
    "\001\002\000\006\012\013\014\014\001\002\000\006\012" +
    "\ufffc\014\ufffc\001\002\000\006\012\ufffb\014\ufffb\001\002" +
    "\000\006\012\ufffd\014\ufffd\001\002\000\006\013\006\021" +
    "\010\001\002\000\010\002\uffff\012\uffff\014\uffff\001\002" +
    "\000\006\012\ufffe\014\ufffe\001\002\000\004\002\000\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\014\000\006\002\004\003\003\001\001\000\002\001" +
    "\001\000\002\001\001\000\010\003\010\004\006\005\011" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\003\010\005\014\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ParserE6$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ParserE6$actions(this);
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
    return action_obj.CUP$ParserE6$do_action(act_num, parser, stack, top);
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
class CUP$ParserE6$actions {




  private final ParserE6 parser;

  /** Constructor */
  CUP$ParserE6$actions(ParserE6 parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$ParserE6$do_action(
    int                        CUP$ParserE6$act_num,
    java_cup.runtime.lr_parser CUP$ParserE6$parser,
    java.util.Stack            CUP$ParserE6$stack,
    int                        CUP$ParserE6$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ParserE6$result;

      /* select the action based on the action number */
      switch (CUP$ParserE6$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // B ::= S 
            {
              Object RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$ParserE6$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$ParserE6$stack.peek()).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$ParserE6$stack.peek()).value;
		RESULT=val;
              CUP$ParserE6$result = parser.getSymbolFactory().newSymbol("B",3, ((java_cup.runtime.Symbol)CUP$ParserE6$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserE6$stack.peek()), RESULT);
            }
          return CUP$ParserE6$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // B ::= entero 
            {
              Object RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$ParserE6$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$ParserE6$stack.peek()).right;
		String val = (String)((java_cup.runtime.Symbol) CUP$ParserE6$stack.peek()).value;
		RESULT=val;
              CUP$ParserE6$result = parser.getSymbolFactory().newSymbol("B",3, ((java_cup.runtime.Symbol)CUP$ParserE6$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserE6$stack.peek()), RESULT);
            }
          return CUP$ParserE6$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // A ::= B 
            {
              Object RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$ParserE6$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$ParserE6$stack.peek()).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$ParserE6$stack.peek()).value;
		
ArrayList<String> lista = new ArrayList<>();
lista.add((String)val);
RESULT=lista;

              CUP$ParserE6$result = parser.getSymbolFactory().newSymbol("A",2, ((java_cup.runtime.Symbol)CUP$ParserE6$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserE6$stack.peek()), RESULT);
            }
          return CUP$ParserE6$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // A ::= A coma B 
            {
              Object RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$ParserE6$stack.elementAt(CUP$ParserE6$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$ParserE6$stack.elementAt(CUP$ParserE6$top-2)).right;
		Object l = (Object)((java_cup.runtime.Symbol) CUP$ParserE6$stack.elementAt(CUP$ParserE6$top-2)).value;
		int valleft = ((java_cup.runtime.Symbol)CUP$ParserE6$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$ParserE6$stack.peek()).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$ParserE6$stack.peek()).value;
		
ArrayList<String> lista = (ArrayList)l;
lista.add((String)val);
RESULT=lista;

              CUP$ParserE6$result = parser.getSymbolFactory().newSymbol("A",2, ((java_cup.runtime.Symbol)CUP$ParserE6$stack.elementAt(CUP$ParserE6$top-2)), ((java_cup.runtime.Symbol)CUP$ParserE6$stack.peek()), RESULT);
            }
          return CUP$ParserE6$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // S ::= cor1 A cor2 
            {
              Object RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$ParserE6$stack.elementAt(CUP$ParserE6$top-1)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$ParserE6$stack.elementAt(CUP$ParserE6$top-1)).right;
		Object l = (Object)((java_cup.runtime.Symbol) CUP$ParserE6$stack.elementAt(CUP$ParserE6$top-1)).value;
		
ArrayList<String> lista = (ArrayList)l;
for(String st : lista){
    System.out.println(st);
}

              CUP$ParserE6$result = parser.getSymbolFactory().newSymbol("S",1, ((java_cup.runtime.Symbol)CUP$ParserE6$stack.elementAt(CUP$ParserE6$top-2)), ((java_cup.runtime.Symbol)CUP$ParserE6$stack.peek()), RESULT);
            }
          return CUP$ParserE6$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ParserE6$stack.elementAt(CUP$ParserE6$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ParserE6$stack.elementAt(CUP$ParserE6$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$ParserE6$stack.elementAt(CUP$ParserE6$top-1)).value;
		RESULT = start_val;
              CUP$ParserE6$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ParserE6$stack.elementAt(CUP$ParserE6$top-1)), ((java_cup.runtime.Symbol)CUP$ParserE6$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ParserE6$parser.done_parsing();
          return CUP$ParserE6$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // INICIO ::= S 
            {
              Object RESULT =null;

              CUP$ParserE6$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$ParserE6$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserE6$stack.peek()), RESULT);
            }
          return CUP$ParserE6$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}
