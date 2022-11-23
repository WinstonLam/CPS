/*
 * generated by Xtext 2.28.0
 */
package grid.gameoflife.serializer;

import com.google.inject.Inject;
import grid.gameoflife.gameOfLifeDSL.Cell;
import grid.gameoflife.gameOfLifeDSL.GameOfLifeDSLPackage;
import grid.gameoflife.gameOfLifeDSL.Grid;
import grid.gameoflife.services.GameOfLifeDSLGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class GameOfLifeDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GameOfLifeDSLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GameOfLifeDSLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GameOfLifeDSLPackage.CELL:
				sequence_Cell(context, (Cell) semanticObject); 
				return; 
			case GameOfLifeDSLPackage.GRID:
				sequence_Grid(context, (Grid) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Cell returns Cell
	 *
	 * Constraint:
	 *     (row=INT col=INT state=State)
	 * </pre>
	 */
	protected void sequence_Cell(ISerializationContext context, Cell semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GameOfLifeDSLPackage.Literals.CELL__ROW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GameOfLifeDSLPackage.Literals.CELL__ROW));
			if (transientValues.isValueTransient(semanticObject, GameOfLifeDSLPackage.Literals.CELL__COL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GameOfLifeDSLPackage.Literals.CELL__COL));
			if (transientValues.isValueTransient(semanticObject, GameOfLifeDSLPackage.Literals.CELL__STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GameOfLifeDSLPackage.Literals.CELL__STATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCellAccess().getRowINTTerminalRuleCall_1_0(), semanticObject.getRow());
		feeder.accept(grammarAccess.getCellAccess().getColINTTerminalRuleCall_3_0(), semanticObject.getCol());
		feeder.accept(grammarAccess.getCellAccess().getStateStateEnumRuleCall_5_0(), semanticObject.getState());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Grid returns Grid
	 *
	 * Constraint:
	 *     (name=ID cells+=Cell*)
	 * </pre>
	 */
	protected void sequence_Grid(ISerializationContext context, Grid semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}