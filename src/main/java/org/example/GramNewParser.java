package org.example;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GramNewParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		WS=18, ID=19, INT=20, FLOAT=21, STR=22, BOOL=23, OPER=24, COMP=25;
	public static final int
		RULE_r = 0, RULE_assignbool = 1, RULE_assignsstr = 2, RULE_var = 3, RULE_numVar = 4, 
		RULE_assignsdigit = 5, RULE_list = 6, RULE_assignlist = 7, RULE_var_1 = 8, 
		RULE_var_2 = 9, RULE_operations = 10, RULE_input = 11, RULE_print_var = 12, 
		RULE_output = 13, RULE_body = 14, RULE_cycle = 15, RULE_else_block = 16, 
		RULE_conditional_operator = 17, RULE_cond_1 = 18, RULE_cond_2 = 19, RULE_condition = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"r", "assignbool", "assignsstr", "var", "numVar", "assignsdigit", "list", 
			"assignlist", "var_1", "var_2", "operations", "input", "print_var", "output", 
			"body", "cycle", "else_block", "conditional_operator", "cond_1", "cond_2", 
			"condition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<?php'", "'?>'", "'='", "';'", "'['", "','", "']'", "'input()'", 
			"'echo('", "')'", "'while'", "'('", "'{'", "'}'", "'else'", "'if'", "'else if'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "WS", "ID", "INT", "FLOAT", "STR", 
			"BOOL", "OPER", "COMP"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "GramNew.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramNewParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__0);
			setState(43);
			body();
			setState(44);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignboolContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramNewParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramNewParser.ID, i);
		}
		public List<TerminalNode> BOOL() { return getTokens(GramNewParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(GramNewParser.BOOL, i);
		}
		public AssignboolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignbool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).enterAssignbool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).exitAssignbool(this);
		}
	}

	public final AssignboolContext assignbool() throws RecognitionException {
		AssignboolContext _localctx = new AssignboolContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assignbool);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(46);
					match(ID);
					setState(47);
					match(T__2);
					setState(48);
					match(BOOL);
					setState(49);
					match(T__3);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(52); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignsstrContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramNewParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramNewParser.ID, i);
		}
		public List<TerminalNode> STR() { return getTokens(GramNewParser.STR); }
		public TerminalNode STR(int i) {
			return getToken(GramNewParser.STR, i);
		}
		public AssignsstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignsstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).enterAssignsstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).exitAssignsstr(this);
		}
	}

	public final AssignsstrContext assignsstr() throws RecognitionException {
		AssignsstrContext _localctx = new AssignsstrContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignsstr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(58); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(54);
					match(ID);
					setState(55);
					match(T__2);
					setState(56);
					match(STR);
					setState(57);
					match(T__3);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(60); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GramNewParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(GramNewParser.BOOL, 0); }
		public TerminalNode STR() { return getToken(GramNewParser.STR, 0); }
		public TerminalNode FLOAT() { return getToken(GramNewParser.FLOAT, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15728640L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumVarContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GramNewParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(GramNewParser.FLOAT, 0); }
		public TerminalNode ID() { return getToken(GramNewParser.ID, 0); }
		public NumVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).enterNumVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).exitNumVar(this);
		}
	}

	public final NumVarContext numVar() throws RecognitionException {
		NumVarContext _localctx = new NumVarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_numVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignsdigitContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramNewParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramNewParser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(GramNewParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GramNewParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(GramNewParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(GramNewParser.FLOAT, i);
		}
		public AssignsdigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignsdigit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).enterAssignsdigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).exitAssignsdigit(this);
		}
	}

	public final AssignsdigitContext assignsdigit() throws RecognitionException {
		AssignsdigitContext _localctx = new AssignsdigitContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignsdigit);
		try {
			int _alt;
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(66);
						match(ID);
						setState(67);
						match(T__2);
						setState(68);
						match(INT);
						setState(69);
						match(T__3);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(72); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(74);
						match(ID);
						setState(75);
						match(T__2);
						setState(76);
						match(FLOAT);
						setState(77);
						match(T__3);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(80); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GramNewParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(GramNewParser.FLOAT, 0); }
		public TerminalNode STR() { return getToken(GramNewParser.STR, 0); }
		public TerminalNode BOOL() { return getToken(GramNewParser.BOOL, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15728640L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignlistContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramNewParser.ID, 0); }
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public AssignlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).enterAssignlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).exitAssignlist(this);
		}
	}

	public final AssignlistContext assignlist() throws RecognitionException {
		AssignlistContext _localctx = new AssignlistContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(ID);
			setState(87);
			match(T__2);
			setState(88);
			match(T__4);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15728640L) != 0)) {
				{
				setState(89);
				list();
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(90);
					match(T__5);
					setState(91);
					list();
					}
					}
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(99);
			match(T__6);
			setState(100);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_1Context extends ParserRuleContext {
		public NumVarContext numVar() {
			return getRuleContext(NumVarContext.class,0);
		}
		public Var_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).enterVar_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).exitVar_1(this);
		}
	}

	public final Var_1Context var_1() throws RecognitionException {
		Var_1Context _localctx = new Var_1Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_var_1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			numVar();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_2Context extends ParserRuleContext {
		public NumVarContext numVar() {
			return getRuleContext(NumVarContext.class,0);
		}
		public Var_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).enterVar_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).exitVar_2(this);
		}
	}

	public final Var_2Context var_2() throws RecognitionException {
		Var_2Context _localctx = new Var_2Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_var_2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			numVar();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperationsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramNewParser.ID, 0); }
		public Var_1Context var_1() {
			return getRuleContext(Var_1Context.class,0);
		}
		public TerminalNode OPER() { return getToken(GramNewParser.OPER, 0); }
		public Var_2Context var_2() {
			return getRuleContext(Var_2Context.class,0);
		}
		public OperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).enterOperations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).exitOperations(this);
		}
	}

	public final OperationsContext operations() throws RecognitionException {
		OperationsContext _localctx = new OperationsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operations);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(ID);
				setState(107);
				match(T__2);
				{
				setState(108);
				var_1();
				setState(109);
				match(OPER);
				setState(110);
				var_2();
				}
				setState(112);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(ID);
				setState(115);
				match(OPER);
				setState(116);
				match(T__3);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InputContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramNewParser.ID, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ID);
			setState(120);
			match(T__2);
			setState(121);
			match(T__7);
			setState(122);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Print_varContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Print_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).enterPrint_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).exitPrint_var(this);
		}
	}

	public final Print_varContext print_var() throws RecognitionException {
		Print_varContext _localctx = new Print_varContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_print_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			var();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OutputContext extends ParserRuleContext {
		public List<Print_varContext> print_var() {
			return getRuleContexts(Print_varContext.class);
		}
		public Print_varContext print_var(int i) {
			return getRuleContext(Print_varContext.class,i);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).exitOutput(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_output);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__8);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15728640L) != 0)) {
				{
				{
				setState(127);
				print_var();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			match(T__9);
			setState(134);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public List<AssignboolContext> assignbool() {
			return getRuleContexts(AssignboolContext.class);
		}
		public AssignboolContext assignbool(int i) {
			return getRuleContext(AssignboolContext.class,i);
		}
		public List<AssignsstrContext> assignsstr() {
			return getRuleContexts(AssignsstrContext.class);
		}
		public AssignsstrContext assignsstr(int i) {
			return getRuleContext(AssignsstrContext.class,i);
		}
		public List<AssignsdigitContext> assignsdigit() {
			return getRuleContexts(AssignsdigitContext.class);
		}
		public AssignsdigitContext assignsdigit(int i) {
			return getRuleContext(AssignsdigitContext.class,i);
		}
		public List<AssignlistContext> assignlist() {
			return getRuleContexts(AssignlistContext.class);
		}
		public AssignlistContext assignlist(int i) {
			return getRuleContext(AssignlistContext.class,i);
		}
		public List<InputContext> input() {
			return getRuleContexts(InputContext.class);
		}
		public InputContext input(int i) {
			return getRuleContext(InputContext.class,i);
		}
		public List<OutputContext> output() {
			return getRuleContexts(OutputContext.class);
		}
		public OutputContext output(int i) {
			return getRuleContext(OutputContext.class,i);
		}
		public List<OperationsContext> operations() {
			return getRuleContexts(OperationsContext.class);
		}
		public OperationsContext operations(int i) {
			return getRuleContext(OperationsContext.class,i);
		}
		public List<CycleContext> cycle() {
			return getRuleContexts(CycleContext.class);
		}
		public CycleContext cycle(int i) {
			return getRuleContext(CycleContext.class,i);
		}
		public List<Conditional_operatorContext> conditional_operator() {
			return getRuleContexts(Conditional_operatorContext.class);
		}
		public Conditional_operatorContext conditional_operator(int i) {
			return getRuleContext(Conditional_operatorContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(145);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(136);
						assignbool();
						}
						break;
					case 2:
						{
						setState(137);
						assignsstr();
						}
						break;
					case 3:
						{
						setState(138);
						assignsdigit();
						}
						break;
					case 4:
						{
						setState(139);
						assignlist();
						}
						break;
					case 5:
						{
						setState(140);
						input();
						}
						break;
					case 6:
						{
						setState(141);
						output();
						}
						break;
					case 7:
						{
						setState(142);
						operations();
						}
						break;
					case 8:
						{
						setState(143);
						cycle();
						}
						break;
					case 9:
						{
						setState(144);
						conditional_operator();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(147); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CycleContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public CycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).enterCycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).exitCycle(this);
		}
	}

	public final CycleContext cycle() throws RecognitionException {
		CycleContext _localctx = new CycleContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cycle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__10);
			setState(150);
			match(T__11);
			setState(151);
			condition();
			setState(152);
			match(T__9);
			setState(153);
			match(T__12);
			setState(155); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(154);
				body();
				}
				}
				setState(157); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 592384L) != 0) );
			setState(159);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_blockContext extends ParserRuleContext {
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).enterElse_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).exitElse_block(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_else_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__14);
			setState(162);
			match(T__12);
			setState(164); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(163);
				body();
				}
				}
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 592384L) != 0) );
			setState(168);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Conditional_operatorContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public Conditional_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).enterConditional_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).exitConditional_operator(this);
		}
	}

	public final Conditional_operatorContext conditional_operator() throws RecognitionException {
		Conditional_operatorContext _localctx = new Conditional_operatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_conditional_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__15);
			setState(171);
			match(T__11);
			setState(172);
			condition();
			setState(173);
			match(T__9);
			setState(174);
			match(T__12);
			setState(176); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(175);
				body();
				}
				}
				setState(178); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 592384L) != 0) );
			setState(180);
			match(T__13);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(181);
				match(T__16);
				setState(182);
				match(T__11);
				setState(183);
				condition();
				setState(184);
				match(T__9);
				setState(185);
				match(T__12);
				setState(187); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(186);
					body();
					}
					}
					setState(189); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 592384L) != 0) );
				setState(191);
				match(T__13);
				}
			}

			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(195);
				else_block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cond_1Context extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Cond_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).enterCond_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).exitCond_1(this);
		}
	}

	public final Cond_1Context cond_1() throws RecognitionException {
		Cond_1Context _localctx = new Cond_1Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_cond_1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			var();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cond_2Context extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Cond_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).enterCond_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).exitCond_2(this);
		}
	}

	public final Cond_2Context cond_2() throws RecognitionException {
		Cond_2Context _localctx = new Cond_2Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_cond_2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			var();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public Cond_1Context cond_1() {
			return getRuleContext(Cond_1Context.class,0);
		}
		public TerminalNode COMP() { return getToken(GramNewParser.COMP, 0); }
		public Cond_2Context cond_2() {
			return getRuleContext(Cond_2Context.class,0);
		}
		public TerminalNode ID() { return getToken(GramNewParser.ID, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramNewListener ) ((GramNewListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(202);
				match(ID);
				}
			}

			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(205);
				match(T__2);
				}
			}

			setState(208);
			cond_1();
			setState(209);
			match(COMP);
			setState(210);
			cond_2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0019\u00d5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0004\u00013\b\u0001\u000b\u0001\f\u00014\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0004\u0002;\b\u0002\u000b\u0002\f\u0002<\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0004\u0005G\b\u0005\u000b\u0005\f\u0005H\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005O\b\u0005\u000b\u0005"+
		"\f\u0005P\u0003\u0005S\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007]\b"+
		"\u0007\n\u0007\f\u0007`\t\u0007\u0003\u0007b\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\nv\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0005\r\u0081\b\r\n\r\f\r\u0084\t\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u0092"+
		"\b\u000e\u000b\u000e\f\u000e\u0093\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u009c\b\u000f\u000b\u000f"+
		"\f\u000f\u009d\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0004\u0010\u00a5\b\u0010\u000b\u0010\f\u0010\u00a6\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0004\u0011\u00b1\b\u0011\u000b\u0011\f\u0011\u00b2\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0004\u0011\u00bc\b\u0011\u000b\u0011\f\u0011\u00bd\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00c2\b\u0011\u0001\u0011\u0003\u0011\u00c5\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0003\u0014"+
		"\u00cc\b\u0014\u0001\u0014\u0003\u0014\u00cf\b\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0000\u0000\u0015\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(\u0000\u0002\u0001\u0000\u0014\u0017\u0001\u0000\u0013\u0015\u00d9"+
		"\u0000*\u0001\u0000\u0000\u0000\u00022\u0001\u0000\u0000\u0000\u0004:"+
		"\u0001\u0000\u0000\u0000\u0006>\u0001\u0000\u0000\u0000\b@\u0001\u0000"+
		"\u0000\u0000\nR\u0001\u0000\u0000\u0000\fT\u0001\u0000\u0000\u0000\u000e"+
		"V\u0001\u0000\u0000\u0000\u0010f\u0001\u0000\u0000\u0000\u0012h\u0001"+
		"\u0000\u0000\u0000\u0014u\u0001\u0000\u0000\u0000\u0016w\u0001\u0000\u0000"+
		"\u0000\u0018|\u0001\u0000\u0000\u0000\u001a~\u0001\u0000\u0000\u0000\u001c"+
		"\u0091\u0001\u0000\u0000\u0000\u001e\u0095\u0001\u0000\u0000\u0000 \u00a1"+
		"\u0001\u0000\u0000\u0000\"\u00aa\u0001\u0000\u0000\u0000$\u00c6\u0001"+
		"\u0000\u0000\u0000&\u00c8\u0001\u0000\u0000\u0000(\u00cb\u0001\u0000\u0000"+
		"\u0000*+\u0005\u0001\u0000\u0000+,\u0003\u001c\u000e\u0000,-\u0005\u0002"+
		"\u0000\u0000-\u0001\u0001\u0000\u0000\u0000./\u0005\u0013\u0000\u0000"+
		"/0\u0005\u0003\u0000\u000001\u0005\u0017\u0000\u000013\u0005\u0004\u0000"+
		"\u00002.\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000042\u0001\u0000"+
		"\u0000\u000045\u0001\u0000\u0000\u00005\u0003\u0001\u0000\u0000\u0000"+
		"67\u0005\u0013\u0000\u000078\u0005\u0003\u0000\u000089\u0005\u0016\u0000"+
		"\u00009;\u0005\u0004\u0000\u0000:6\u0001\u0000\u0000\u0000;<\u0001\u0000"+
		"\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=\u0005"+
		"\u0001\u0000\u0000\u0000>?\u0007\u0000\u0000\u0000?\u0007\u0001\u0000"+
		"\u0000\u0000@A\u0007\u0001\u0000\u0000A\t\u0001\u0000\u0000\u0000BC\u0005"+
		"\u0013\u0000\u0000CD\u0005\u0003\u0000\u0000DE\u0005\u0014\u0000\u0000"+
		"EG\u0005\u0004\u0000\u0000FB\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IS\u0001\u0000"+
		"\u0000\u0000JK\u0005\u0013\u0000\u0000KL\u0005\u0003\u0000\u0000LM\u0005"+
		"\u0015\u0000\u0000MO\u0005\u0004\u0000\u0000NJ\u0001\u0000\u0000\u0000"+
		"OP\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000"+
		"\u0000QS\u0001\u0000\u0000\u0000RF\u0001\u0000\u0000\u0000RN\u0001\u0000"+
		"\u0000\u0000S\u000b\u0001\u0000\u0000\u0000TU\u0007\u0000\u0000\u0000"+
		"U\r\u0001\u0000\u0000\u0000VW\u0005\u0013\u0000\u0000WX\u0005\u0003\u0000"+
		"\u0000Xa\u0005\u0005\u0000\u0000Y^\u0003\f\u0006\u0000Z[\u0005\u0006\u0000"+
		"\u0000[]\u0003\f\u0006\u0000\\Z\u0001\u0000\u0000\u0000]`\u0001\u0000"+
		"\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_b\u0001"+
		"\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000aY\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0005\u0007\u0000"+
		"\u0000de\u0005\u0004\u0000\u0000e\u000f\u0001\u0000\u0000\u0000fg\u0003"+
		"\b\u0004\u0000g\u0011\u0001\u0000\u0000\u0000hi\u0003\b\u0004\u0000i\u0013"+
		"\u0001\u0000\u0000\u0000jk\u0005\u0013\u0000\u0000kl\u0005\u0003\u0000"+
		"\u0000lm\u0003\u0010\b\u0000mn\u0005\u0018\u0000\u0000no\u0003\u0012\t"+
		"\u0000op\u0001\u0000\u0000\u0000pq\u0005\u0004\u0000\u0000qv\u0001\u0000"+
		"\u0000\u0000rs\u0005\u0013\u0000\u0000st\u0005\u0018\u0000\u0000tv\u0005"+
		"\u0004\u0000\u0000uj\u0001\u0000\u0000\u0000ur\u0001\u0000\u0000\u0000"+
		"v\u0015\u0001\u0000\u0000\u0000wx\u0005\u0013\u0000\u0000xy\u0005\u0003"+
		"\u0000\u0000yz\u0005\b\u0000\u0000z{\u0005\u0004\u0000\u0000{\u0017\u0001"+
		"\u0000\u0000\u0000|}\u0003\u0006\u0003\u0000}\u0019\u0001\u0000\u0000"+
		"\u0000~\u0082\u0005\t\u0000\u0000\u007f\u0081\u0003\u0018\f\u0000\u0080"+
		"\u007f\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082"+
		"\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083"+
		"\u0085\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0005\n\u0000\u0000\u0086\u0087\u0005\u0004\u0000\u0000\u0087\u001b"+
		"\u0001\u0000\u0000\u0000\u0088\u0092\u0003\u0002\u0001\u0000\u0089\u0092"+
		"\u0003\u0004\u0002\u0000\u008a\u0092\u0003\n\u0005\u0000\u008b\u0092\u0003"+
		"\u000e\u0007\u0000\u008c\u0092\u0003\u0016\u000b\u0000\u008d\u0092\u0003"+
		"\u001a\r\u0000\u008e\u0092\u0003\u0014\n\u0000\u008f\u0092\u0003\u001e"+
		"\u000f\u0000\u0090\u0092\u0003\"\u0011\u0000\u0091\u0088\u0001\u0000\u0000"+
		"\u0000\u0091\u0089\u0001\u0000\u0000\u0000\u0091\u008a\u0001\u0000\u0000"+
		"\u0000\u0091\u008b\u0001\u0000\u0000\u0000\u0091\u008c\u0001\u0000\u0000"+
		"\u0000\u0091\u008d\u0001\u0000\u0000\u0000\u0091\u008e\u0001\u0000\u0000"+
		"\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0090\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u001d\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0005\u000b\u0000\u0000\u0096\u0097\u0005\f\u0000\u0000"+
		"\u0097\u0098\u0003(\u0014\u0000\u0098\u0099\u0005\n\u0000\u0000\u0099"+
		"\u009b\u0005\r\u0000\u0000\u009a\u009c\u0003\u001c\u000e\u0000\u009b\u009a"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009b"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u000e\u0000\u0000\u00a0\u001f"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\u000f\u0000\u0000\u00a2\u00a4"+
		"\u0005\r\u0000\u0000\u00a3\u00a5\u0003\u001c\u000e\u0000\u00a4\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a9\u0005\u000e\u0000\u0000\u00a9!\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0005\u0010\u0000\u0000\u00ab\u00ac\u0005\f\u0000"+
		"\u0000\u00ac\u00ad\u0003(\u0014\u0000\u00ad\u00ae\u0005\n\u0000\u0000"+
		"\u00ae\u00b0\u0005\r\u0000\u0000\u00af\u00b1\u0003\u001c\u000e\u0000\u00b0"+
		"\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b4\u00c1\u0005\u000e\u0000\u0000\u00b5"+
		"\u00b6\u0005\u0011\u0000\u0000\u00b6\u00b7\u0005\f\u0000\u0000\u00b7\u00b8"+
		"\u0003(\u0014\u0000\u00b8\u00b9\u0005\n\u0000\u0000\u00b9\u00bb\u0005"+
		"\r\u0000\u0000\u00ba\u00bc\u0003\u001c\u000e\u0000\u00bb\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0005\u000e\u0000\u0000\u00c0\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c1\u00b5\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c4\u0001\u0000\u0000\u0000\u00c3\u00c5\u0003 \u0010"+
		"\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c5#\u0001\u0000\u0000\u0000\u00c6\u00c7\u0003\u0006\u0003\u0000"+
		"\u00c7%\u0001\u0000\u0000\u0000\u00c8\u00c9\u0003\u0006\u0003\u0000\u00c9"+
		"\'\u0001\u0000\u0000\u0000\u00ca\u00cc\u0005\u0013\u0000\u0000\u00cb\u00ca"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00ce"+
		"\u0001\u0000\u0000\u0000\u00cd\u00cf\u0005\u0003\u0000\u0000\u00ce\u00cd"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d1\u0003$\u0012\u0000\u00d1\u00d2\u0005"+
		"\u0019\u0000\u0000\u00d2\u00d3\u0003&\u0013\u0000\u00d3)\u0001\u0000\u0000"+
		"\u0000\u00134<HPR^au\u0082\u0091\u0093\u009d\u00a6\u00b2\u00bd\u00c1\u00c4"+
		"\u00cb\u00ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}