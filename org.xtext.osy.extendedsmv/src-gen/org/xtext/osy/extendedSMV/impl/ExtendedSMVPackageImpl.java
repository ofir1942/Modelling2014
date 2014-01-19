/**
 */
package org.xtext.osy.extendedSMV.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.osy.extendedSMV.AssignmentExpression;
import org.xtext.osy.extendedSMV.Assignments;
import org.xtext.osy.extendedSMV.BooleanAssignment;
import org.xtext.osy.extendedSMV.BooleanDeclarion;
import org.xtext.osy.extendedSMV.BooleanPostTransaction;
import org.xtext.osy.extendedSMV.BooleanPrecondition;
import org.xtext.osy.extendedSMV.Comment;
import org.xtext.osy.extendedSMV.ConditionalPostTRansaction;
import org.xtext.osy.extendedSMV.ExtendedSMVFactory;
import org.xtext.osy.extendedSMV.ExtendedSMVPackage;
import org.xtext.osy.extendedSMV.IntegerAssignment;
import org.xtext.osy.extendedSMV.IntegerDeclarion;
import org.xtext.osy.extendedSMV.IntegerPostTransaction;
import org.xtext.osy.extendedSMV.IntegerPrecondition;
import org.xtext.osy.extendedSMV.Model;
import org.xtext.osy.extendedSMV.PostTransaction;
import org.xtext.osy.extendedSMV.PostTransactionStatement;
import org.xtext.osy.extendedSMV.PreconditionStatement;
import org.xtext.osy.extendedSMV.Section;
import org.xtext.osy.extendedSMV.SimplePostTransaction;
import org.xtext.osy.extendedSMV.StateAssignment;
import org.xtext.osy.extendedSMV.StatePostTransaction;
import org.xtext.osy.extendedSMV.StatePrecondition;
import org.xtext.osy.extendedSMV.StateVariableDeclaration;
import org.xtext.osy.extendedSMV.TransactionPrecondition;
import org.xtext.osy.extendedSMV.TransactionStatement;
import org.xtext.osy.extendedSMV.Transactions;
import org.xtext.osy.extendedSMV.VariableDeclaration;
import org.xtext.osy.extendedSMV.VariablesSection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtendedSMVPackageImpl extends EPackageImpl implements ExtendedSMVPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variablesSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignmentsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transactionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transactionStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transactionPreconditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass preconditionStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statePreconditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanPreconditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerPreconditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass postTransactionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass postTransactionStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simplePostTransactionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statePostTransactionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanPostTransactionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerPostTransactionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionalPostTRansactionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerDeclarionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanDeclarionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateVariableDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignmentExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanAssignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerAssignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateAssignmentEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.osy.extendedSMV.ExtendedSMVPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ExtendedSMVPackageImpl()
  {
    super(eNS_URI, ExtendedSMVFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ExtendedSMVPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ExtendedSMVPackage init()
  {
    if (isInited) return (ExtendedSMVPackage)EPackage.Registry.INSTANCE.getEPackage(ExtendedSMVPackage.eNS_URI);

    // Obtain or create and register package
    ExtendedSMVPackageImpl theExtendedSMVPackage = (ExtendedSMVPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExtendedSMVPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExtendedSMVPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theExtendedSMVPackage.createPackageContents();

    // Initialize created meta-data
    theExtendedSMVPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theExtendedSMVPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ExtendedSMVPackage.eNS_URI, theExtendedSMVPackage);
    return theExtendedSMVPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Sections()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSection()
  {
    return sectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComment()
  {
    return commentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComment_Comment()
  {
    return (EAttribute)commentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariablesSection()
  {
    return variablesSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariablesSection_Variables()
  {
    return (EReference)variablesSectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignments()
  {
    return assignmentsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignments_Assignments()
  {
    return (EReference)assignmentsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransactions()
  {
    return transactionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransactions_Transaction()
  {
    return (EReference)transactionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransactionStatement()
  {
    return transactionStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransactionStatement_Precondition()
  {
    return (EReference)transactionStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransactionStatement_PostTransaction()
  {
    return (EReference)transactionStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransactionPrecondition()
  {
    return transactionPreconditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransactionPrecondition_Preconditions()
  {
    return (EReference)transactionPreconditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransactionPrecondition_LogicalOperator()
  {
    return (EAttribute)transactionPreconditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPreconditionStatement()
  {
    return preconditionStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatePrecondition()
  {
    return statePreconditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatePrecondition_Var()
  {
    return (EReference)statePreconditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatePrecondition_Value()
  {
    return (EAttribute)statePreconditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanPrecondition()
  {
    return booleanPreconditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanPrecondition_Var()
  {
    return (EReference)booleanPreconditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanPrecondition_Value()
  {
    return (EAttribute)booleanPreconditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerPrecondition()
  {
    return integerPreconditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegerPrecondition_Var()
  {
    return (EReference)integerPreconditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerPrecondition_Value()
  {
    return (EAttribute)integerPreconditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPostTransaction()
  {
    return postTransactionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPostTransaction_PostTransactions()
  {
    return (EReference)postTransactionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPostTransaction_LogicalOperator()
  {
    return (EAttribute)postTransactionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPostTransactionStatement()
  {
    return postTransactionStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimplePostTransaction()
  {
    return simplePostTransactionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatePostTransaction()
  {
    return statePostTransactionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatePostTransaction_Var()
  {
    return (EReference)statePostTransactionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatePostTransaction_Value()
  {
    return (EAttribute)statePostTransactionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanPostTransaction()
  {
    return booleanPostTransactionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanPostTransaction_Var()
  {
    return (EReference)booleanPostTransactionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanPostTransaction_Value()
  {
    return (EAttribute)booleanPostTransactionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerPostTransaction()
  {
    return integerPostTransactionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegerPostTransaction_Var()
  {
    return (EReference)integerPostTransactionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerPostTransaction_Value()
  {
    return (EAttribute)integerPostTransactionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditionalPostTRansaction()
  {
    return conditionalPostTRansactionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConditionalPostTRansaction_Name()
  {
    return (EAttribute)conditionalPostTRansactionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableDeclaration()
  {
    return variableDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerDeclarion()
  {
    return integerDeclarionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerDeclarion_Name()
  {
    return (EAttribute)integerDeclarionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanDeclarion()
  {
    return booleanDeclarionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanDeclarion_Name()
  {
    return (EAttribute)booleanDeclarionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateVariableDeclaration()
  {
    return stateVariableDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateVariableDeclaration_Name()
  {
    return (EAttribute)stateVariableDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateVariableDeclaration_States()
  {
    return (EAttribute)stateVariableDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignmentExpression()
  {
    return assignmentExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanAssignment()
  {
    return booleanAssignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanAssignment_Var()
  {
    return (EReference)booleanAssignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanAssignment_Value()
  {
    return (EAttribute)booleanAssignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerAssignment()
  {
    return integerAssignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegerAssignment_Var()
  {
    return (EReference)integerAssignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerAssignment_Value()
  {
    return (EAttribute)integerAssignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateAssignment()
  {
    return stateAssignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateAssignment_Var()
  {
    return (EReference)stateAssignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateAssignment_Value()
  {
    return (EAttribute)stateAssignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendedSMVFactory getExtendedSMVFactory()
  {
    return (ExtendedSMVFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__SECTIONS);

    sectionEClass = createEClass(SECTION);

    commentEClass = createEClass(COMMENT);
    createEAttribute(commentEClass, COMMENT__COMMENT);

    variablesSectionEClass = createEClass(VARIABLES_SECTION);
    createEReference(variablesSectionEClass, VARIABLES_SECTION__VARIABLES);

    assignmentsEClass = createEClass(ASSIGNMENTS);
    createEReference(assignmentsEClass, ASSIGNMENTS__ASSIGNMENTS);

    transactionsEClass = createEClass(TRANSACTIONS);
    createEReference(transactionsEClass, TRANSACTIONS__TRANSACTION);

    transactionStatementEClass = createEClass(TRANSACTION_STATEMENT);
    createEReference(transactionStatementEClass, TRANSACTION_STATEMENT__PRECONDITION);
    createEReference(transactionStatementEClass, TRANSACTION_STATEMENT__POST_TRANSACTION);

    transactionPreconditionEClass = createEClass(TRANSACTION_PRECONDITION);
    createEReference(transactionPreconditionEClass, TRANSACTION_PRECONDITION__PRECONDITIONS);
    createEAttribute(transactionPreconditionEClass, TRANSACTION_PRECONDITION__LOGICAL_OPERATOR);

    preconditionStatementEClass = createEClass(PRECONDITION_STATEMENT);

    statePreconditionEClass = createEClass(STATE_PRECONDITION);
    createEReference(statePreconditionEClass, STATE_PRECONDITION__VAR);
    createEAttribute(statePreconditionEClass, STATE_PRECONDITION__VALUE);

    booleanPreconditionEClass = createEClass(BOOLEAN_PRECONDITION);
    createEReference(booleanPreconditionEClass, BOOLEAN_PRECONDITION__VAR);
    createEAttribute(booleanPreconditionEClass, BOOLEAN_PRECONDITION__VALUE);

    integerPreconditionEClass = createEClass(INTEGER_PRECONDITION);
    createEReference(integerPreconditionEClass, INTEGER_PRECONDITION__VAR);
    createEAttribute(integerPreconditionEClass, INTEGER_PRECONDITION__VALUE);

    postTransactionEClass = createEClass(POST_TRANSACTION);
    createEReference(postTransactionEClass, POST_TRANSACTION__POST_TRANSACTIONS);
    createEAttribute(postTransactionEClass, POST_TRANSACTION__LOGICAL_OPERATOR);

    postTransactionStatementEClass = createEClass(POST_TRANSACTION_STATEMENT);

    simplePostTransactionEClass = createEClass(SIMPLE_POST_TRANSACTION);

    statePostTransactionEClass = createEClass(STATE_POST_TRANSACTION);
    createEReference(statePostTransactionEClass, STATE_POST_TRANSACTION__VAR);
    createEAttribute(statePostTransactionEClass, STATE_POST_TRANSACTION__VALUE);

    booleanPostTransactionEClass = createEClass(BOOLEAN_POST_TRANSACTION);
    createEReference(booleanPostTransactionEClass, BOOLEAN_POST_TRANSACTION__VAR);
    createEAttribute(booleanPostTransactionEClass, BOOLEAN_POST_TRANSACTION__VALUE);

    integerPostTransactionEClass = createEClass(INTEGER_POST_TRANSACTION);
    createEReference(integerPostTransactionEClass, INTEGER_POST_TRANSACTION__VAR);
    createEAttribute(integerPostTransactionEClass, INTEGER_POST_TRANSACTION__VALUE);

    conditionalPostTRansactionEClass = createEClass(CONDITIONAL_POST_TRANSACTION);
    createEAttribute(conditionalPostTRansactionEClass, CONDITIONAL_POST_TRANSACTION__NAME);

    variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);

    integerDeclarionEClass = createEClass(INTEGER_DECLARION);
    createEAttribute(integerDeclarionEClass, INTEGER_DECLARION__NAME);

    booleanDeclarionEClass = createEClass(BOOLEAN_DECLARION);
    createEAttribute(booleanDeclarionEClass, BOOLEAN_DECLARION__NAME);

    stateVariableDeclarationEClass = createEClass(STATE_VARIABLE_DECLARATION);
    createEAttribute(stateVariableDeclarationEClass, STATE_VARIABLE_DECLARATION__NAME);
    createEAttribute(stateVariableDeclarationEClass, STATE_VARIABLE_DECLARATION__STATES);

    assignmentExpressionEClass = createEClass(ASSIGNMENT_EXPRESSION);

    booleanAssignmentEClass = createEClass(BOOLEAN_ASSIGNMENT);
    createEReference(booleanAssignmentEClass, BOOLEAN_ASSIGNMENT__VAR);
    createEAttribute(booleanAssignmentEClass, BOOLEAN_ASSIGNMENT__VALUE);

    integerAssignmentEClass = createEClass(INTEGER_ASSIGNMENT);
    createEReference(integerAssignmentEClass, INTEGER_ASSIGNMENT__VAR);
    createEAttribute(integerAssignmentEClass, INTEGER_ASSIGNMENT__VALUE);

    stateAssignmentEClass = createEClass(STATE_ASSIGNMENT);
    createEReference(stateAssignmentEClass, STATE_ASSIGNMENT__VAR);
    createEAttribute(stateAssignmentEClass, STATE_ASSIGNMENT__VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    commentEClass.getESuperTypes().add(this.getPreconditionStatement());
    commentEClass.getESuperTypes().add(this.getVariableDeclaration());
    commentEClass.getESuperTypes().add(this.getAssignmentExpression());
    variablesSectionEClass.getESuperTypes().add(this.getSection());
    assignmentsEClass.getESuperTypes().add(this.getSection());
    transactionsEClass.getESuperTypes().add(this.getSection());
    statePreconditionEClass.getESuperTypes().add(this.getPreconditionStatement());
    booleanPreconditionEClass.getESuperTypes().add(this.getPreconditionStatement());
    integerPreconditionEClass.getESuperTypes().add(this.getPreconditionStatement());
    simplePostTransactionEClass.getESuperTypes().add(this.getPostTransactionStatement());
    statePostTransactionEClass.getESuperTypes().add(this.getSimplePostTransaction());
    booleanPostTransactionEClass.getESuperTypes().add(this.getSimplePostTransaction());
    integerPostTransactionEClass.getESuperTypes().add(this.getSimplePostTransaction());
    conditionalPostTRansactionEClass.getESuperTypes().add(this.getPostTransactionStatement());
    integerDeclarionEClass.getESuperTypes().add(this.getVariableDeclaration());
    booleanDeclarionEClass.getESuperTypes().add(this.getVariableDeclaration());
    stateVariableDeclarationEClass.getESuperTypes().add(this.getVariableDeclaration());
    booleanAssignmentEClass.getESuperTypes().add(this.getAssignmentExpression());
    integerAssignmentEClass.getESuperTypes().add(this.getAssignmentExpression());
    stateAssignmentEClass.getESuperTypes().add(this.getAssignmentExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Sections(), this.getSection(), null, "sections", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComment_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variablesSectionEClass, VariablesSection.class, "VariablesSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariablesSection_Variables(), this.getVariableDeclaration(), null, "variables", null, 0, -1, VariablesSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignmentsEClass, Assignments.class, "Assignments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssignments_Assignments(), this.getAssignmentExpression(), null, "assignments", null, 0, -1, Assignments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transactionsEClass, Transactions.class, "Transactions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransactions_Transaction(), this.getTransactionStatement(), null, "transaction", null, 0, -1, Transactions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transactionStatementEClass, TransactionStatement.class, "TransactionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransactionStatement_Precondition(), this.getTransactionPrecondition(), null, "precondition", null, 0, 1, TransactionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransactionStatement_PostTransaction(), this.getPostTransaction(), null, "postTransaction", null, 0, 1, TransactionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transactionPreconditionEClass, TransactionPrecondition.class, "TransactionPrecondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransactionPrecondition_Preconditions(), this.getPreconditionStatement(), null, "preconditions", null, 0, -1, TransactionPrecondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTransactionPrecondition_LogicalOperator(), ecorePackage.getEString(), "logicalOperator", null, 0, -1, TransactionPrecondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(preconditionStatementEClass, PreconditionStatement.class, "PreconditionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(statePreconditionEClass, StatePrecondition.class, "StatePrecondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStatePrecondition_Var(), this.getStateVariableDeclaration(), null, "var", null, 0, 1, StatePrecondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStatePrecondition_Value(), ecorePackage.getEString(), "value", null, 0, 1, StatePrecondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanPreconditionEClass, BooleanPrecondition.class, "BooleanPrecondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBooleanPrecondition_Var(), this.getBooleanDeclarion(), null, "var", null, 0, 1, BooleanPrecondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBooleanPrecondition_Value(), ecorePackage.getEString(), "value", null, 0, 1, BooleanPrecondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerPreconditionEClass, IntegerPrecondition.class, "IntegerPrecondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIntegerPrecondition_Var(), this.getIntegerDeclarion(), null, "var", null, 0, 1, IntegerPrecondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntegerPrecondition_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntegerPrecondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(postTransactionEClass, PostTransaction.class, "PostTransaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPostTransaction_PostTransactions(), this.getPostTransactionStatement(), null, "postTransactions", null, 0, -1, PostTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPostTransaction_LogicalOperator(), ecorePackage.getEString(), "logicalOperator", null, 0, -1, PostTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(postTransactionStatementEClass, PostTransactionStatement.class, "PostTransactionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(simplePostTransactionEClass, SimplePostTransaction.class, "SimplePostTransaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(statePostTransactionEClass, StatePostTransaction.class, "StatePostTransaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStatePostTransaction_Var(), this.getStateVariableDeclaration(), null, "var", null, 0, 1, StatePostTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStatePostTransaction_Value(), ecorePackage.getEString(), "value", null, 0, 1, StatePostTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanPostTransactionEClass, BooleanPostTransaction.class, "BooleanPostTransaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBooleanPostTransaction_Var(), this.getBooleanDeclarion(), null, "var", null, 0, 1, BooleanPostTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBooleanPostTransaction_Value(), ecorePackage.getEString(), "value", null, 0, 1, BooleanPostTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerPostTransactionEClass, IntegerPostTransaction.class, "IntegerPostTransaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIntegerPostTransaction_Var(), this.getIntegerDeclarion(), null, "var", null, 0, 1, IntegerPostTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntegerPostTransaction_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntegerPostTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionalPostTRansactionEClass, ConditionalPostTRansaction.class, "ConditionalPostTRansaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConditionalPostTRansaction_Name(), ecorePackage.getEString(), "name", null, 0, 1, ConditionalPostTRansaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(integerDeclarionEClass, IntegerDeclarion.class, "IntegerDeclarion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntegerDeclarion_Name(), ecorePackage.getEString(), "name", null, 0, 1, IntegerDeclarion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanDeclarionEClass, BooleanDeclarion.class, "BooleanDeclarion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanDeclarion_Name(), ecorePackage.getEString(), "name", null, 0, 1, BooleanDeclarion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateVariableDeclarationEClass, StateVariableDeclaration.class, "StateVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStateVariableDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, StateVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStateVariableDeclaration_States(), ecorePackage.getEString(), "states", null, 0, -1, StateVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignmentExpressionEClass, AssignmentExpression.class, "AssignmentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(booleanAssignmentEClass, BooleanAssignment.class, "BooleanAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBooleanAssignment_Var(), this.getBooleanDeclarion(), null, "var", null, 0, 1, BooleanAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBooleanAssignment_Value(), ecorePackage.getEString(), "value", null, 0, 1, BooleanAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerAssignmentEClass, IntegerAssignment.class, "IntegerAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIntegerAssignment_Var(), this.getIntegerDeclarion(), null, "var", null, 0, 1, IntegerAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntegerAssignment_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntegerAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateAssignmentEClass, StateAssignment.class, "StateAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStateAssignment_Var(), this.getStateVariableDeclaration(), null, "var", null, 0, 1, StateAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStateAssignment_Value(), ecorePackage.getEString(), "value", null, 0, 1, StateAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //ExtendedSMVPackageImpl
