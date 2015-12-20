/* Generated By: http&JavaCC: Do not edit this line. SSPTParser.java */
package org.apache.camel.component.sql.sspt.parser;

import org.apache.camel.component.sql.sspt.ast.*;

public class SSPTParser implements SSPTParserConstants {
   int paramaterNameCounter = 0;

   String createNextParameterName() {
      return "_"+(paramaterNameCounter++);
   }

  final public Template parse() throws ParseException {
    Token procudureName;
    Template template = new Template();
    Object parameter = null;
    procudureName = jj_consume_token(IDENTIFIER);
    jj_consume_token(1);
    parameter = Parameter();
                                                               template.addParameter(parameter);
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 2:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      jj_consume_token(2);
      parameter = Parameter();
                template.addParameter(parameter);
    }
    jj_consume_token(3);
    jj_consume_token(0);
   template.setProcedureName(procudureName.toString());
   {if (true) return template;}
    throw new Error("Missing return statement in function");
  }

  final public Object Parameter() throws ParseException {
    Object param;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IDENTIFIER:
      param = InputParameter();
                                {if (true) return param;}
      break;
    case 5:
      param = OutParameter();
                                                                          {if (true) return param;}
      break;
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public InputParameter InputParameter() throws ParseException {
     String sqlTypeAsStr;
     String name;
     String valueSrcAsStr;
    sqlTypeAsStr = ParameterSqlType();
    jj_consume_token(4);
    valueSrcAsStr = InputParameterSrc();
        int sqlType = ParseHelper.parseSqlType(sqlTypeAsStr);
        {if (true) return new InputParameter(createNextParameterName(),sqlType,valueSrcAsStr,ParseHelper.sqlTypeToJavaType(sqlType,sqlTypeAsStr));}
    throw new Error("Missing return statement in function");
  }

  final public OutParameter OutParameter() throws ParseException {
     String sqlType;
     String name;
     String outHeader;
    jj_consume_token(5);
    jj_consume_token(4);
    sqlType = ParameterSqlType();
    jj_consume_token(4);
    outHeader = OutHeader();
        {if (true) return new OutParameter(createNextParameterName(),ParseHelper.parseSqlType(sqlType),outHeader);}
    throw new Error("Missing return statement in function");
  }

  final public String ParameterSqlType() throws ParseException {
    Token t;
    t = jj_consume_token(IDENTIFIER);
        {if (true) return t.toString();}
    throw new Error("Missing return statement in function");
  }

  final public String OutHeader() throws ParseException {
 Token token;
    token = jj_consume_token(IDENTIFIER);
        {if (true) return token.toString();}
    throw new Error("Missing return statement in function");
  }

  final public String InputParameterSrc() throws ParseException {
    String ret;
    ret = SimpleExpression();
        {if (true) return ret;}
    throw new Error("Missing return statement in function");
  }

  final public String SimpleExpression() throws ParseException {
 Token t = null;
    t = jj_consume_token(SIMPLE_EXP_TOKEN);
    {if (true) return t.toString();}
    throw new Error("Missing return statement in function");
  }

  /** Generated Token Manager. */
  public SSPTParserTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[2];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x4,0x220,};
   }

  /** Constructor with InputStream. */
  public SSPTParser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public SSPTParser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new SSPTParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public SSPTParser(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new SSPTParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public SSPTParser(SSPTParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(SSPTParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[10];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 2; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 10; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
