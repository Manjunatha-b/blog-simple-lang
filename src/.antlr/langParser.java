// Generated from /Users/manjunatha/Documents/Research/GoAntlr/src/lang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class langParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OpenParen=1, CloseParen=2, Plus=3, Minus=4, Multiply=5, Divide=6, WhiteSpaces=7, 
		DecimalLiteral=8;
	public static final int
		RULE_unit = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"unit"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OpenParen", "CloseParen", "Plus", "Minus", "Multiply", "Divide", 
			"WhiteSpaces", "DecimalLiteral"
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
	public String getGrammarFileName() { return "lang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public langParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnitContext extends ParserRuleContext {
		public UnitContext left;
		public UnitContext single;
		public UnitContext right;
		public TerminalNode OpenParen() { return getToken(langParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(langParser.CloseParen, 0); }
		public List<UnitContext> unit() {
			return getRuleContexts(UnitContext.class);
		}
		public UnitContext unit(int i) {
			return getRuleContext(UnitContext.class,i);
		}
		public TerminalNode Divide() { return getToken(langParser.Divide, 0); }
		public TerminalNode Multiply() { return getToken(langParser.Multiply, 0); }
		public TerminalNode Plus() { return getToken(langParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(langParser.Minus, 0); }
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
	}

	public final UnitContext unit() throws RecognitionException {
		return unit(0);
	}

	private UnitContext unit(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		UnitContext _localctx = new UnitContext(_ctx, _parentState);
		UnitContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_unit, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3);
			match(OpenParen);
			setState(4);
			((UnitContext)_localctx).single = unit(0);
			setState(5);
			match(CloseParen);
			}
			_ctx.stop = _input.LT(-1);
			setState(21);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(19);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(7);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						{
						setState(8);
						match(Divide);
						}
						setState(9);
						((UnitContext)_localctx).right = unit(5);
						}
						break;
					case 2:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(10);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						{
						setState(11);
						match(Multiply);
						}
						setState(12);
						((UnitContext)_localctx).right = unit(4);
						}
						break;
					case 3:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(13);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						{
						setState(14);
						match(Plus);
						}
						setState(15);
						((UnitContext)_localctx).right = unit(3);
						}
						break;
					case 4:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(16);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						{
						setState(17);
						match(Minus);
						}
						setState(18);
						((UnitContext)_localctx).right = unit(2);
						}
						break;
					}
					} 
				}
				setState(23);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return unit_sempred((UnitContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean unit_sempred(UnitContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\b\u0019\u0002\u0000\u0007\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000"+
		"\u0017\t\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u001b"+
		"\u0000\u0002\u0001\u0000\u0000\u0000\u0002\u0003\u0006\u0000\uffff\uffff"+
		"\u0000\u0003\u0004\u0005\u0001\u0000\u0000\u0004\u0005\u0003\u0000\u0000"+
		"\u0000\u0005\u0006\u0005\u0002\u0000\u0000\u0006\u0015\u0001\u0000\u0000"+
		"\u0000\u0007\b\n\u0004\u0000\u0000\b\t\u0005\u0006\u0000\u0000\t\u0014"+
		"\u0003\u0000\u0000\u0005\n\u000b\n\u0003\u0000\u0000\u000b\f\u0005\u0005"+
		"\u0000\u0000\f\u0014\u0003\u0000\u0000\u0004\r\u000e\n\u0002\u0000\u0000"+
		"\u000e\u000f\u0005\u0003\u0000\u0000\u000f\u0014\u0003\u0000\u0000\u0003"+
		"\u0010\u0011\n\u0001\u0000\u0000\u0011\u0012\u0005\u0004\u0000\u0000\u0012"+
		"\u0014\u0003\u0000\u0000\u0002\u0013\u0007\u0001\u0000\u0000\u0000\u0013"+
		"\n\u0001\u0000\u0000\u0000\u0013\r\u0001\u0000\u0000\u0000\u0013\u0010"+
		"\u0001\u0000\u0000\u0000\u0014\u0017\u0001\u0000\u0000\u0000\u0015\u0013"+
		"\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0001"+
		"\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0002\u0013"+
		"\u0015";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}