/**
 */
package org.xtext.osy.extendedSMV.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.osy.extendedSMV.ExtendedSMVPackage;
import org.xtext.osy.extendedSMV.PreconditionStatement;
import org.xtext.osy.extendedSMV.TransactionPrecondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction Precondition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.osy.extendedSMV.impl.TransactionPreconditionImpl#getPreconditions <em>Preconditions</em>}</li>
 *   <li>{@link org.xtext.osy.extendedSMV.impl.TransactionPreconditionImpl#getLogicalOperator <em>Logical Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransactionPreconditionImpl extends MinimalEObjectImpl.Container implements TransactionPrecondition
{
  /**
   * The cached value of the '{@link #getPreconditions() <em>Preconditions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreconditions()
   * @generated
   * @ordered
   */
  protected EList<PreconditionStatement> preconditions;

  /**
   * The cached value of the '{@link #getLogicalOperator() <em>Logical Operator</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogicalOperator()
   * @generated
   * @ordered
   */
  protected EList<String> logicalOperator;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransactionPreconditionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ExtendedSMVPackage.Literals.TRANSACTION_PRECONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PreconditionStatement> getPreconditions()
  {
    if (preconditions == null)
    {
      preconditions = new EObjectContainmentEList<PreconditionStatement>(PreconditionStatement.class, this, ExtendedSMVPackage.TRANSACTION_PRECONDITION__PRECONDITIONS);
    }
    return preconditions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getLogicalOperator()
  {
    if (logicalOperator == null)
    {
      logicalOperator = new EDataTypeEList<String>(String.class, this, ExtendedSMVPackage.TRANSACTION_PRECONDITION__LOGICAL_OPERATOR);
    }
    return logicalOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ExtendedSMVPackage.TRANSACTION_PRECONDITION__PRECONDITIONS:
        return ((InternalEList<?>)getPreconditions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ExtendedSMVPackage.TRANSACTION_PRECONDITION__PRECONDITIONS:
        return getPreconditions();
      case ExtendedSMVPackage.TRANSACTION_PRECONDITION__LOGICAL_OPERATOR:
        return getLogicalOperator();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ExtendedSMVPackage.TRANSACTION_PRECONDITION__PRECONDITIONS:
        getPreconditions().clear();
        getPreconditions().addAll((Collection<? extends PreconditionStatement>)newValue);
        return;
      case ExtendedSMVPackage.TRANSACTION_PRECONDITION__LOGICAL_OPERATOR:
        getLogicalOperator().clear();
        getLogicalOperator().addAll((Collection<? extends String>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ExtendedSMVPackage.TRANSACTION_PRECONDITION__PRECONDITIONS:
        getPreconditions().clear();
        return;
      case ExtendedSMVPackage.TRANSACTION_PRECONDITION__LOGICAL_OPERATOR:
        getLogicalOperator().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ExtendedSMVPackage.TRANSACTION_PRECONDITION__PRECONDITIONS:
        return preconditions != null && !preconditions.isEmpty();
      case ExtendedSMVPackage.TRANSACTION_PRECONDITION__LOGICAL_OPERATOR:
        return logicalOperator != null && !logicalOperator.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (logicalOperator: ");
    result.append(logicalOperator);
    result.append(')');
    return result.toString();
  }

} //TransactionPreconditionImpl
