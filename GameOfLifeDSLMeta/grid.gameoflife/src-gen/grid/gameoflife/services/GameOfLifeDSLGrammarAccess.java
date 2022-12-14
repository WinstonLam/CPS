/*
 * generated by Xtext 2.28.0
 */
package grid.gameoflife.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class GameOfLifeDSLGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class GridElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "grid.gameoflife.GameOfLifeDSL.Grid");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGridKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cCellsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cCellsCellParserRuleCall_2_0 = (RuleCall)cCellsAssignment_2.eContents().get(0);
		
		//Grid: 'Grid:' name = ID
		//    (cells += Cell)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Grid:' name = ID
		//   (cells += Cell)*
		public Group getGroup() { return cGroup; }
		
		//'Grid:'
		public Keyword getGridKeyword_0() { return cGridKeyword_0; }
		
		//name = ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//(cells += Cell)*
		public Assignment getCellsAssignment_2() { return cCellsAssignment_2; }
		
		//Cell
		public RuleCall getCellsCellParserRuleCall_2_0() { return cCellsCellParserRuleCall_2_0; }
	}
	public class CellElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "grid.gameoflife.GameOfLifeDSL.Cell");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRowKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cRowAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRowINTTerminalRuleCall_1_0 = (RuleCall)cRowAssignment_1.eContents().get(0);
		private final Keyword cColKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cColAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cColINTTerminalRuleCall_3_0 = (RuleCall)cColAssignment_3.eContents().get(0);
		private final Keyword cStateKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cStateAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cStateStateEnumRuleCall_5_0 = (RuleCall)cStateAssignment_5.eContents().get(0);
		
		//Cell: 'row:' row = INT
		//      'col:' col = INT
		//      'state:' state = State
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'row:' row = INT
		//     'col:' col = INT
		//     'state:' state = State
		public Group getGroup() { return cGroup; }
		
		//'row:'
		public Keyword getRowKeyword_0() { return cRowKeyword_0; }
		
		//row = INT
		public Assignment getRowAssignment_1() { return cRowAssignment_1; }
		
		//INT
		public RuleCall getRowINTTerminalRuleCall_1_0() { return cRowINTTerminalRuleCall_1_0; }
		
		//'col:'
		public Keyword getColKeyword_2() { return cColKeyword_2; }
		
		//col = INT
		public Assignment getColAssignment_3() { return cColAssignment_3; }
		
		//INT
		public RuleCall getColINTTerminalRuleCall_3_0() { return cColINTTerminalRuleCall_3_0; }
		
		//'state:'
		public Keyword getStateKeyword_4() { return cStateKeyword_4; }
		
		//state = State
		public Assignment getStateAssignment_5() { return cStateAssignment_5; }
		
		//State
		public RuleCall getStateStateEnumRuleCall_5_0() { return cStateStateEnumRuleCall_5_0; }
	}
	
	public class StateElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "grid.gameoflife.GameOfLifeDSL.State");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cDeadEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cDeadDeadKeyword_0_0 = (Keyword)cDeadEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cAliveEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cAliveAliveKeyword_1_0 = (Keyword)cAliveEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum State:
		//    dead = 'dead' |
		//    alive = 'alive'
		//;
		public EnumRule getRule() { return rule; }
		
		//dead = 'dead' |
		//alive = 'alive'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//dead = 'dead'
		public EnumLiteralDeclaration getDeadEnumLiteralDeclaration_0() { return cDeadEnumLiteralDeclaration_0; }
		
		//'dead'
		public Keyword getDeadDeadKeyword_0_0() { return cDeadDeadKeyword_0_0; }
		
		//alive = 'alive'
		public EnumLiteralDeclaration getAliveEnumLiteralDeclaration_1() { return cAliveEnumLiteralDeclaration_1; }
		
		//'alive'
		public Keyword getAliveAliveKeyword_1_0() { return cAliveAliveKeyword_1_0; }
	}
	public class OperatorElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "grid.gameoflife.GameOfLifeDSL.Operator");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cLTEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cLTLessThanSignKeyword_0_0 = (Keyword)cLTEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cEQEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cEQEqualsSignKeyword_1_0 = (Keyword)cEQEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cGTEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cGTGreaterThanSignKeyword_2_0 = (Keyword)cGTEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum Operator:
		//    LT = '<' |
		//    EQ = '=' |
		//    GT = '>'
		//;
		public EnumRule getRule() { return rule; }
		
		//LT = '<' |
		//EQ = '=' |
		//GT = '>'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//LT = '<'
		public EnumLiteralDeclaration getLTEnumLiteralDeclaration_0() { return cLTEnumLiteralDeclaration_0; }
		
		//'<'
		public Keyword getLTLessThanSignKeyword_0_0() { return cLTLessThanSignKeyword_0_0; }
		
		//EQ = '='
		public EnumLiteralDeclaration getEQEnumLiteralDeclaration_1() { return cEQEnumLiteralDeclaration_1; }
		
		//'='
		public Keyword getEQEqualsSignKeyword_1_0() { return cEQEqualsSignKeyword_1_0; }
		
		//GT = '>'
		public EnumLiteralDeclaration getGTEnumLiteralDeclaration_2() { return cGTEnumLiteralDeclaration_2; }
		
		//'>'
		public Keyword getGTGreaterThanSignKeyword_2_0() { return cGTGreaterThanSignKeyword_2_0; }
	}
	
	private final GridElements pGrid;
	private final CellElements pCell;
	private final StateElements eState;
	private final OperatorElements eOperator;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public GameOfLifeDSLGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pGrid = new GridElements();
		this.pCell = new CellElements();
		this.eState = new StateElements();
		this.eOperator = new OperatorElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("grid.gameoflife.GameOfLifeDSL".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Grid: 'Grid:' name = ID
	//    (cells += Cell)*
	//;
	public GridElements getGridAccess() {
		return pGrid;
	}
	
	public ParserRule getGridRule() {
		return getGridAccess().getRule();
	}
	
	//Cell: 'row:' row = INT
	//      'col:' col = INT
	//      'state:' state = State
	//;
	public CellElements getCellAccess() {
		return pCell;
	}
	
	public ParserRule getCellRule() {
		return getCellAccess().getRule();
	}
	
	//enum State:
	//    dead = 'dead' |
	//    alive = 'alive'
	//;
	public StateElements getStateAccess() {
		return eState;
	}
	
	public EnumRule getStateRule() {
		return getStateAccess().getRule();
	}
	
	//enum Operator:
	//    LT = '<' |
	//    EQ = '=' |
	//    GT = '>'
	//;
	public OperatorElements getOperatorAccess() {
		return eOperator;
	}
	
	public EnumRule getOperatorRule() {
		return getOperatorAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
