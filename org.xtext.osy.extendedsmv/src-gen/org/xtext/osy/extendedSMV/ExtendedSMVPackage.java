/**
 */
package org.xtext.osy.extendedSMV;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.osy.extendedSMV.ExtendedSMVFactory
 * @model kind="package"
 * @generated
 */
public interface ExtendedSMVPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "extendedSMV";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/osy/ExtendedSMV";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "extendedSMV";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ExtendedSMVPackage eINSTANCE = org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.ModelImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__SECTIONS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.SectionImpl <em>Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.SectionImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getSection()
   * @generated
   */
  int SECTION = 1;

  /**
   * The number of structural features of the '<em>Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.PreconditionStatementImpl <em>Precondition Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.PreconditionStatementImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getPreconditionStatement()
   * @generated
   */
  int PRECONDITION_STATEMENT = 8;

  /**
   * The number of structural features of the '<em>Precondition Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECONDITION_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.CommentImpl <em>Comment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.CommentImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getComment()
   * @generated
   */
  int COMMENT = 2;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT__COMMENT = PRECONDITION_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Comment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT_FEATURE_COUNT = PRECONDITION_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.VariablesSectionImpl <em>Variables Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.VariablesSectionImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getVariablesSection()
   * @generated
   */
  int VARIABLES_SECTION = 3;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_SECTION__VARIABLES = SECTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variables Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_SECTION_FEATURE_COUNT = SECTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.AssignmentsImpl <em>Assignments</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.AssignmentsImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getAssignments()
   * @generated
   */
  int ASSIGNMENTS = 4;

  /**
   * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENTS__ASSIGNMENTS = SECTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Assignments</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENTS_FEATURE_COUNT = SECTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.TransactionsImpl <em>Transactions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.TransactionsImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getTransactions()
   * @generated
   */
  int TRANSACTIONS = 5;

  /**
   * The feature id for the '<em><b>Transaction</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTIONS__TRANSACTION = SECTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Transactions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTIONS_FEATURE_COUNT = SECTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.TransactionStatementImpl <em>Transaction Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.TransactionStatementImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getTransactionStatement()
   * @generated
   */
  int TRANSACTION_STATEMENT = 6;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION_STATEMENT__PRECONDITION = 0;

  /**
   * The feature id for the '<em><b>Post Transaction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION_STATEMENT__POST_TRANSACTION = 1;

  /**
   * The number of structural features of the '<em>Transaction Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.TransactionPreconditionImpl <em>Transaction Precondition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.TransactionPreconditionImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getTransactionPrecondition()
   * @generated
   */
  int TRANSACTION_PRECONDITION = 7;

  /**
   * The feature id for the '<em><b>Preconditions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION_PRECONDITION__PRECONDITIONS = 0;

  /**
   * The feature id for the '<em><b>Logical Operator</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION_PRECONDITION__LOGICAL_OPERATOR = 1;

  /**
   * The number of structural features of the '<em>Transaction Precondition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION_PRECONDITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.StatePreconditionImpl <em>State Precondition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.StatePreconditionImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getStatePrecondition()
   * @generated
   */
  int STATE_PRECONDITION = 9;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_PRECONDITION__VAR = PRECONDITION_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_PRECONDITION__VALUE = PRECONDITION_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>State Precondition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_PRECONDITION_FEATURE_COUNT = PRECONDITION_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.BooleanPreconditionImpl <em>Boolean Precondition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.BooleanPreconditionImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getBooleanPrecondition()
   * @generated
   */
  int BOOLEAN_PRECONDITION = 10;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_PRECONDITION__VAR = PRECONDITION_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_PRECONDITION__VALUE = PRECONDITION_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Boolean Precondition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_PRECONDITION_FEATURE_COUNT = PRECONDITION_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.IntegerPreconditionImpl <em>Integer Precondition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.IntegerPreconditionImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getIntegerPrecondition()
   * @generated
   */
  int INTEGER_PRECONDITION = 11;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_PRECONDITION__VAR = PRECONDITION_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_PRECONDITION__VALUE = PRECONDITION_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Integer Precondition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_PRECONDITION_FEATURE_COUNT = PRECONDITION_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.PostTransactionImpl <em>Post Transaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.PostTransactionImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getPostTransaction()
   * @generated
   */
  int POST_TRANSACTION = 12;

  /**
   * The feature id for the '<em><b>Post Transactions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_TRANSACTION__POST_TRANSACTIONS = 0;

  /**
   * The feature id for the '<em><b>Logical Operator</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_TRANSACTION__LOGICAL_OPERATOR = 1;

  /**
   * The number of structural features of the '<em>Post Transaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_TRANSACTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.PostTransactionStatementImpl <em>Post Transaction Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.PostTransactionStatementImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getPostTransactionStatement()
   * @generated
   */
  int POST_TRANSACTION_STATEMENT = 13;

  /**
   * The number of structural features of the '<em>Post Transaction Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_TRANSACTION_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.SimplePostTransactionImpl <em>Simple Post Transaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.SimplePostTransactionImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getSimplePostTransaction()
   * @generated
   */
  int SIMPLE_POST_TRANSACTION = 14;

  /**
   * The number of structural features of the '<em>Simple Post Transaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_POST_TRANSACTION_FEATURE_COUNT = POST_TRANSACTION_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.StatePostTransactionImpl <em>State Post Transaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.StatePostTransactionImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getStatePostTransaction()
   * @generated
   */
  int STATE_POST_TRANSACTION = 15;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_POST_TRANSACTION__VAR = SIMPLE_POST_TRANSACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_POST_TRANSACTION__VALUE = SIMPLE_POST_TRANSACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>State Post Transaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_POST_TRANSACTION_FEATURE_COUNT = SIMPLE_POST_TRANSACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.BooleanPostTransactionImpl <em>Boolean Post Transaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.BooleanPostTransactionImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getBooleanPostTransaction()
   * @generated
   */
  int BOOLEAN_POST_TRANSACTION = 16;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_POST_TRANSACTION__VAR = SIMPLE_POST_TRANSACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_POST_TRANSACTION__VALUE = SIMPLE_POST_TRANSACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Boolean Post Transaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_POST_TRANSACTION_FEATURE_COUNT = SIMPLE_POST_TRANSACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.IntegerPostTransactionImpl <em>Integer Post Transaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.IntegerPostTransactionImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getIntegerPostTransaction()
   * @generated
   */
  int INTEGER_POST_TRANSACTION = 17;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_POST_TRANSACTION__VAR = SIMPLE_POST_TRANSACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_POST_TRANSACTION__VALUE = SIMPLE_POST_TRANSACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Integer Post Transaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_POST_TRANSACTION_FEATURE_COUNT = SIMPLE_POST_TRANSACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.ConditionalPostTRansactionImpl <em>Conditional Post TRansaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.ConditionalPostTRansactionImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getConditionalPostTRansaction()
   * @generated
   */
  int CONDITIONAL_POST_TRANSACTION = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_POST_TRANSACTION__NAME = POST_TRANSACTION_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Conditional Post TRansaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_POST_TRANSACTION_FEATURE_COUNT = POST_TRANSACTION_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.VariableDeclarationImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getVariableDeclaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 19;

  /**
   * The number of structural features of the '<em>Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.IntegerDeclarionImpl <em>Integer Declarion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.IntegerDeclarionImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getIntegerDeclarion()
   * @generated
   */
  int INTEGER_DECLARION = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_DECLARION__NAME = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Declarion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_DECLARION_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.BooleanDeclarionImpl <em>Boolean Declarion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.BooleanDeclarionImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getBooleanDeclarion()
   * @generated
   */
  int BOOLEAN_DECLARION = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_DECLARION__NAME = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Declarion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_DECLARION_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.StateVariableDeclarationImpl <em>State Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.StateVariableDeclarationImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getStateVariableDeclaration()
   * @generated
   */
  int STATE_VARIABLE_DECLARATION = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_VARIABLE_DECLARATION__NAME = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>States</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_VARIABLE_DECLARATION__STATES = VARIABLE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>State Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_VARIABLE_DECLARATION_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.AssignmentExpressionImpl <em>Assignment Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.AssignmentExpressionImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getAssignmentExpression()
   * @generated
   */
  int ASSIGNMENT_EXPRESSION = 23;

  /**
   * The number of structural features of the '<em>Assignment Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.BooleanAssignmentImpl <em>Boolean Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.BooleanAssignmentImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getBooleanAssignment()
   * @generated
   */
  int BOOLEAN_ASSIGNMENT = 24;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_ASSIGNMENT__VAR = ASSIGNMENT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_ASSIGNMENT__VALUE = ASSIGNMENT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Boolean Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_ASSIGNMENT_FEATURE_COUNT = ASSIGNMENT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.IntegerAssignmentImpl <em>Integer Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.IntegerAssignmentImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getIntegerAssignment()
   * @generated
   */
  int INTEGER_ASSIGNMENT = 25;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ASSIGNMENT__VAR = ASSIGNMENT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ASSIGNMENT__VALUE = ASSIGNMENT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Integer Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ASSIGNMENT_FEATURE_COUNT = ASSIGNMENT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.StateAssignmentImpl <em>State Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.StateAssignmentImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getStateAssignment()
   * @generated
   */
  int STATE_ASSIGNMENT = 26;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_ASSIGNMENT__VAR = ASSIGNMENT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_ASSIGNMENT__VALUE = ASSIGNMENT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>State Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_ASSIGNMENT_FEATURE_COUNT = ASSIGNMENT_EXPRESSION_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.osy.extendedSMV.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.osy.extendedSMV.Model#getSections <em>Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sections</em>'.
   * @see org.xtext.osy.extendedSMV.Model#getSections()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Sections();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.Section <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Section</em>'.
   * @see org.xtext.osy.extendedSMV.Section
   * @generated
   */
  EClass getSection();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.Comment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comment</em>'.
   * @see org.xtext.osy.extendedSMV.Comment
   * @generated
   */
  EClass getComment();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.osy.extendedSMV.Comment#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see org.xtext.osy.extendedSMV.Comment#getComment()
   * @see #getComment()
   * @generated
   */
  EAttribute getComment_Comment();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.VariablesSection <em>Variables Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variables Section</em>'.
   * @see org.xtext.osy.extendedSMV.VariablesSection
   * @generated
   */
  EClass getVariablesSection();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.osy.extendedSMV.VariablesSection#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see org.xtext.osy.extendedSMV.VariablesSection#getVariables()
   * @see #getVariablesSection()
   * @generated
   */
  EReference getVariablesSection_Variables();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.Assignments <em>Assignments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignments</em>'.
   * @see org.xtext.osy.extendedSMV.Assignments
   * @generated
   */
  EClass getAssignments();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.osy.extendedSMV.Assignments#getAssignments <em>Assignments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assignments</em>'.
   * @see org.xtext.osy.extendedSMV.Assignments#getAssignments()
   * @see #getAssignments()
   * @generated
   */
  EReference getAssignments_Assignments();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.Transactions <em>Transactions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transactions</em>'.
   * @see org.xtext.osy.extendedSMV.Transactions
   * @generated
   */
  EClass getTransactions();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.osy.extendedSMV.Transactions#getTransaction <em>Transaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transaction</em>'.
   * @see org.xtext.osy.extendedSMV.Transactions#getTransaction()
   * @see #getTransactions()
   * @generated
   */
  EReference getTransactions_Transaction();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.TransactionStatement <em>Transaction Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transaction Statement</em>'.
   * @see org.xtext.osy.extendedSMV.TransactionStatement
   * @generated
   */
  EClass getTransactionStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.osy.extendedSMV.TransactionStatement#getPrecondition <em>Precondition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Precondition</em>'.
   * @see org.xtext.osy.extendedSMV.TransactionStatement#getPrecondition()
   * @see #getTransactionStatement()
   * @generated
   */
  EReference getTransactionStatement_Precondition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.osy.extendedSMV.TransactionStatement#getPostTransaction <em>Post Transaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Post Transaction</em>'.
   * @see org.xtext.osy.extendedSMV.TransactionStatement#getPostTransaction()
   * @see #getTransactionStatement()
   * @generated
   */
  EReference getTransactionStatement_PostTransaction();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.TransactionPrecondition <em>Transaction Precondition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transaction Precondition</em>'.
   * @see org.xtext.osy.extendedSMV.TransactionPrecondition
   * @generated
   */
  EClass getTransactionPrecondition();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.osy.extendedSMV.TransactionPrecondition#getPreconditions <em>Preconditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Preconditions</em>'.
   * @see org.xtext.osy.extendedSMV.TransactionPrecondition#getPreconditions()
   * @see #getTransactionPrecondition()
   * @generated
   */
  EReference getTransactionPrecondition_Preconditions();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.osy.extendedSMV.TransactionPrecondition#getLogicalOperator <em>Logical Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Logical Operator</em>'.
   * @see org.xtext.osy.extendedSMV.TransactionPrecondition#getLogicalOperator()
   * @see #getTransactionPrecondition()
   * @generated
   */
  EAttribute getTransactionPrecondition_LogicalOperator();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.PreconditionStatement <em>Precondition Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Precondition Statement</em>'.
   * @see org.xtext.osy.extendedSMV.PreconditionStatement
   * @generated
   */
  EClass getPreconditionStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.StatePrecondition <em>State Precondition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Precondition</em>'.
   * @see org.xtext.osy.extendedSMV.StatePrecondition
   * @generated
   */
  EClass getStatePrecondition();

  /**
   * Returns the meta object for the reference '{@link org.xtext.osy.extendedSMV.StatePrecondition#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see org.xtext.osy.extendedSMV.StatePrecondition#getVar()
   * @see #getStatePrecondition()
   * @generated
   */
  EReference getStatePrecondition_Var();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.osy.extendedSMV.StatePrecondition#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.osy.extendedSMV.StatePrecondition#getValue()
   * @see #getStatePrecondition()
   * @generated
   */
  EAttribute getStatePrecondition_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.BooleanPrecondition <em>Boolean Precondition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Precondition</em>'.
   * @see org.xtext.osy.extendedSMV.BooleanPrecondition
   * @generated
   */
  EClass getBooleanPrecondition();

  /**
   * Returns the meta object for the reference '{@link org.xtext.osy.extendedSMV.BooleanPrecondition#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see org.xtext.osy.extendedSMV.BooleanPrecondition#getVar()
   * @see #getBooleanPrecondition()
   * @generated
   */
  EReference getBooleanPrecondition_Var();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.osy.extendedSMV.BooleanPrecondition#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.osy.extendedSMV.BooleanPrecondition#getValue()
   * @see #getBooleanPrecondition()
   * @generated
   */
  EAttribute getBooleanPrecondition_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.IntegerPrecondition <em>Integer Precondition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Precondition</em>'.
   * @see org.xtext.osy.extendedSMV.IntegerPrecondition
   * @generated
   */
  EClass getIntegerPrecondition();

  /**
   * Returns the meta object for the reference '{@link org.xtext.osy.extendedSMV.IntegerPrecondition#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see org.xtext.osy.extendedSMV.IntegerPrecondition#getVar()
   * @see #getIntegerPrecondition()
   * @generated
   */
  EReference getIntegerPrecondition_Var();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.osy.extendedSMV.IntegerPrecondition#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.osy.extendedSMV.IntegerPrecondition#getValue()
   * @see #getIntegerPrecondition()
   * @generated
   */
  EAttribute getIntegerPrecondition_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.PostTransaction <em>Post Transaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Post Transaction</em>'.
   * @see org.xtext.osy.extendedSMV.PostTransaction
   * @generated
   */
  EClass getPostTransaction();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.osy.extendedSMV.PostTransaction#getPostTransactions <em>Post Transactions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Post Transactions</em>'.
   * @see org.xtext.osy.extendedSMV.PostTransaction#getPostTransactions()
   * @see #getPostTransaction()
   * @generated
   */
  EReference getPostTransaction_PostTransactions();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.osy.extendedSMV.PostTransaction#getLogicalOperator <em>Logical Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Logical Operator</em>'.
   * @see org.xtext.osy.extendedSMV.PostTransaction#getLogicalOperator()
   * @see #getPostTransaction()
   * @generated
   */
  EAttribute getPostTransaction_LogicalOperator();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.PostTransactionStatement <em>Post Transaction Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Post Transaction Statement</em>'.
   * @see org.xtext.osy.extendedSMV.PostTransactionStatement
   * @generated
   */
  EClass getPostTransactionStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.SimplePostTransaction <em>Simple Post Transaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Post Transaction</em>'.
   * @see org.xtext.osy.extendedSMV.SimplePostTransaction
   * @generated
   */
  EClass getSimplePostTransaction();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.StatePostTransaction <em>State Post Transaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Post Transaction</em>'.
   * @see org.xtext.osy.extendedSMV.StatePostTransaction
   * @generated
   */
  EClass getStatePostTransaction();

  /**
   * Returns the meta object for the reference '{@link org.xtext.osy.extendedSMV.StatePostTransaction#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see org.xtext.osy.extendedSMV.StatePostTransaction#getVar()
   * @see #getStatePostTransaction()
   * @generated
   */
  EReference getStatePostTransaction_Var();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.osy.extendedSMV.StatePostTransaction#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.osy.extendedSMV.StatePostTransaction#getValue()
   * @see #getStatePostTransaction()
   * @generated
   */
  EAttribute getStatePostTransaction_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.BooleanPostTransaction <em>Boolean Post Transaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Post Transaction</em>'.
   * @see org.xtext.osy.extendedSMV.BooleanPostTransaction
   * @generated
   */
  EClass getBooleanPostTransaction();

  /**
   * Returns the meta object for the reference '{@link org.xtext.osy.extendedSMV.BooleanPostTransaction#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see org.xtext.osy.extendedSMV.BooleanPostTransaction#getVar()
   * @see #getBooleanPostTransaction()
   * @generated
   */
  EReference getBooleanPostTransaction_Var();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.osy.extendedSMV.BooleanPostTransaction#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.osy.extendedSMV.BooleanPostTransaction#getValue()
   * @see #getBooleanPostTransaction()
   * @generated
   */
  EAttribute getBooleanPostTransaction_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.IntegerPostTransaction <em>Integer Post Transaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Post Transaction</em>'.
   * @see org.xtext.osy.extendedSMV.IntegerPostTransaction
   * @generated
   */
  EClass getIntegerPostTransaction();

  /**
   * Returns the meta object for the reference '{@link org.xtext.osy.extendedSMV.IntegerPostTransaction#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see org.xtext.osy.extendedSMV.IntegerPostTransaction#getVar()
   * @see #getIntegerPostTransaction()
   * @generated
   */
  EReference getIntegerPostTransaction_Var();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.osy.extendedSMV.IntegerPostTransaction#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.osy.extendedSMV.IntegerPostTransaction#getValue()
   * @see #getIntegerPostTransaction()
   * @generated
   */
  EAttribute getIntegerPostTransaction_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.ConditionalPostTRansaction <em>Conditional Post TRansaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional Post TRansaction</em>'.
   * @see org.xtext.osy.extendedSMV.ConditionalPostTRansaction
   * @generated
   */
  EClass getConditionalPostTRansaction();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.osy.extendedSMV.ConditionalPostTRansaction#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.osy.extendedSMV.ConditionalPostTRansaction#getName()
   * @see #getConditionalPostTRansaction()
   * @generated
   */
  EAttribute getConditionalPostTRansaction_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Declaration</em>'.
   * @see org.xtext.osy.extendedSMV.VariableDeclaration
   * @generated
   */
  EClass getVariableDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.IntegerDeclarion <em>Integer Declarion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Declarion</em>'.
   * @see org.xtext.osy.extendedSMV.IntegerDeclarion
   * @generated
   */
  EClass getIntegerDeclarion();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.osy.extendedSMV.IntegerDeclarion#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.osy.extendedSMV.IntegerDeclarion#getName()
   * @see #getIntegerDeclarion()
   * @generated
   */
  EAttribute getIntegerDeclarion_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.BooleanDeclarion <em>Boolean Declarion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Declarion</em>'.
   * @see org.xtext.osy.extendedSMV.BooleanDeclarion
   * @generated
   */
  EClass getBooleanDeclarion();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.osy.extendedSMV.BooleanDeclarion#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.osy.extendedSMV.BooleanDeclarion#getName()
   * @see #getBooleanDeclarion()
   * @generated
   */
  EAttribute getBooleanDeclarion_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.StateVariableDeclaration <em>State Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Variable Declaration</em>'.
   * @see org.xtext.osy.extendedSMV.StateVariableDeclaration
   * @generated
   */
  EClass getStateVariableDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.osy.extendedSMV.StateVariableDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.osy.extendedSMV.StateVariableDeclaration#getName()
   * @see #getStateVariableDeclaration()
   * @generated
   */
  EAttribute getStateVariableDeclaration_Name();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.osy.extendedSMV.StateVariableDeclaration#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>States</em>'.
   * @see org.xtext.osy.extendedSMV.StateVariableDeclaration#getStates()
   * @see #getStateVariableDeclaration()
   * @generated
   */
  EAttribute getStateVariableDeclaration_States();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.AssignmentExpression <em>Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Expression</em>'.
   * @see org.xtext.osy.extendedSMV.AssignmentExpression
   * @generated
   */
  EClass getAssignmentExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.BooleanAssignment <em>Boolean Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Assignment</em>'.
   * @see org.xtext.osy.extendedSMV.BooleanAssignment
   * @generated
   */
  EClass getBooleanAssignment();

  /**
   * Returns the meta object for the reference '{@link org.xtext.osy.extendedSMV.BooleanAssignment#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see org.xtext.osy.extendedSMV.BooleanAssignment#getVar()
   * @see #getBooleanAssignment()
   * @generated
   */
  EReference getBooleanAssignment_Var();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.osy.extendedSMV.BooleanAssignment#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.osy.extendedSMV.BooleanAssignment#getValue()
   * @see #getBooleanAssignment()
   * @generated
   */
  EAttribute getBooleanAssignment_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.IntegerAssignment <em>Integer Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Assignment</em>'.
   * @see org.xtext.osy.extendedSMV.IntegerAssignment
   * @generated
   */
  EClass getIntegerAssignment();

  /**
   * Returns the meta object for the reference '{@link org.xtext.osy.extendedSMV.IntegerAssignment#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see org.xtext.osy.extendedSMV.IntegerAssignment#getVar()
   * @see #getIntegerAssignment()
   * @generated
   */
  EReference getIntegerAssignment_Var();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.osy.extendedSMV.IntegerAssignment#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.osy.extendedSMV.IntegerAssignment#getValue()
   * @see #getIntegerAssignment()
   * @generated
   */
  EAttribute getIntegerAssignment_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.StateAssignment <em>State Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Assignment</em>'.
   * @see org.xtext.osy.extendedSMV.StateAssignment
   * @generated
   */
  EClass getStateAssignment();

  /**
   * Returns the meta object for the reference '{@link org.xtext.osy.extendedSMV.StateAssignment#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see org.xtext.osy.extendedSMV.StateAssignment#getVar()
   * @see #getStateAssignment()
   * @generated
   */
  EReference getStateAssignment_Var();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.osy.extendedSMV.StateAssignment#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.osy.extendedSMV.StateAssignment#getValue()
   * @see #getStateAssignment()
   * @generated
   */
  EAttribute getStateAssignment_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ExtendedSMVFactory getExtendedSMVFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.ModelImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__SECTIONS = eINSTANCE.getModel_Sections();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.SectionImpl <em>Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.SectionImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getSection()
     * @generated
     */
    EClass SECTION = eINSTANCE.getSection();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.CommentImpl <em>Comment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.CommentImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getComment()
     * @generated
     */
    EClass COMMENT = eINSTANCE.getComment();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMENT__COMMENT = eINSTANCE.getComment_Comment();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.VariablesSectionImpl <em>Variables Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.VariablesSectionImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getVariablesSection()
     * @generated
     */
    EClass VARIABLES_SECTION = eINSTANCE.getVariablesSection();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLES_SECTION__VARIABLES = eINSTANCE.getVariablesSection_Variables();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.AssignmentsImpl <em>Assignments</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.AssignmentsImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getAssignments()
     * @generated
     */
    EClass ASSIGNMENTS = eINSTANCE.getAssignments();

    /**
     * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENTS__ASSIGNMENTS = eINSTANCE.getAssignments_Assignments();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.TransactionsImpl <em>Transactions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.TransactionsImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getTransactions()
     * @generated
     */
    EClass TRANSACTIONS = eINSTANCE.getTransactions();

    /**
     * The meta object literal for the '<em><b>Transaction</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSACTIONS__TRANSACTION = eINSTANCE.getTransactions_Transaction();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.TransactionStatementImpl <em>Transaction Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.TransactionStatementImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getTransactionStatement()
     * @generated
     */
    EClass TRANSACTION_STATEMENT = eINSTANCE.getTransactionStatement();

    /**
     * The meta object literal for the '<em><b>Precondition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSACTION_STATEMENT__PRECONDITION = eINSTANCE.getTransactionStatement_Precondition();

    /**
     * The meta object literal for the '<em><b>Post Transaction</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSACTION_STATEMENT__POST_TRANSACTION = eINSTANCE.getTransactionStatement_PostTransaction();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.TransactionPreconditionImpl <em>Transaction Precondition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.TransactionPreconditionImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getTransactionPrecondition()
     * @generated
     */
    EClass TRANSACTION_PRECONDITION = eINSTANCE.getTransactionPrecondition();

    /**
     * The meta object literal for the '<em><b>Preconditions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSACTION_PRECONDITION__PRECONDITIONS = eINSTANCE.getTransactionPrecondition_Preconditions();

    /**
     * The meta object literal for the '<em><b>Logical Operator</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSACTION_PRECONDITION__LOGICAL_OPERATOR = eINSTANCE.getTransactionPrecondition_LogicalOperator();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.PreconditionStatementImpl <em>Precondition Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.PreconditionStatementImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getPreconditionStatement()
     * @generated
     */
    EClass PRECONDITION_STATEMENT = eINSTANCE.getPreconditionStatement();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.StatePreconditionImpl <em>State Precondition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.StatePreconditionImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getStatePrecondition()
     * @generated
     */
    EClass STATE_PRECONDITION = eINSTANCE.getStatePrecondition();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_PRECONDITION__VAR = eINSTANCE.getStatePrecondition_Var();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_PRECONDITION__VALUE = eINSTANCE.getStatePrecondition_Value();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.BooleanPreconditionImpl <em>Boolean Precondition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.BooleanPreconditionImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getBooleanPrecondition()
     * @generated
     */
    EClass BOOLEAN_PRECONDITION = eINSTANCE.getBooleanPrecondition();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_PRECONDITION__VAR = eINSTANCE.getBooleanPrecondition_Var();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_PRECONDITION__VALUE = eINSTANCE.getBooleanPrecondition_Value();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.IntegerPreconditionImpl <em>Integer Precondition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.IntegerPreconditionImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getIntegerPrecondition()
     * @generated
     */
    EClass INTEGER_PRECONDITION = eINSTANCE.getIntegerPrecondition();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGER_PRECONDITION__VAR = eINSTANCE.getIntegerPrecondition_Var();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_PRECONDITION__VALUE = eINSTANCE.getIntegerPrecondition_Value();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.PostTransactionImpl <em>Post Transaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.PostTransactionImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getPostTransaction()
     * @generated
     */
    EClass POST_TRANSACTION = eINSTANCE.getPostTransaction();

    /**
     * The meta object literal for the '<em><b>Post Transactions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POST_TRANSACTION__POST_TRANSACTIONS = eINSTANCE.getPostTransaction_PostTransactions();

    /**
     * The meta object literal for the '<em><b>Logical Operator</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POST_TRANSACTION__LOGICAL_OPERATOR = eINSTANCE.getPostTransaction_LogicalOperator();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.PostTransactionStatementImpl <em>Post Transaction Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.PostTransactionStatementImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getPostTransactionStatement()
     * @generated
     */
    EClass POST_TRANSACTION_STATEMENT = eINSTANCE.getPostTransactionStatement();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.SimplePostTransactionImpl <em>Simple Post Transaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.SimplePostTransactionImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getSimplePostTransaction()
     * @generated
     */
    EClass SIMPLE_POST_TRANSACTION = eINSTANCE.getSimplePostTransaction();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.StatePostTransactionImpl <em>State Post Transaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.StatePostTransactionImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getStatePostTransaction()
     * @generated
     */
    EClass STATE_POST_TRANSACTION = eINSTANCE.getStatePostTransaction();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_POST_TRANSACTION__VAR = eINSTANCE.getStatePostTransaction_Var();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_POST_TRANSACTION__VALUE = eINSTANCE.getStatePostTransaction_Value();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.BooleanPostTransactionImpl <em>Boolean Post Transaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.BooleanPostTransactionImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getBooleanPostTransaction()
     * @generated
     */
    EClass BOOLEAN_POST_TRANSACTION = eINSTANCE.getBooleanPostTransaction();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_POST_TRANSACTION__VAR = eINSTANCE.getBooleanPostTransaction_Var();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_POST_TRANSACTION__VALUE = eINSTANCE.getBooleanPostTransaction_Value();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.IntegerPostTransactionImpl <em>Integer Post Transaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.IntegerPostTransactionImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getIntegerPostTransaction()
     * @generated
     */
    EClass INTEGER_POST_TRANSACTION = eINSTANCE.getIntegerPostTransaction();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGER_POST_TRANSACTION__VAR = eINSTANCE.getIntegerPostTransaction_Var();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_POST_TRANSACTION__VALUE = eINSTANCE.getIntegerPostTransaction_Value();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.ConditionalPostTRansactionImpl <em>Conditional Post TRansaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.ConditionalPostTRansactionImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getConditionalPostTRansaction()
     * @generated
     */
    EClass CONDITIONAL_POST_TRANSACTION = eINSTANCE.getConditionalPostTRansaction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITIONAL_POST_TRANSACTION__NAME = eINSTANCE.getConditionalPostTRansaction_Name();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.VariableDeclarationImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getVariableDeclaration()
     * @generated
     */
    EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.IntegerDeclarionImpl <em>Integer Declarion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.IntegerDeclarionImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getIntegerDeclarion()
     * @generated
     */
    EClass INTEGER_DECLARION = eINSTANCE.getIntegerDeclarion();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_DECLARION__NAME = eINSTANCE.getIntegerDeclarion_Name();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.BooleanDeclarionImpl <em>Boolean Declarion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.BooleanDeclarionImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getBooleanDeclarion()
     * @generated
     */
    EClass BOOLEAN_DECLARION = eINSTANCE.getBooleanDeclarion();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_DECLARION__NAME = eINSTANCE.getBooleanDeclarion_Name();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.StateVariableDeclarationImpl <em>State Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.StateVariableDeclarationImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getStateVariableDeclaration()
     * @generated
     */
    EClass STATE_VARIABLE_DECLARATION = eINSTANCE.getStateVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_VARIABLE_DECLARATION__NAME = eINSTANCE.getStateVariableDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>States</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_VARIABLE_DECLARATION__STATES = eINSTANCE.getStateVariableDeclaration_States();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.AssignmentExpressionImpl <em>Assignment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.AssignmentExpressionImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getAssignmentExpression()
     * @generated
     */
    EClass ASSIGNMENT_EXPRESSION = eINSTANCE.getAssignmentExpression();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.BooleanAssignmentImpl <em>Boolean Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.BooleanAssignmentImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getBooleanAssignment()
     * @generated
     */
    EClass BOOLEAN_ASSIGNMENT = eINSTANCE.getBooleanAssignment();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_ASSIGNMENT__VAR = eINSTANCE.getBooleanAssignment_Var();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_ASSIGNMENT__VALUE = eINSTANCE.getBooleanAssignment_Value();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.IntegerAssignmentImpl <em>Integer Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.IntegerAssignmentImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getIntegerAssignment()
     * @generated
     */
    EClass INTEGER_ASSIGNMENT = eINSTANCE.getIntegerAssignment();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGER_ASSIGNMENT__VAR = eINSTANCE.getIntegerAssignment_Var();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_ASSIGNMENT__VALUE = eINSTANCE.getIntegerAssignment_Value();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.StateAssignmentImpl <em>State Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.StateAssignmentImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getStateAssignment()
     * @generated
     */
    EClass STATE_ASSIGNMENT = eINSTANCE.getStateAssignment();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_ASSIGNMENT__VAR = eINSTANCE.getStateAssignment_Var();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_ASSIGNMENT__VALUE = eINSTANCE.getStateAssignment_Value();

  }

} //ExtendedSMVPackage
