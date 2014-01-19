/**
 */
package org.xtext.osy.extendedSMV;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.osy.extendedSMV.ExtendedSMVPackage
 * @generated
 */
public interface ExtendedSMVFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ExtendedSMVFactory eINSTANCE = org.xtext.osy.extendedSMV.impl.ExtendedSMVFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Section</em>'.
   * @generated
   */
  Section createSection();

  /**
   * Returns a new object of class '<em>Comment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comment</em>'.
   * @generated
   */
  Comment createComment();

  /**
   * Returns a new object of class '<em>Variables Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variables Section</em>'.
   * @generated
   */
  VariablesSection createVariablesSection();

  /**
   * Returns a new object of class '<em>Assignments</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assignments</em>'.
   * @generated
   */
  Assignments createAssignments();

  /**
   * Returns a new object of class '<em>Transactions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transactions</em>'.
   * @generated
   */
  Transactions createTransactions();

  /**
   * Returns a new object of class '<em>Transaction Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transaction Statement</em>'.
   * @generated
   */
  TransactionStatement createTransactionStatement();

  /**
   * Returns a new object of class '<em>Transaction Precondition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transaction Precondition</em>'.
   * @generated
   */
  TransactionPrecondition createTransactionPrecondition();

  /**
   * Returns a new object of class '<em>Precondition Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Precondition Statement</em>'.
   * @generated
   */
  PreconditionStatement createPreconditionStatement();

  /**
   * Returns a new object of class '<em>State Precondition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Precondition</em>'.
   * @generated
   */
  StatePrecondition createStatePrecondition();

  /**
   * Returns a new object of class '<em>Boolean Precondition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Precondition</em>'.
   * @generated
   */
  BooleanPrecondition createBooleanPrecondition();

  /**
   * Returns a new object of class '<em>Integer Precondition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Precondition</em>'.
   * @generated
   */
  IntegerPrecondition createIntegerPrecondition();

  /**
   * Returns a new object of class '<em>Post Transaction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Post Transaction</em>'.
   * @generated
   */
  PostTransaction createPostTransaction();

  /**
   * Returns a new object of class '<em>Post Transaction Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Post Transaction Statement</em>'.
   * @generated
   */
  PostTransactionStatement createPostTransactionStatement();

  /**
   * Returns a new object of class '<em>Simple Post Transaction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Post Transaction</em>'.
   * @generated
   */
  SimplePostTransaction createSimplePostTransaction();

  /**
   * Returns a new object of class '<em>State Post Transaction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Post Transaction</em>'.
   * @generated
   */
  StatePostTransaction createStatePostTransaction();

  /**
   * Returns a new object of class '<em>Boolean Post Transaction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Post Transaction</em>'.
   * @generated
   */
  BooleanPostTransaction createBooleanPostTransaction();

  /**
   * Returns a new object of class '<em>Integer Post Transaction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Post Transaction</em>'.
   * @generated
   */
  IntegerPostTransaction createIntegerPostTransaction();

  /**
   * Returns a new object of class '<em>Conditional Post TRansaction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conditional Post TRansaction</em>'.
   * @generated
   */
  ConditionalPostTRansaction createConditionalPostTRansaction();

  /**
   * Returns a new object of class '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Declaration</em>'.
   * @generated
   */
  VariableDeclaration createVariableDeclaration();

  /**
   * Returns a new object of class '<em>Integer Declarion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Declarion</em>'.
   * @generated
   */
  IntegerDeclarion createIntegerDeclarion();

  /**
   * Returns a new object of class '<em>Boolean Declarion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Declarion</em>'.
   * @generated
   */
  BooleanDeclarion createBooleanDeclarion();

  /**
   * Returns a new object of class '<em>State Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Variable Declaration</em>'.
   * @generated
   */
  StateVariableDeclaration createStateVariableDeclaration();

  /**
   * Returns a new object of class '<em>Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assignment Expression</em>'.
   * @generated
   */
  AssignmentExpression createAssignmentExpression();

  /**
   * Returns a new object of class '<em>Boolean Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Assignment</em>'.
   * @generated
   */
  BooleanAssignment createBooleanAssignment();

  /**
   * Returns a new object of class '<em>Integer Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Assignment</em>'.
   * @generated
   */
  IntegerAssignment createIntegerAssignment();

  /**
   * Returns a new object of class '<em>State Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Assignment</em>'.
   * @generated
   */
  StateAssignment createStateAssignment();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ExtendedSMVPackage getExtendedSMVPackage();

} //ExtendedSMVFactory
