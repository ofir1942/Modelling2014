/**
 */
package org.xtext.osy.extendedSMV;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Post Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.osy.extendedSMV.PostTransaction#getPostTransactions <em>Post Transactions</em>}</li>
 *   <li>{@link org.xtext.osy.extendedSMV.PostTransaction#getLogicalOperator <em>Logical Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.osy.extendedSMV.ExtendedSMVPackage#getPostTransaction()
 * @model
 * @generated
 */
public interface PostTransaction extends EObject
{
  /**
   * Returns the value of the '<em><b>Post Transactions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.osy.extendedSMV.PostTransactionStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Post Transactions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Post Transactions</em>' containment reference list.
   * @see org.xtext.osy.extendedSMV.ExtendedSMVPackage#getPostTransaction_PostTransactions()
   * @model containment="true"
   * @generated
   */
  EList<PostTransactionStatement> getPostTransactions();

  /**
   * Returns the value of the '<em><b>Logical Operator</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Logical Operator</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Logical Operator</em>' attribute list.
   * @see org.xtext.osy.extendedSMV.ExtendedSMVPackage#getPostTransaction_LogicalOperator()
   * @model unique="false"
   * @generated
   */
  EList<String> getLogicalOperator();

} // PostTransaction
