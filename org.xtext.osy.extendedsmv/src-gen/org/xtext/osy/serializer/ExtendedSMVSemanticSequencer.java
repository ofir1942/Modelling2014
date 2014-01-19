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
import org.xtext.osy.extendedSMV.BooleanPostTransaction;
import org.xtext.osy.extendedSMV.BooleanPrecondition;
import org.xtext.osy.extendedSMV.Comment;
import org.xtext.osy.extendedSMV.ConditionalPostTRansaction;
import org.xtext.osy.extendedSMV.ExtendedSMVPackage;
import org.xtext.osy.extendedSMV.IntegerAssignment;
import org.xtext.osy.extendedSMV.IntegerDeclarion;
import org.xtext.osy.extendedSMV.IntegerPostTransaction;
import org.xtext.osy.extendedSMV.IntegerPrecondition;
import org.xtext.osy.extendedSMV.Model;
import org.xtext.osy.extendedSMV.PostTransaction;
import org.xtext.osy.extendedSMV.StateAssignment;
import org.xtext.osy.extendedSMV.StatePostTransaction;
import org.xtext.osy.extendedSMV.StatePrecondition;
import org.xtext.osy.extendedSMV.StateVariableDeclaration;
import org.xtext.osy.extendedSMV.TransactionPrecondition;
import org.xtext.osy.extendedSMV.TransactionStatement;
import org.xtext.osy.extendedSMV.Transactions;
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
			case ExtendedSMVPackage.BOOLEAN_POST_TRANSACTION:
				if(context == grammarAccess.getBooleanPostTransactionRule() ||
				   context == grammarAccess.getPostTransactionStatementRule() ||
				   context == grammarAccess.getSimplePostTransactionRule()) {
					sequence_BooleanPostTransaction(context, (BooleanPostTransaction) semanticObject); 
					return; 
				}
				else break;
			case ExtendedSMVPackage.BOOLEAN_PRECONDITION:
				if(context == grammarAccess.getBooleanPreconditionRule() ||
				   context == grammarAccess.getPreconditionStatementRule()) {
					sequence_BooleanPrecondition(context, (BooleanPrecondition) semanticObject); 
					return; 
				}
				else break;
			case ExtendedSMVPackage.COMMENT:
				if(context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getCommentRule() ||
				   context == grammarAccess.getPreconditionStatementRule() ||
				   context == grammarAccess.getVariableDeclarationRule()) {
					sequence_Comment(context, (Comment) semanticObject); 
					return; 
				}
				else break;
			case ExtendedSMVPackage.CONDITIONAL_POST_TRANSACTION:
				if(context == grammarAccess.getConditionalPostTRansactionRule() ||
				   context == grammarAccess.getPostTransactionStatementRule()) {
					sequence_ConditionalPostTRansaction(context, (ConditionalPostTRansaction) semanticObject); 
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
			case ExtendedSMVPackage.INTEGER_POST_TRANSACTION:
				if(context == grammarAccess.getIntegerPostTransactionRule() ||
				   context == grammarAccess.getPostTransactionStatementRule() ||
				   context == grammarAccess.getSimplePostTransactionRule()) {
					sequence_IntegerPostTransaction(context, (IntegerPostTransaction) semanticObject); 
					return; 
				}
				else break;
			case ExtendedSMVPackage.INTEGER_PRECONDITION:
				if(context == grammarAccess.getIntegerPreconditionRule() ||
				   context == grammarAccess.getPreconditionStatementRule()) {
					sequence_IntegerPrecondition(context, (IntegerPrecondition) semanticObject); 
					return; 
				}
				else break;
			case ExtendedSMVPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case ExtendedSMVPackage.POST_TRANSACTION:
				if(context == grammarAccess.getPostTransactionRule()) {
					sequence_PostTransaction(context, (PostTransaction) semanticObject); 
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
			case ExtendedSMVPackage.STATE_POST_TRANSACTION:
				if(context == grammarAccess.getPostTransactionStatementRule() ||
				   context == grammarAccess.getSimplePostTransactionRule() ||
				   context == grammarAccess.getStatePostTransactionRule()) {
					sequence_StatePostTransaction(context, (StatePostTransaction) semanticObject); 
					return; 
				}
				else break;
			case ExtendedSMVPackage.STATE_PRECONDITION:
				if(context == grammarAccess.getPreconditionStatementRule() ||
				   context == grammarAccess.getStatePreconditionRule()) {
					sequence_StatePrecondition(context, (StatePrecondition) semanticObject); 
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
			case ExtendedSMVPackage.TRANSACTION_PRECONDITION:
				if(context == grammarAccess.getTransactionPreconditionRule()) {
					sequence_TransactionPrecondition(context, (TransactionPrecondition) semanticObject); 
					return; 
				}
				else break;
			case ExtendedSMVPackage.TRANSACTION_STATEMENT:
				if(context == grammarAccess.getTransactionStatementRule()) {
					sequence_TransactionStatement(context, (TransactionStatement) semanticObject); 
					return; 
				}
				else break;
			case ExtendedSMVPackage.TRANSACTIONS:
				if(context == grammarAccess.getSectionRule() ||
				   context == grammarAccess.getTransactionsRule()) {
					sequence_Transactions(context, (Transactions) semanticObject); 
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
			if(transientValues.isValueTransient(semanticObject, ExtendedSMVPackage.Literals.BOOLEAN_DECLARION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedSMVPackage.Literals.BOOLEAN_DECLARION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanDeclarionAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (var=[BooleanDeclarion|ID] value=BOOL)
	 */
	protected void sequence_BooleanPostTransaction(EObject context, BooleanPostTransaction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExtendedSMVPackage.Literals.BOOLEAN_POST_TRANSACTION__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedSMVPackage.Literals.BOOLEAN_POST_TRANSACTION__VAR));
			if(transientValues.isValueTransient(semanticObject, ExtendedSMVPackage.Literals.BOOLEAN_POST_TRANSACTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedSMVPackage.Literals.BOOLEAN_POST_TRANSACTION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanPostTransactionAccess().getVarBooleanDeclarionIDTerminalRuleCall_2_0_1(), semanticObject.getVar());
		feeder.accept(grammarAccess.getBooleanPostTransactionAccess().getValueBOOLParserRuleCall_5_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (var=[BooleanDeclarion|ID] value=BOOL)
	 */
	protected void sequence_BooleanPrecondition(EObject context, BooleanPrecondition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExtendedSMVPackage.Literals.BOOLEAN_PRECONDITION__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedSMVPackage.Literals.BOOLEAN_PRECONDITION__VAR));
			if(transientValues.isValueTransient(semanticObject, ExtendedSMVPackage.Literals.BOOLEAN_PRECONDITION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedSMVPackage.Literals.BOOLEAN_PRECONDITION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanPreconditionAccess().getVarBooleanDeclarionIDTerminalRuleCall_0_0_1(), semanticObject.getVar());
		feeder.accept(grammarAccess.getBooleanPreconditionAccess().getValueBOOLParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     comment=SMV_COMMENT
	 */
	protected void sequence_Comment(EObject context, Comment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExtendedSMVPackage.Literals.COMMENT__COMMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedSMVPackage.Literals.COMMENT__COMMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCommentAccess().getCommentSMV_COMMENTTerminalRuleCall_0(), semanticObject.getComment());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ConditionalPostTRansaction(EObject context, ConditionalPostTRansaction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExtendedSMVPackage.Literals.CONDITIONAL_POST_TRANSACTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedSMVPackage.Literals.CONDITIONAL_POST_TRANSACTION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConditionalPostTRansactionAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
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
			if(transientValues.isValueTransient(semanticObject, ExtendedSMVPackage.Literals.INTEGER_DECLARION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedSMVPackage.Literals.INTEGER_DECLARION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntegerDeclarionAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (var=[IntegerDeclarion|ID] value=INT)
	 */
	protected void sequence_IntegerPostTransaction(EObject context, IntegerPostTransaction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExtendedSMVPackage.Literals.INTEGER_POST_TRANSACTION__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedSMVPackage.Literals.INTEGER_POST_TRANSACTION__VAR));
			if(transientValues.isValueTransient(semanticObject, ExtendedSMVPackage.Literals.INTEGER_POST_TRANSACTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedSMVPackage.Literals.INTEGER_POST_TRANSACTION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntegerPostTransactionAccess().getVarIntegerDeclarionIDTerminalRuleCall_2_0_1(), semanticObject.getVar());
		feeder.accept(grammarAccess.getIntegerPostTransactionAccess().getValueINTTerminalRuleCall_5_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (var=[IntegerDeclarion|ID] value=INT)
	 */
	protected void sequence_IntegerPrecondition(EObject context, IntegerPrecondition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExtendedSMVPackage.Literals.INTEGER_PRECONDITION__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedSMVPackage.Literals.INTEGER_PRECONDITION__VAR));
			if(transientValues.isValueTransient(semanticObject, ExtendedSMVPackage.Literals.INTEGER_PRECONDITION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedSMVPackage.Literals.INTEGER_PRECONDITION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntegerPreconditionAccess().getVarIntegerDeclarionIDTerminalRuleCall_0_0_1(), semanticObject.getVar());
		feeder.accept(grammarAccess.getIntegerPreconditionAccess().getValueINTTerminalRuleCall_2_0(), semanticObject.getValue());
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
	 *     (postTransactions+=PostTransactionStatement (logicalOperator+=AND_OR postTransactions+=PostTransactionStatement)*)
	 */
	protected void sequence_PostTransaction(EObject context, PostTransaction semanticObject) {
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
	 *     (var=[StateVariableDeclaration|ID] value=ID)
	 */
	protected void sequence_StatePostTransaction(EObject context, StatePostTransaction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExtendedSMVPackage.Literals.STATE_POST_TRANSACTION__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedSMVPackage.Literals.STATE_POST_TRANSACTION__VAR));
			if(transientValues.isValueTransient(semanticObject, ExtendedSMVPackage.Literals.STATE_POST_TRANSACTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedSMVPackage.Literals.STATE_POST_TRANSACTION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStatePostTransactionAccess().getVarStateVariableDeclarationIDTerminalRuleCall_2_0_1(), semanticObject.getVar());
		feeder.accept(grammarAccess.getStatePostTransactionAccess().getValueIDTerminalRuleCall_5_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (var=[StateVariableDeclaration|ID] value=ID)
	 */
	protected void sequence_StatePrecondition(EObject context, StatePrecondition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExtendedSMVPackage.Literals.STATE_PRECONDITION__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedSMVPackage.Literals.STATE_PRECONDITION__VAR));
			if(transientValues.isValueTransient(semanticObject, ExtendedSMVPackage.Literals.STATE_PRECONDITION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedSMVPackage.Literals.STATE_PRECONDITION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStatePreconditionAccess().getVarStateVariableDeclarationIDTerminalRuleCall_0_0_1(), semanticObject.getVar());
		feeder.accept(grammarAccess.getStatePreconditionAccess().getValueIDTerminalRuleCall_2_0(), semanticObject.getValue());
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
	 *     (preconditions+=PreconditionStatement (logicalOperator+=AND_OR preconditions+=PreconditionStatement)*)
	 */
	protected void sequence_TransactionPrecondition(EObject context, TransactionPrecondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (precondition=TransactionPrecondition postTransaction=PostTransaction)
	 */
	protected void sequence_TransactionStatement(EObject context, TransactionStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExtendedSMVPackage.Literals.TRANSACTION_STATEMENT__PRECONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedSMVPackage.Literals.TRANSACTION_STATEMENT__PRECONDITION));
			if(transientValues.isValueTransient(semanticObject, ExtendedSMVPackage.Literals.TRANSACTION_STATEMENT__POST_TRANSACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedSMVPackage.Literals.TRANSACTION_STATEMENT__POST_TRANSACTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTransactionStatementAccess().getPreconditionTransactionPreconditionParserRuleCall_0_0(), semanticObject.getPrecondition());
		feeder.accept(grammarAccess.getTransactionStatementAccess().getPostTransactionPostTransactionParserRuleCall_2_0(), semanticObject.getPostTransaction());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     transaction+=TransactionStatement+
	 */
	protected void sequence_Transactions(EObject context, Transactions semanticObject) {
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
