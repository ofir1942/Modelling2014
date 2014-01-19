/**
 */
package org.xtext.osy.extendedSMV.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.osy.extendedSMV.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtendedSMVFactoryImpl extends EFactoryImpl implements ExtendedSMVFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ExtendedSMVFactory init()
  {
    try
    {
      ExtendedSMVFactory theExtendedSMVFactory = (ExtendedSMVFactory)EPackage.Registry.INSTANCE.getEFactory(ExtendedSMVPackage.eNS_URI);
      if (theExtendedSMVFactory != null)
      {
        return theExtendedSMVFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ExtendedSMVFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendedSMVFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ExtendedSMVPackage.MODEL: return createModel();
      case ExtendedSMVPackage.SECTION: return createSection();
      case ExtendedSMVPackage.COMMENT: return createComment();
      case ExtendedSMVPackage.VARIABLES_SECTION: return createVariablesSection();
      case ExtendedSMVPackage.ASSIGNMENTS: return createAssignments();
      case ExtendedSMVPackage.TRANSACTIONS: return createTransactions();
      case ExtendedSMVPackage.TRANSACTION_STATEMENT: return createTransactionStatement();
      case ExtendedSMVPackage.TRANSACTION_PRECONDITION: return createTransactionPrecondition();
      case ExtendedSMVPackage.PRECONDITION_STATEMENT: return createPreconditionStatement();
      case ExtendedSMVPackage.STATE_PRECONDITION: return createStatePrecondition();
      case ExtendedSMVPackage.BOOLEAN_PRECONDITION: return createBooleanPrecondition();
      case ExtendedSMVPackage.INTEGER_PRECONDITION: return createIntegerPrecondition();
      case ExtendedSMVPackage.POST_TRANSACTION: return createPostTransaction();
      case ExtendedSMVPackage.POST_TRANSACTION_STATEMENT: return createPostTransactionStatement();
      case ExtendedSMVPackage.SIMPLE_POST_TRANSACTION: return createSimplePostTransaction();
      case ExtendedSMVPackage.STATE_POST_TRANSACTION: return createStatePostTransaction();
      case ExtendedSMVPackage.BOOLEAN_POST_TRANSACTION: return createBooleanPostTransaction();
      case ExtendedSMVPackage.INTEGER_POST_TRANSACTION: return createIntegerPostTransaction();
      case ExtendedSMVPackage.CONDITIONAL_POST_TRANSACTION: return createConditionalPostTRansaction();
      case ExtendedSMVPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case ExtendedSMVPackage.INTEGER_DECLARION: return createIntegerDeclarion();
      case ExtendedSMVPackage.BOOLEAN_DECLARION: return createBooleanDeclarion();
      case ExtendedSMVPackage.STATE_VARIABLE_DECLARATION: return createStateVariableDeclaration();
      case ExtendedSMVPackage.ASSIGNMENT_EXPRESSION: return createAssignmentExpression();
      case ExtendedSMVPackage.BOOLEAN_ASSIGNMENT: return createBooleanAssignment();
      case ExtendedSMVPackage.INTEGER_ASSIGNMENT: return createIntegerAssignment();
      case ExtendedSMVPackage.STATE_ASSIGNMENT: return createStateAssignment();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Section createSection()
  {
    SectionImpl section = new SectionImpl();
    return section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comment createComment()
  {
    CommentImpl comment = new CommentImpl();
    return comment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariablesSection createVariablesSection()
  {
    VariablesSectionImpl variablesSection = new VariablesSectionImpl();
    return variablesSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignments createAssignments()
  {
    AssignmentsImpl assignments = new AssignmentsImpl();
    return assignments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transactions createTransactions()
  {
    TransactionsImpl transactions = new TransactionsImpl();
    return transactions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransactionStatement createTransactionStatement()
  {
    TransactionStatementImpl transactionStatement = new TransactionStatementImpl();
    return transactionStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransactionPrecondition createTransactionPrecondition()
  {
    TransactionPreconditionImpl transactionPrecondition = new TransactionPreconditionImpl();
    return transactionPrecondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreconditionStatement createPreconditionStatement()
  {
    PreconditionStatementImpl preconditionStatement = new PreconditionStatementImpl();
    return preconditionStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatePrecondition createStatePrecondition()
  {
    StatePreconditionImpl statePrecondition = new StatePreconditionImpl();
    return statePrecondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanPrecondition createBooleanPrecondition()
  {
    BooleanPreconditionImpl booleanPrecondition = new BooleanPreconditionImpl();
    return booleanPrecondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerPrecondition createIntegerPrecondition()
  {
    IntegerPreconditionImpl integerPrecondition = new IntegerPreconditionImpl();
    return integerPrecondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PostTransaction createPostTransaction()
  {
    PostTransactionImpl postTransaction = new PostTransactionImpl();
    return postTransaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PostTransactionStatement createPostTransactionStatement()
  {
    PostTransactionStatementImpl postTransactionStatement = new PostTransactionStatementImpl();
    return postTransactionStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimplePostTransaction createSimplePostTransaction()
  {
    SimplePostTransactionImpl simplePostTransaction = new SimplePostTransactionImpl();
    return simplePostTransaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatePostTransaction createStatePostTransaction()
  {
    StatePostTransactionImpl statePostTransaction = new StatePostTransactionImpl();
    return statePostTransaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanPostTransaction createBooleanPostTransaction()
  {
    BooleanPostTransactionImpl booleanPostTransaction = new BooleanPostTransactionImpl();
    return booleanPostTransaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerPostTransaction createIntegerPostTransaction()
  {
    IntegerPostTransactionImpl integerPostTransaction = new IntegerPostTransactionImpl();
    return integerPostTransaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalPostTRansaction createConditionalPostTRansaction()
  {
    ConditionalPostTRansactionImpl conditionalPostTRansaction = new ConditionalPostTRansactionImpl();
    return conditionalPostTRansaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration createVariableDeclaration()
  {
    VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerDeclarion createIntegerDeclarion()
  {
    IntegerDeclarionImpl integerDeclarion = new IntegerDeclarionImpl();
    return integerDeclarion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanDeclarion createBooleanDeclarion()
  {
    BooleanDeclarionImpl booleanDeclarion = new BooleanDeclarionImpl();
    return booleanDeclarion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateVariableDeclaration createStateVariableDeclaration()
  {
    StateVariableDeclarationImpl stateVariableDeclaration = new StateVariableDeclarationImpl();
    return stateVariableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignmentExpression createAssignmentExpression()
  {
    AssignmentExpressionImpl assignmentExpression = new AssignmentExpressionImpl();
    return assignmentExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanAssignment createBooleanAssignment()
  {
    BooleanAssignmentImpl booleanAssignment = new BooleanAssignmentImpl();
    return booleanAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerAssignment createIntegerAssignment()
  {
    IntegerAssignmentImpl integerAssignment = new IntegerAssignmentImpl();
    return integerAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateAssignment createStateAssignment()
  {
    StateAssignmentImpl stateAssignment = new StateAssignmentImpl();
    return stateAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendedSMVPackage getExtendedSMVPackage()
  {
    return (ExtendedSMVPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ExtendedSMVPackage getPackage()
  {
    return ExtendedSMVPackage.eINSTANCE;
  }

} //ExtendedSMVFactoryImpl
