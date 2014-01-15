/**
 */
package org.xtext.osy.extendedSMV;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.osy.extendedSMV.ExtendedSMVFactory
 * @model kind="package"
 * @generated
 */
public interface ExtendedSMVPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "extendedSMV";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/osy/ExtendedSMV";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "extendedSMV";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ExtendedSMVPackage eINSTANCE = org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.ModelImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__SECTIONS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.SectionImpl <em>Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.SectionImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getSection()
   * @generated
   */
  int SECTION = 1;

  /**
   * The number of structural features of the '<em>Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.VariableDeclarationImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getVariableDeclaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 5;

  /**
   * The number of structural features of the '<em>Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.CommentImpl <em>Comment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.CommentImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getComment()
   * @generated
   */
  int COMMENT = 2;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT__COMMENT = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Comment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.VariablesSectionImpl <em>Variables Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.VariablesSectionImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getVariablesSection()
   * @generated
   */
  int VARIABLES_SECTION = 3;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_SECTION__VARIABLES = SECTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variables Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_SECTION_FEATURE_COUNT = SECTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.AssignmentsImpl <em>Assignments</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.AssignmentsImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getAssignments()
   * @generated
   */
  int ASSIGNMENTS = 4;

  /**
   * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENTS__ASSIGNMENTS = SECTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Assignments</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENTS_FEATURE_COUNT = SECTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.IntegerDeclarionImpl <em>Integer Declarion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.IntegerDeclarionImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getIntegerDeclarion()
   * @generated
   */
  int INTEGER_DECLARION = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_DECLARION__NAME = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Declarion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_DECLARION_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.BooleanDeclarionImpl <em>Boolean Declarion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.BooleanDeclarionImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getBooleanDeclarion()
   * @generated
   */
  int BOOLEAN_DECLARION = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_DECLARION__NAME = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Declarion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_DECLARION_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.StateVariableDeclarationImpl <em>State Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.StateVariableDeclarationImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getStateVariableDeclaration()
   * @generated
   */
  int STATE_VARIABLE_DECLARATION = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_VARIABLE_DECLARATION__NAME = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>States</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_VARIABLE_DECLARATION__STATES = VARIABLE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>State Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_VARIABLE_DECLARATION_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.AssignmentExpressionImpl <em>Assignment Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.AssignmentExpressionImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getAssignmentExpression()
   * @generated
   */
  int ASSIGNMENT_EXPRESSION = 9;

  /**
   * The number of structural features of the '<em>Assignment Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.BooleanAssignmentImpl <em>Boolean Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.BooleanAssignmentImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getBooleanAssignment()
   * @generated
   */
  int BOOLEAN_ASSIGNMENT = 10;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_ASSIGNMENT__VAR = ASSIGNMENT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_ASSIGNMENT__VALUE = ASSIGNMENT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Boolean Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_ASSIGNMENT_FEATURE_COUNT = ASSIGNMENT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.IntegerAssignmentImpl <em>Integer Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.IntegerAssignmentImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getIntegerAssignment()
   * @generated
   */
  int INTEGER_ASSIGNMENT = 11;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ASSIGNMENT__VAR = ASSIGNMENT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ASSIGNMENT__VALUE = ASSIGNMENT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Integer Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ASSIGNMENT_FEATURE_COUNT = ASSIGNMENT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.osy.extendedSMV.impl.StateAssignmentImpl <em>State Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.osy.extendedSMV.impl.StateAssignmentImpl
   * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getStateAssignment()
   * @generated
   */
  int STATE_ASSIGNMENT = 12;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_ASSIGNMENT__VAR = ASSIGNMENT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_ASSIGNMENT__VALUE = ASSIGNMENT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>State Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_ASSIGNMENT_FEATURE_COUNT = ASSIGNMENT_EXPRESSION_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.osy.extendedSMV.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.osy.extendedSMV.Model#getSections <em>Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sections</em>'.
   * @see org.xtext.osy.extendedSMV.Model#getSections()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Sections();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.Section <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Section</em>'.
   * @see org.xtext.osy.extendedSMV.Section
   * @generated
   */
  EClass getSection();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.Comment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comment</em>'.
   * @see org.xtext.osy.extendedSMV.Comment
   * @generated
   */
  EClass getComment();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.osy.extendedSMV.Comment#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see org.xtext.osy.extendedSMV.Comment#getComment()
   * @see #getComment()
   * @generated
   */
  EAttribute getComment_Comment();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.VariablesSection <em>Variables Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variables Section</em>'.
   * @see org.xtext.osy.extendedSMV.VariablesSection
   * @generated
   */
  EClass getVariablesSection();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.osy.extendedSMV.VariablesSection#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see org.xtext.osy.extendedSMV.VariablesSection#getVariables()
   * @see #getVariablesSection()
   * @generated
   */
  EReference getVariablesSection_Variables();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.Assignments <em>Assignments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignments</em>'.
   * @see org.xtext.osy.extendedSMV.Assignments
   * @generated
   */
  EClass getAssignments();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.osy.extendedSMV.Assignments#getAssignments <em>Assignments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assignments</em>'.
   * @see org.xtext.osy.extendedSMV.Assignments#getAssignments()
   * @see #getAssignments()
   * @generated
   */
  EReference getAssignments_Assignments();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Declaration</em>'.
   * @see org.xtext.osy.extendedSMV.VariableDeclaration
   * @generated
   */
  EClass getVariableDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.IntegerDeclarion <em>Integer Declarion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Declarion</em>'.
   * @see org.xtext.osy.extendedSMV.IntegerDeclarion
   * @generated
   */
  EClass getIntegerDeclarion();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.osy.extendedSMV.IntegerDeclarion#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.osy.extendedSMV.IntegerDeclarion#getName()
   * @see #getIntegerDeclarion()
   * @generated
   */
  EAttribute getIntegerDeclarion_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.BooleanDeclarion <em>Boolean Declarion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Declarion</em>'.
   * @see org.xtext.osy.extendedSMV.BooleanDeclarion
   * @generated
   */
  EClass getBooleanDeclarion();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.osy.extendedSMV.BooleanDeclarion#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.osy.extendedSMV.BooleanDeclarion#getName()
   * @see #getBooleanDeclarion()
   * @generated
   */
  EAttribute getBooleanDeclarion_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.StateVariableDeclaration <em>State Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Variable Declaration</em>'.
   * @see org.xtext.osy.extendedSMV.StateVariableDeclaration
   * @generated
   */
  EClass getStateVariableDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.osy.extendedSMV.StateVariableDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.osy.extendedSMV.StateVariableDeclaration#getName()
   * @see #getStateVariableDeclaration()
   * @generated
   */
  EAttribute getStateVariableDeclaration_Name();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.osy.extendedSMV.StateVariableDeclaration#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>States</em>'.
   * @see org.xtext.osy.extendedSMV.StateVariableDeclaration#getStates()
   * @see #getStateVariableDeclaration()
   * @generated
   */
  EAttribute getStateVariableDeclaration_States();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.AssignmentExpression <em>Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Expression</em>'.
   * @see org.xtext.osy.extendedSMV.AssignmentExpression
   * @generated
   */
  EClass getAssignmentExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.BooleanAssignment <em>Boolean Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Assignment</em>'.
   * @see org.xtext.osy.extendedSMV.BooleanAssignment
   * @generated
   */
  EClass getBooleanAssignment();

  /**
   * Returns the meta object for the reference '{@link org.xtext.osy.extendedSMV.BooleanAssignment#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see org.xtext.osy.extendedSMV.BooleanAssignment#getVar()
   * @see #getBooleanAssignment()
   * @generated
   */
  EReference getBooleanAssignment_Var();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.osy.extendedSMV.BooleanAssignment#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.osy.extendedSMV.BooleanAssignment#getValue()
   * @see #getBooleanAssignment()
   * @generated
   */
  EAttribute getBooleanAssignment_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.IntegerAssignment <em>Integer Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Assignment</em>'.
   * @see org.xtext.osy.extendedSMV.IntegerAssignment
   * @generated
   */
  EClass getIntegerAssignment();

  /**
   * Returns the meta object for the reference '{@link org.xtext.osy.extendedSMV.IntegerAssignment#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see org.xtext.osy.extendedSMV.IntegerAssignment#getVar()
   * @see #getIntegerAssignment()
   * @generated
   */
  EReference getIntegerAssignment_Var();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.osy.extendedSMV.IntegerAssignment#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.osy.extendedSMV.IntegerAssignment#getValue()
   * @see #getIntegerAssignment()
   * @generated
   */
  EAttribute getIntegerAssignment_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.osy.extendedSMV.StateAssignment <em>State Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Assignment</em>'.
   * @see org.xtext.osy.extendedSMV.StateAssignment
   * @generated
   */
  EClass getStateAssignment();

  /**
   * Returns the meta object for the reference '{@link org.xtext.osy.extendedSMV.StateAssignment#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see org.xtext.osy.extendedSMV.StateAssignment#getVar()
   * @see #getStateAssignment()
   * @generated
   */
  EReference getStateAssignment_Var();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.osy.extendedSMV.StateAssignment#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.osy.extendedSMV.StateAssignment#getValue()
   * @see #getStateAssignment()
   * @generated
   */
  EAttribute getStateAssignment_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ExtendedSMVFactory getExtendedSMVFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.ModelImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__SECTIONS = eINSTANCE.getModel_Sections();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.SectionImpl <em>Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.SectionImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getSection()
     * @generated
     */
    EClass SECTION = eINSTANCE.getSection();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.CommentImpl <em>Comment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.CommentImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getComment()
     * @generated
     */
    EClass COMMENT = eINSTANCE.getComment();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMENT__COMMENT = eINSTANCE.getComment_Comment();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.VariablesSectionImpl <em>Variables Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.VariablesSectionImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getVariablesSection()
     * @generated
     */
    EClass VARIABLES_SECTION = eINSTANCE.getVariablesSection();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLES_SECTION__VARIABLES = eINSTANCE.getVariablesSection_Variables();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.AssignmentsImpl <em>Assignments</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.AssignmentsImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getAssignments()
     * @generated
     */
    EClass ASSIGNMENTS = eINSTANCE.getAssignments();

    /**
     * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENTS__ASSIGNMENTS = eINSTANCE.getAssignments_Assignments();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.VariableDeclarationImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getVariableDeclaration()
     * @generated
     */
    EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.IntegerDeclarionImpl <em>Integer Declarion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.IntegerDeclarionImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getIntegerDeclarion()
     * @generated
     */
    EClass INTEGER_DECLARION = eINSTANCE.getIntegerDeclarion();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_DECLARION__NAME = eINSTANCE.getIntegerDeclarion_Name();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.BooleanDeclarionImpl <em>Boolean Declarion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.BooleanDeclarionImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getBooleanDeclarion()
     * @generated
     */
    EClass BOOLEAN_DECLARION = eINSTANCE.getBooleanDeclarion();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_DECLARION__NAME = eINSTANCE.getBooleanDeclarion_Name();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.StateVariableDeclarationImpl <em>State Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.StateVariableDeclarationImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getStateVariableDeclaration()
     * @generated
     */
    EClass STATE_VARIABLE_DECLARATION = eINSTANCE.getStateVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_VARIABLE_DECLARATION__NAME = eINSTANCE.getStateVariableDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>States</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_VARIABLE_DECLARATION__STATES = eINSTANCE.getStateVariableDeclaration_States();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.AssignmentExpressionImpl <em>Assignment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.AssignmentExpressionImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getAssignmentExpression()
     * @generated
     */
    EClass ASSIGNMENT_EXPRESSION = eINSTANCE.getAssignmentExpression();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.BooleanAssignmentImpl <em>Boolean Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.BooleanAssignmentImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getBooleanAssignment()
     * @generated
     */
    EClass BOOLEAN_ASSIGNMENT = eINSTANCE.getBooleanAssignment();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_ASSIGNMENT__VAR = eINSTANCE.getBooleanAssignment_Var();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_ASSIGNMENT__VALUE = eINSTANCE.getBooleanAssignment_Value();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.IntegerAssignmentImpl <em>Integer Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.IntegerAssignmentImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getIntegerAssignment()
     * @generated
     */
    EClass INTEGER_ASSIGNMENT = eINSTANCE.getIntegerAssignment();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGER_ASSIGNMENT__VAR = eINSTANCE.getIntegerAssignment_Var();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_ASSIGNMENT__VALUE = eINSTANCE.getIntegerAssignment_Value();

    /**
     * The meta object literal for the '{@link org.xtext.osy.extendedSMV.impl.StateAssignmentImpl <em>State Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.osy.extendedSMV.impl.StateAssignmentImpl
     * @see org.xtext.osy.extendedSMV.impl.ExtendedSMVPackageImpl#getStateAssignment()
     * @generated
     */
    EClass STATE_ASSIGNMENT = eINSTANCE.getStateAssignment();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_ASSIGNMENT__VAR = eINSTANCE.getStateAssignment_Var();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_ASSIGNMENT__VALUE = eINSTANCE.getStateAssignment_Value();

  }

} //ExtendedSMVPackage
