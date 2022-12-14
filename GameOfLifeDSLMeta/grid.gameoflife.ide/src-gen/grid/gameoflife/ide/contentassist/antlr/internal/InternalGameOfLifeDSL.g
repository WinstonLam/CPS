/*
 * generated by Xtext 2.28.0
 */
grammar InternalGameOfLifeDSL;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package grid.gameoflife.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package grid.gameoflife.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import grid.gameoflife.services.GameOfLifeDSLGrammarAccess;

}
@parser::members {
	private GameOfLifeDSLGrammarAccess grammarAccess;

	public void setGrammarAccess(GameOfLifeDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleGrid
entryRuleGrid
:
{ before(grammarAccess.getGridRule()); }
	 ruleGrid
{ after(grammarAccess.getGridRule()); } 
	 EOF 
;

// Rule Grid
ruleGrid 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGridAccess().getGroup()); }
		(rule__Grid__Group__0)
		{ after(grammarAccess.getGridAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCell
entryRuleCell
:
{ before(grammarAccess.getCellRule()); }
	 ruleCell
{ after(grammarAccess.getCellRule()); } 
	 EOF 
;

// Rule Cell
ruleCell 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCellAccess().getGroup()); }
		(rule__Cell__Group__0)
		{ after(grammarAccess.getCellAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule State
ruleState
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getAlternatives()); }
		(rule__State__Alternatives)
		{ after(grammarAccess.getStateAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getDeadEnumLiteralDeclaration_0()); }
		('dead')
		{ after(grammarAccess.getStateAccess().getDeadEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getStateAccess().getAliveEnumLiteralDeclaration_1()); }
		('alive')
		{ after(grammarAccess.getStateAccess().getAliveEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grid__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grid__Group__0__Impl
	rule__Grid__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Grid__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGridAccess().getGridKeyword_0()); }
	'Grid:'
	{ after(grammarAccess.getGridAccess().getGridKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grid__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grid__Group__1__Impl
	rule__Grid__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Grid__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGridAccess().getNameAssignment_1()); }
	(rule__Grid__NameAssignment_1)
	{ after(grammarAccess.getGridAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grid__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grid__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Grid__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGridAccess().getCellsAssignment_2()); }
	(rule__Grid__CellsAssignment_2)*
	{ after(grammarAccess.getGridAccess().getCellsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Cell__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group__0__Impl
	rule__Cell__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getRowKeyword_0()); }
	'row:'
	{ after(grammarAccess.getCellAccess().getRowKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group__1__Impl
	rule__Cell__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getRowAssignment_1()); }
	(rule__Cell__RowAssignment_1)
	{ after(grammarAccess.getCellAccess().getRowAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group__2__Impl
	rule__Cell__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getColKeyword_2()); }
	'col:'
	{ after(grammarAccess.getCellAccess().getColKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group__3__Impl
	rule__Cell__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getColAssignment_3()); }
	(rule__Cell__ColAssignment_3)
	{ after(grammarAccess.getCellAccess().getColAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group__4__Impl
	rule__Cell__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getStateKeyword_4()); }
	'state:'
	{ after(grammarAccess.getCellAccess().getStateKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getStateAssignment_5()); }
	(rule__Cell__StateAssignment_5)
	{ after(grammarAccess.getCellAccess().getStateAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Grid__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGridAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getGridAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grid__CellsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGridAccess().getCellsCellParserRuleCall_2_0()); }
		ruleCell
		{ after(grammarAccess.getGridAccess().getCellsCellParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__RowAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCellAccess().getRowINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getCellAccess().getRowINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__ColAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCellAccess().getColINTTerminalRuleCall_3_0()); }
		RULE_INT
		{ after(grammarAccess.getCellAccess().getColINTTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__StateAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCellAccess().getStateStateEnumRuleCall_5_0()); }
		ruleState
		{ after(grammarAccess.getCellAccess().getStateStateEnumRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
