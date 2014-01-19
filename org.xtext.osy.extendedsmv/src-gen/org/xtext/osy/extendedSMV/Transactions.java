/**
 */
package org.xtext.osy.extendedSMV;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transactions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.osy.extendedSMV.Transactions#getTransaction <em>Transaction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.osy.extendedSMV.ExtendedSMVPackage#getTransactions()
 * @model
 * @generated
 */
public interface Transactions extends Section
{
  /**
   * Returns the value of the '<em><b>Transaction</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.osy.extendedSMV.TransactionStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transaction</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transaction</em>' containment reference list.
   * @see org.xtext.osy.extendedSMV.ExtendedSMVPackage#getTransactions_Transaction()
   * @model containment="true"
   * @generated
   */
  EList<TransactionStatement> getTransaction();

} // Transactions
