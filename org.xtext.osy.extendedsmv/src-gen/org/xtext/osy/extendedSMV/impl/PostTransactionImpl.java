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
import org.xtext.osy.extendedSMV.PostTransaction;
import org.xtext.osy.extendedSMV.PostTransactionStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Post Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.osy.extendedSMV.impl.PostTransactionImpl#getPostTransactions <em>Post Transactions</em>}</li>
 *   <li>{@link org.xtext.osy.extendedSMV.impl.PostTransactionImpl#getLogicalOperator <em>Logical Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostTransactionImpl extends MinimalEObjectImpl.Container implements PostTransaction
{
  /**
   * The cached value of the '{@link #getPostTransactions() <em>Post Transactions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostTransactions()
   * @generated
   * @ordered
   */
  protected EList<PostTransactionStatement> postTransactions;

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
  protected PostTransactionImpl()
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
    return ExtendedSMVPackage.Literals.POST_TRANSACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PostTransactionStatement> getPostTransactions()
  {
    if (postTransactions == null)
    {
      postTransactions = new EObjectContainmentEList<PostTransactionStatement>(PostTransactionStatement.class, this, ExtendedSMVPackage.POST_TRANSACTION__POST_TRANSACTIONS);
    }
    return postTransactions;
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
      logicalOperator = new EDataTypeEList<String>(String.class, this, ExtendedSMVPackage.POST_TRANSACTION__LOGICAL_OPERATOR);
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
      case ExtendedSMVPackage.POST_TRANSACTION__POST_TRANSACTIONS:
        return ((InternalEList<?>)getPostTransactions()).basicRemove(otherEnd, msgs);
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
      case ExtendedSMVPackage.POST_TRANSACTION__POST_TRANSACTIONS:
        return getPostTransactions();
      case ExtendedSMVPackage.POST_TRANSACTION__LOGICAL_OPERATOR:
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
      case ExtendedSMVPackage.POST_TRANSACTION__POST_TRANSACTIONS:
        getPostTransactions().clear();
        getPostTransactions().addAll((Collection<? extends PostTransactionStatement>)newValue);
        return;
      case ExtendedSMVPackage.POST_TRANSACTION__LOGICAL_OPERATOR:
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
      case ExtendedSMVPackage.POST_TRANSACTION__POST_TRANSACTIONS:
        getPostTransactions().clear();
        return;
      case ExtendedSMVPackage.POST_TRANSACTION__LOGICAL_OPERATOR:
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
      case ExtendedSMVPackage.POST_TRANSACTION__POST_TRANSACTIONS:
        return postTransactions != null && !postTransactions.isEmpty();
      case ExtendedSMVPackage.POST_TRANSACTION__LOGICAL_OPERATOR:
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

} //PostTransactionImpl
