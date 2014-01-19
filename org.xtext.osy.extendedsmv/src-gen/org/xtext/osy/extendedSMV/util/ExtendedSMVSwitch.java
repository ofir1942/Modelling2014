/**
 */
package org.xtext.osy.extendedSMV.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.osy.extendedSMV.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.osy.extendedSMV.ExtendedSMVPackage
 * @generated
 */
public class ExtendedSMVSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ExtendedSMVPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendedSMVSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ExtendedSMVPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ExtendedSMVPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtendedSMVPackage.SECTION:
      {
        Section section = (Section)theEObject;
        T result = caseSection(section);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtendedSMVPackage.COMMENT:
      {
        Comment comment = (Comment)theEObject;
        T result = caseComment(comment);
        if (result == null) result = casePreconditionStatement(comment);
        if (result == null) result = caseVariableDeclaration(comment);
        if (result == null) result = caseAssignmentExpression(comment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtendedSMVPackage.VARIABLES_SECTION:
      {
        VariablesSection variablesSection = (VariablesSection)theEObject;
        T result = caseVariablesSection(variablesSection);
        if (result == null) result = caseSection(variablesSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtendedSMVPackage.ASSIGNMENTS:
      {
        Assignments assignments = (Assignments)theEObject;
        T result = caseAssignments(assignments);
        if (result == null) result = caseSection(assignments);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtendedSMVPackage.TRANSACTIONS:
      {
        Transactions transactions = (Transactions)theEObject;
        T result = caseTransactions(transactions);
        if (result == null) result = caseSection(transactions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtendedSMVPackage.TRANSACTION_STATEMENT:
      {
        TransactionStatement transactionStatement = (TransactionStatement)theEObject;
        T result = caseTransactionStatement(transactionStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtendedSMVPackage.TRANSACTION_PRECONDITION:
      {
        TransactionPrecondition transactionPrecondition = (TransactionPrecondition)theEObject;
        T result = caseTransactionPrecondition(transactionPrecondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtendedSMVPackage.PRECONDITION_STATEMENT:
      {
        PreconditionStatement preconditionStatement = (PreconditionStatement)theEObject;
        T result = casePreconditionStatement(preconditionStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtendedSMVPackage.STATE_PRECONDITION:
      {
        StatePrecondition statePrecondition = (StatePrecondition)theEObject;
        T result = caseStatePrecondition(statePrecondition);
        if (result == null) result = casePreconditionStatement(statePrecondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtendedSMVPackage.BOOLEAN_PRECONDITION:
      {
        BooleanPrecondition booleanPrecondition = (BooleanPrecondition)theEObject;
        T result = caseBooleanPrecondition(booleanPrecondition);
        if (result == null) result = casePreconditionStatement(booleanPrecondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtendedSMVPackage.INTEGER_PRECONDITION:
      {
        IntegerPrecondition integerPrecondition = (IntegerPrecondition)theEObject;
        T result = caseIntegerPrecondition(integerPrecondition);
        if (result == null) result = casePreconditionStatement(integerPrecondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtendedSMVPackage.POST_TRANSACTION:
      {
        PostTransaction postTransaction = (PostTransaction)theEObject;
        T result = casePostTransaction(postTransaction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtendedSMVPackage.POST_TRANSACTION_STATEMENT:
      {
        PostTransactionStatement postTransactionStatement = (PostTransactionStatement)theEObject;
        T result = casePostTransactionStatement(postTransactionStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtendedSMVPackage.SIMPLE_POST_TRANSACTION:
      {
        SimplePostTransaction simplePostTransaction = (SimplePostTransaction)theEObject;
        T result = caseSimplePostTransaction(simplePostTransaction);
        if (result == null) result = casePostTransactionStatement(simplePostTransaction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtendedSMVPackage.STATE_POST_TRANSACTION:
      {
        StatePostTransaction statePostTransaction = (StatePostTransaction)theEObject;
        T result = caseStatePostTransaction(statePostTransaction);
        if (result == null) result = caseSimplePostTransaction(statePostTransaction);
        if (result == null) result = casePostTransactionStatement(statePostTransaction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtendedSMVPackage.BOOLEAN_POST_TRANSACTION:
      {
        BooleanPostTransaction booleanPostTransaction = (BooleanPostTransaction)theEObject;
        T result = caseBooleanPostTransaction(booleanPostTransaction);
        if (result == null) result = caseSimplePostTransaction(booleanPostTransaction);
        if (result == null) result = casePostTransactionStatement(booleanPostTransaction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtendedSMVPackage.INTEGER_POST_TRANSACTION:
      {
        IntegerPostTransaction integerPostTransaction = (IntegerPostTransaction)theEObject;
        T result = caseIntegerPostTransaction(integerPostTransaction);
        if (result == null) result = caseSimplePostTransaction(integerPostTransaction);
        if (result == null) result = casePostTransactionStatement(integerPostTransaction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtendedSMVPackage.CONDITIONAL_POST_TRANSACTION:
      {
        ConditionalPostTRansaction conditionalPostTRansaction = (ConditionalPostTRansaction)theEObject;
        T result = caseConditionalPostTRansaction(conditionalPostTRansaction);
        if (result == null) result = casePostTransactionStatement(conditionalPostTRansaction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtendedSMVPackage.VARIABLE_DECLARATION:
      {
        VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
        T result = caseVariableDeclaration(variableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtendedSMVPackage.INTEGER_DECLARION:
      {
        IntegerDeclarion integerDeclarion = (IntegerDeclarion)theEObject;
        T result = caseIntegerDeclarion(integerDeclarion);
        if (result == null) result = caseVariableDeclaration(integerDeclarion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtendedSMVPackage.BOOLEAN_DECLARION:
      {
        BooleanDeclarion booleanDeclarion = (BooleanDeclarion)theEObject;
        T result = caseBooleanDeclarion(booleanDeclarion);
        if (result == null) result = caseVariableDeclaration(booleanDeclarion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtendedSMVPackage.STATE_VARIABLE_DECLARATION:
      {
        StateVariableDeclaration stateVariableDeclaration = (StateVariableDeclaration)theEObject;
        T result = caseStateVariableDeclaration(stateVariableDeclaration);
        if (result == null) result = caseVariableDeclaration(stateVariableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtendedSMVPackage.ASSIGNMENT_EXPRESSION:
      {
        AssignmentExpression assignmentExpression = (AssignmentExpression)theEObject;
        T result = caseAssignmentExpression(assignmentExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtendedSMVPackage.BOOLEAN_ASSIGNMENT:
      {
        BooleanAssignment booleanAssignment = (BooleanAssignment)theEObject;
        T result = caseBooleanAssignment(booleanAssignment);
        if (result == null) result = caseAssignmentExpression(booleanAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtendedSMVPackage.INTEGER_ASSIGNMENT:
      {
        IntegerAssignment integerAssignment = (IntegerAssignment)theEObject;
        T result = caseIntegerAssignment(integerAssignment);
        if (result == null) result = caseAssignmentExpression(integerAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtendedSMVPackage.STATE_ASSIGNMENT:
      {
        StateAssignment stateAssignment = (StateAssignment)theEObject;
        T result = caseStateAssignment(stateAssignment);
        if (result == null) result = caseAssignmentExpression(stateAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSection(Section object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComment(Comment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variables Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variables Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariablesSection(VariablesSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignments</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignments</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignments(Assignments object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transactions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transactions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransactions(Transactions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transaction Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transaction Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransactionStatement(TransactionStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transaction Precondition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transaction Precondition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransactionPrecondition(TransactionPrecondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Precondition Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Precondition Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePreconditionStatement(PreconditionStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Precondition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Precondition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatePrecondition(StatePrecondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Precondition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Precondition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanPrecondition(BooleanPrecondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Precondition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Precondition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerPrecondition(IntegerPrecondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Post Transaction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Post Transaction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePostTransaction(PostTransaction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Post Transaction Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Post Transaction Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePostTransactionStatement(PostTransactionStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Post Transaction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Post Transaction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimplePostTransaction(SimplePostTransaction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Post Transaction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Post Transaction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatePostTransaction(StatePostTransaction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Post Transaction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Post Transaction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanPostTransaction(BooleanPostTransaction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Post Transaction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Post Transaction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerPostTransaction(IntegerPostTransaction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditional Post TRansaction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditional Post TRansaction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionalPostTRansaction(ConditionalPostTRansaction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableDeclaration(VariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Declarion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Declarion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerDeclarion(IntegerDeclarion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Declarion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Declarion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanDeclarion(BooleanDeclarion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateVariableDeclaration(StateVariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignment Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignmentExpression(AssignmentExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanAssignment(BooleanAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerAssignment(IntegerAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateAssignment(StateAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ExtendedSMVSwitch
