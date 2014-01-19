/**
 */
package org.xtext.osy.extendedSMV;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.osy.extendedSMV.TransactionStatement#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link org.xtext.osy.extendedSMV.TransactionStatement#getPostTransaction <em>Post Transaction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.osy.extendedSMV.ExtendedSMVPackage#getTransactionStatement()
 * @model
 * @generated
 */
public interface TransactionStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Precondition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Precondition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Precondition</em>' containment reference.
   * @see #setPrecondition(TransactionPrecondition)
   * @see org.xtext.osy.extendedSMV.ExtendedSMVPackage#getTransactionStatement_Precondition()
   * @model containment="true"
   * @generated
   */
  TransactionPrecondition getPrecondition();

  /**
   * Sets the value of the '{@link org.xtext.osy.extendedSMV.TransactionStatement#getPrecondition <em>Precondition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Precondition</em>' containment reference.
   * @see #getPrecondition()
   * @generated
   */
  void setPrecondition(TransactionPrecondition value);

  /**
   * Returns the value of the '<em><b>Post Transaction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Post Transaction</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Post Transaction</em>' containment reference.
   * @see #setPostTransaction(PostTransaction)
   * @see org.xtext.osy.extendedSMV.ExtendedSMVPackage#getTransactionStatement_PostTransaction()
   * @model containment="true"
   * @generated
   */
  PostTransaction getPostTransaction();

  /**
   * Sets the value of the '{@link org.xtext.osy.extendedSMV.TransactionStatement#getPostTransaction <em>Post Transaction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Post Transaction</em>' containment reference.
   * @see #getPostTransaction()
   * @generated
   */
  void setPostTransaction(PostTransaction value);

} // TransactionStatement
