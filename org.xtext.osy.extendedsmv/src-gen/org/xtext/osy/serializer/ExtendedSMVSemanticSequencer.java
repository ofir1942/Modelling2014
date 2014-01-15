package org.xtext.osy.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.osy.extendedSMV.Assignments;
import org.xtext.osy.extendedSMV.BooleanAssignment;
import org.xtext.osy.extendedSMV.BooleanDeclarion;
import org.xtext.osy.extendedSMV.ExtendedSMVPackage;
import org.xtext.osy.extendedSMV.IntegerAssignment;
import org.xtext.osy.extendedSMV.IntegerDeclarion;
import org.xtext.osy.extendedSMV.Model;
import org.xtext.osy.extendedSMV.StateAssignment;
import org.xtext.osy.extendedSMV.StateVariableDeclaration;
import org.xtext.osy.extendedSMV.VariablesSection;
import org.xtext.osy.services.ExtendedSMVGrammarAccess;

@SuppressWarnings("all")
public class ExtendedSMVSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ExtendedSMVGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ExtendedSMVPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ExtendedSMVPackage.ASSIGNMENTS:
				if(context == grammarAccess.getAssignmentsRule() ||
				   context == grammarAccess.getSectionRule()) {
					sequence_Assignments(context, (Assignments) semanticObject); 
					return; 
				}
				else break;
			case ExtendedSMVPackage.BOOLEAN_ASSIGNMENT:
				if(context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getBooleanAssignmentRule()) {
					sequence_BooleanAssignment(context, (BooleanAssignment) semanticObject); 
					return; 
				}
				else break;
			case ExtendedSMVPackage.BOOLEAN_DECLARION:
				if(context == grammarAccess.getBooleanDeclarionRule() ||
				   context == grammarAccess.getVariableDeclarationRule()) {
					sequence_BooleanDeclarion(context, (BooleanDeclarion) semanticObject); 
					return; 
				}
				else break;
			case ExtendedSMVPackage.INTEGER_ASSIGNMENT:
				if(context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getIntegerAssignmentRule()) {
					sequence_IntegerAssignment(context, (IntegerAssignment) semanticObject); 
					return; 
				}
				else break;
			case ExtendedSMVPackage.INTEGER_DECLARION:
				if(context == grammarAccess.getIntegerDeclarionRule() ||
				   context == grammarAccess.getVariableDeclarationRule()) {
					sequence_IntegerDeclarion(context, (IntegerDeclarion) semanticObject); 
					return; 
				}
				else break;
			case ExtendedSMVPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case ExtendedSMVPackage.STATE_ASSIGNMENT:
				if(context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getStateAssignmentRule()) {
					sequence_StateAssignment(context, (StateAssignment) semanticObject); 
					return; 
				}
				else break;
			case ExtendedSMVPackage.STATE_VARIABLE_DECLARATION:
				if(context == grammarAccess.getStateVariableDeclarationRule() ||
				   context == grammarAccess.getVariableDeclarationRule()) {
					sequence_StateVariableDeclaration(context, (StateVariableDeclaration) semanticObject); 
					return; 
				}
				else break;
			case ExtendedSMVPackage.VARIABLES_SECTION:
				if(context == grammarAccess.getSectionRule() ||
				   context == grammarAccess.getVariablesSectionRule()) {
					sequence_VariablesSection(context, (VariablesSection) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     assignments+=AssignmentExpression+
	 */
	protected void sequence_Assignments(EObject context, Assignments semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (var=[BooleanDeclarion|ID] value=BOOL)
	 */
	protected void sequence_BooleanAssignment(EObject context, BooleanAssignment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExtendedSMVPackage.Literals.BOOLEAN_ASSIGNMENT__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedSMVPackage.Literals.BOOLEAN_ASSIGNMENT__VAR));
			if(transientValues.isValueTransient(semanticObject, ExtendedSMVPackage.Literals.BOOLEAN_ASSIGNMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedSMVPackage.Literals.BOOLEAN_ASSIGNMENT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanAssignmentAccess().getVarBooleanDeclarionIDTerminalRuleCall_2_0_1(), semanticObject.getVar());
		feeder.accept(grammarAccess.getBooleanAssignmentAccess().getValueBOOLParserRuleCall_5_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_BooleanDeclarion(EObject context, BooleanDeclarion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExtendedSMVPackage.Literals.VARIABLE_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedSMVPackage.Literals.VARIABLE_DECLARATION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanDeclarionAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (var=[IntegerDeclarion|ID] value=INT)
	 */
	protected void sequence_IntegerAssignment(EObject context, IntegerAssignment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExtendedSMVPackage.Literals.INTEGER_ASSIGNMENT__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedSMVPackage.Literals.INTEGER_ASSIGNMENT__VAR));
			if(transientValues.isValueTransient(semanticObject, ExtendedSMVPackage.Literals.INTEGER_ASSIGNMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedSMVPackage.Literals.INTEGER_ASSIGNMENT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntegerAssignmentAccess().getVarIntegerDeclarionIDTerminalRuleCall_2_0_1(), semanticObject.getVar());
		feeder.accept(grammarAccess.getIntegerAssignmentAccess().getValueINTTerminalRuleCall_5_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_IntegerDeclarion(EObject context, IntegerDeclarion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExtendedSMVPackage.Literals.VARIABLE_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedSMVPackage.Literals.VARIABLE_DECLARATION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntegerDeclarionAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     sections+=Section*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (var=[StateVariableDeclaration|ID] value=ID)
	 */
	protected void sequence_StateAssignment(EObject context, StateAssignment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExtendedSMVPackage.Literals.STATE_ASSIGNMENT__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedSMVPackage.Literals.STATE_ASSIGNMENT__VAR));
			if(transientValues.isValueTransient(semanticObject, ExtendedSMVPackage.Literals.STATE_ASSIGNMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedSMVPackage.Literals.STATE_ASSIGNMENT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStateAssignmentAccess().getVarStateVariableDeclarationIDTerminalRuleCall_2_0_1(), semanticObject.getVar());
		feeder.accept(grammarAccess.getStateAssignmentAccess().getValueIDTerminalRuleCall_5_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID states+=ID states+=ID*)
	 */
	protected void sequence_StateVariableDeclaration(EObject context, StateVariableDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     variables+=VariableDeclaration+
	 */
	protected void sequence_VariablesSection(EObject context, VariablesSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
