/**
 */
package org.xtext.osy.extendedSMV;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction Precondition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.osy.extendedSMV.TransactionPrecondition#getPreconditions <em>Preconditions</em>}</li>
 *   <li>{@link org.xtext.osy.extendedSMV.TransactionPrecondition#getLogicalOperator <em>Logical Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.osy.extendedSMV.ExtendedSMVPackage#getTransactionPrecondition()
 * @model
 * @generated
 */
public interface TransactionPrecondition extends EObject
{
  /**
   * Returns the value of the '<em><b>Preconditions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.osy.extendedSMV.PreconditionStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Preconditions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Preconditions</em>' containment reference list.
   * @see org.xtext.osy.extendedSMV.ExtendedSMVPackage#getTransactionPrecondition_Preconditions()
   * @model containment="true"
   * @generated
   */
  EList<PreconditionStatement> getPreconditions();

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
   * @see org.xtext.osy.extendedSMV.ExtendedSMVPackage#getTransactionPrecondition_LogicalOperator()
   * @model unique="false"
   * @generated
   */
  EList<String> getLogicalOperator();

} // TransactionPrecondition
