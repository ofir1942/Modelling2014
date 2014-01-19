/**
 */
package org.xtext.osy.extendedSMV.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.osy.extendedSMV.ExtendedSMVPackage;
import org.xtext.osy.extendedSMV.TransactionStatement;
import org.xtext.osy.extendedSMV.Transactions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transactions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.osy.extendedSMV.impl.TransactionsImpl#getTransaction <em>Transaction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransactionsImpl extends SectionImpl implements Transactions
{
  /**
   * The cached value of the '{@link #getTransaction() <em>Transaction</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransaction()
   * @generated
   * @ordered
   */
  protected EList<TransactionStatement> transaction;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransactionsImpl()
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
    return ExtendedSMVPackage.Literals.TRANSACTIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TransactionStatement> getTransaction()
  {
    if (transaction == null)
    {
      transaction = new EObjectContainmentEList<TransactionStatement>(TransactionStatement.class, this, ExtendedSMVPackage.TRANSACTIONS__TRANSACTION);
    }
    return transaction;
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
      case ExtendedSMVPackage.TRANSACTIONS__TRANSACTION:
        return ((InternalEList<?>)getTransaction()).basicRemove(otherEnd, msgs);
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
      case ExtendedSMVPackage.TRANSACTIONS__TRANSACTION:
        return getTransaction();
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
      case ExtendedSMVPackage.TRANSACTIONS__TRANSACTION:
        getTransaction().clear();
        getTransaction().addAll((Collection<? extends TransactionStatement>)newValue);
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
      case ExtendedSMVPackage.TRANSACTIONS__TRANSACTION:
        getTransaction().clear();
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
      case ExtendedSMVPackage.TRANSACTIONS__TRANSACTION:
        return transaction != null && !transaction.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TransactionsImpl
