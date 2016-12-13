/**
 */
package edu.uah.rsesc.aadlsimulator.xtext.inputConstraint;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.InputConstraintFactory
 * @model kind="package"
 * @generated
 */
public interface InputConstraintPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "inputConstraint";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://rsesc.uah.edu/aadlsimulator/xtext/InputConstraint";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "inputConstraint";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  InputConstraintPackage eINSTANCE = edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl.init();

  /**
   * The meta object id for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintImpl <em>Input Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintImpl
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getInputConstraint()
   * @generated
   */
  int INPUT_CONSTRAINT = 0;

  /**
   * The number of structural features of the '<em>Input Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_CONSTRAINT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.ExpressionImpl
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = INPUT_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.ScalarExpressionImpl <em>Scalar Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.ScalarExpressionImpl
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getScalarExpression()
   * @generated
   */
  int SCALAR_EXPRESSION = 2;

  /**
   * The number of structural features of the '<em>Scalar Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALAR_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.RandomExpressionImpl <em>Random Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.RandomExpressionImpl
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getRandomExpression()
   * @generated
   */
  int RANDOM_EXPRESSION = 3;

  /**
   * The number of structural features of the '<em>Random Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_EXPRESSION_FEATURE_COUNT = SCALAR_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.RefExpressionImpl <em>Ref Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.RefExpressionImpl
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getRefExpression()
   * @generated
   */
  int REF_EXPRESSION = 4;

  /**
   * The number of structural features of the '<em>Ref Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_EXPRESSION_FEATURE_COUNT = SCALAR_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.IntervalExpressionImpl <em>Interval Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.IntervalExpressionImpl
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getIntervalExpression()
   * @generated
   */
  int INTERVAL_EXPRESSION = 5;

  /**
   * The feature id for the '<em><b>Left Closed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL_EXPRESSION__LEFT_CLOSED = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Right Closed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL_EXPRESSION__RIGHT_CLOSED = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Interval Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.SetExpressionImpl <em>Set Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.SetExpressionImpl
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getSetExpression()
   * @generated
   */
  int SET_EXPRESSION = 6;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_EXPRESSION__MEMBERS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Set Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.IntegerLiteralImpl
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getIntegerLiteral()
   * @generated
   */
  int INTEGER_LITERAL = 7;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL__VALUE = SCALAR_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL_FEATURE_COUNT = SCALAR_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.RealLiteralImpl <em>Real Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.RealLiteralImpl
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getRealLiteral()
   * @generated
   */
  int REAL_LITERAL = 8;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_LITERAL__VALUE = SCALAR_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Real Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_LITERAL_FEATURE_COUNT = SCALAR_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.BooleanLiteralImpl
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getBooleanLiteral()
   * @generated
   */
  int BOOLEAN_LITERAL = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__VALUE = SCALAR_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_FEATURE_COUNT = SCALAR_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.BinaryExpressionImpl
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getBinaryExpression()
   * @generated
   */
  int BINARY_EXPRESSION = 10;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION__LEFT = SCALAR_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION__OP = SCALAR_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION__RIGHT = SCALAR_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Binary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_FEATURE_COUNT = SCALAR_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.PreExpressionImpl <em>Pre Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.PreExpressionImpl
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getPreExpression()
   * @generated
   */
  int PRE_EXPRESSION = 11;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_EXPRESSION__REF = SCALAR_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pre Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_EXPRESSION_FEATURE_COUNT = SCALAR_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.RandomIntegerExpressionImpl <em>Random Integer Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.RandomIntegerExpressionImpl
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getRandomIntegerExpression()
   * @generated
   */
  int RANDOM_INTEGER_EXPRESSION = 12;

  /**
   * The feature id for the '<em><b>Interval</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_INTEGER_EXPRESSION__INTERVAL = RANDOM_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Random Integer Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_INTEGER_EXPRESSION_FEATURE_COUNT = RANDOM_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.RandomRealExpressionImpl <em>Random Real Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.RandomRealExpressionImpl
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getRandomRealExpression()
   * @generated
   */
  int RANDOM_REAL_EXPRESSION = 13;

  /**
   * The feature id for the '<em><b>Interval</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_REAL_EXPRESSION__INTERVAL = RANDOM_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Random Real Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_REAL_EXPRESSION_FEATURE_COUNT = RANDOM_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.RandomElementExpressionImpl <em>Random Element Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.RandomElementExpressionImpl
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getRandomElementExpression()
   * @generated
   */
  int RANDOM_ELEMENT_EXPRESSION = 14;

  /**
   * The feature id for the '<em><b>Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_ELEMENT_EXPRESSION__SET = RANDOM_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Random Element Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_ELEMENT_EXPRESSION_FEATURE_COUNT = RANDOM_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.ElementRefExpressionImpl <em>Element Ref Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.ElementRefExpressionImpl
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getElementRefExpression()
   * @generated
   */
  int ELEMENT_REF_EXPRESSION = 15;

  /**
   * The feature id for the '<em><b>Ids</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_REF_EXPRESSION__IDS = REF_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Element Ref Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_REF_EXPRESSION_FEATURE_COUNT = REF_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.ConstRefExpressionImpl <em>Const Ref Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.ConstRefExpressionImpl
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getConstRefExpression()
   * @generated
   */
  int CONST_REF_EXPRESSION = 16;

  /**
   * The feature id for the '<em><b>Package Segments</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONST_REF_EXPRESSION__PACKAGE_SEGMENTS = REF_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Constant Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONST_REF_EXPRESSION__CONSTANT_NAME = REF_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Const Ref Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONST_REF_EXPRESSION_FEATURE_COUNT = REF_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.NegativeExpressionImpl <em>Negative Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.NegativeExpressionImpl
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getNegativeExpression()
   * @generated
   */
  int NEGATIVE_EXPRESSION = 17;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_EXPRESSION__VALUE = SCALAR_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Negative Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_EXPRESSION_FEATURE_COUNT = SCALAR_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.Operator <em>Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.Operator
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getOperator()
   * @generated
   */
  int OPERATOR = 18;


  /**
   * Returns the meta object for class '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.InputConstraint <em>Input Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Constraint</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.InputConstraint
   * @generated
   */
  EClass getInputConstraint();

  /**
   * Returns the meta object for class '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.ScalarExpression <em>Scalar Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scalar Expression</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.ScalarExpression
   * @generated
   */
  EClass getScalarExpression();

  /**
   * Returns the meta object for class '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.RandomExpression <em>Random Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Random Expression</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.RandomExpression
   * @generated
   */
  EClass getRandomExpression();

  /**
   * Returns the meta object for class '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.RefExpression <em>Ref Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Expression</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.RefExpression
   * @generated
   */
  EClass getRefExpression();

  /**
   * Returns the meta object for class '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.IntervalExpression <em>Interval Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interval Expression</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.IntervalExpression
   * @generated
   */
  EClass getIntervalExpression();

  /**
   * Returns the meta object for the attribute '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.IntervalExpression#isLeftClosed <em>Left Closed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Left Closed</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.IntervalExpression#isLeftClosed()
   * @see #getIntervalExpression()
   * @generated
   */
  EAttribute getIntervalExpression_LeftClosed();

  /**
   * Returns the meta object for the containment reference '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.IntervalExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.IntervalExpression#getLeft()
   * @see #getIntervalExpression()
   * @generated
   */
  EReference getIntervalExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.IntervalExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.IntervalExpression#getRight()
   * @see #getIntervalExpression()
   * @generated
   */
  EReference getIntervalExpression_Right();

  /**
   * Returns the meta object for the attribute '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.IntervalExpression#isRightClosed <em>Right Closed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right Closed</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.IntervalExpression#isRightClosed()
   * @see #getIntervalExpression()
   * @generated
   */
  EAttribute getIntervalExpression_RightClosed();

  /**
   * Returns the meta object for class '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.SetExpression <em>Set Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Expression</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.SetExpression
   * @generated
   */
  EClass getSetExpression();

  /**
   * Returns the meta object for the containment reference list '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.SetExpression#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.SetExpression#getMembers()
   * @see #getSetExpression()
   * @generated
   */
  EReference getSetExpression_Members();

  /**
   * Returns the meta object for class '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.IntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Literal</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.IntegerLiteral
   * @generated
   */
  EClass getIntegerLiteral();

  /**
   * Returns the meta object for the attribute '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.IntegerLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.IntegerLiteral#getValue()
   * @see #getIntegerLiteral()
   * @generated
   */
  EAttribute getIntegerLiteral_Value();

  /**
   * Returns the meta object for class '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.RealLiteral <em>Real Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Real Literal</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.RealLiteral
   * @generated
   */
  EClass getRealLiteral();

  /**
   * Returns the meta object for the attribute '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.RealLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.RealLiteral#getValue()
   * @see #getRealLiteral()
   * @generated
   */
  EAttribute getRealLiteral_Value();

  /**
   * Returns the meta object for class '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Literal</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.BooleanLiteral
   * @generated
   */
  EClass getBooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.BooleanLiteral#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.BooleanLiteral#isValue()
   * @see #getBooleanLiteral()
   * @generated
   */
  EAttribute getBooleanLiteral_Value();

  /**
   * Returns the meta object for class '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.BinaryExpression <em>Binary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Expression</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.BinaryExpression
   * @generated
   */
  EClass getBinaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.BinaryExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.BinaryExpression#getLeft()
   * @see #getBinaryExpression()
   * @generated
   */
  EReference getBinaryExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.BinaryExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.BinaryExpression#getOp()
   * @see #getBinaryExpression()
   * @generated
   */
  EAttribute getBinaryExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.BinaryExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.BinaryExpression#getRight()
   * @see #getBinaryExpression()
   * @generated
   */
  EReference getBinaryExpression_Right();

  /**
   * Returns the meta object for class '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.PreExpression <em>Pre Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pre Expression</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.PreExpression
   * @generated
   */
  EClass getPreExpression();

  /**
   * Returns the meta object for the containment reference '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.PreExpression#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.PreExpression#getRef()
   * @see #getPreExpression()
   * @generated
   */
  EReference getPreExpression_Ref();

  /**
   * Returns the meta object for class '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.RandomIntegerExpression <em>Random Integer Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Random Integer Expression</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.RandomIntegerExpression
   * @generated
   */
  EClass getRandomIntegerExpression();

  /**
   * Returns the meta object for the containment reference '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.RandomIntegerExpression#getInterval <em>Interval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interval</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.RandomIntegerExpression#getInterval()
   * @see #getRandomIntegerExpression()
   * @generated
   */
  EReference getRandomIntegerExpression_Interval();

  /**
   * Returns the meta object for class '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.RandomRealExpression <em>Random Real Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Random Real Expression</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.RandomRealExpression
   * @generated
   */
  EClass getRandomRealExpression();

  /**
   * Returns the meta object for the containment reference '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.RandomRealExpression#getInterval <em>Interval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interval</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.RandomRealExpression#getInterval()
   * @see #getRandomRealExpression()
   * @generated
   */
  EReference getRandomRealExpression_Interval();

  /**
   * Returns the meta object for class '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.RandomElementExpression <em>Random Element Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Random Element Expression</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.RandomElementExpression
   * @generated
   */
  EClass getRandomElementExpression();

  /**
   * Returns the meta object for the containment reference '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.RandomElementExpression#getSet <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Set</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.RandomElementExpression#getSet()
   * @see #getRandomElementExpression()
   * @generated
   */
  EReference getRandomElementExpression_Set();

  /**
   * Returns the meta object for class '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.ElementRefExpression <em>Element Ref Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Ref Expression</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.ElementRefExpression
   * @generated
   */
  EClass getElementRefExpression();

  /**
   * Returns the meta object for the attribute list '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.ElementRefExpression#getIds <em>Ids</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Ids</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.ElementRefExpression#getIds()
   * @see #getElementRefExpression()
   * @generated
   */
  EAttribute getElementRefExpression_Ids();

  /**
   * Returns the meta object for class '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.ConstRefExpression <em>Const Ref Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Const Ref Expression</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.ConstRefExpression
   * @generated
   */
  EClass getConstRefExpression();

  /**
   * Returns the meta object for the attribute list '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.ConstRefExpression#getPackageSegments <em>Package Segments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Package Segments</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.ConstRefExpression#getPackageSegments()
   * @see #getConstRefExpression()
   * @generated
   */
  EAttribute getConstRefExpression_PackageSegments();

  /**
   * Returns the meta object for the attribute '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.ConstRefExpression#getConstantName <em>Constant Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constant Name</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.ConstRefExpression#getConstantName()
   * @see #getConstRefExpression()
   * @generated
   */
  EAttribute getConstRefExpression_ConstantName();

  /**
   * Returns the meta object for class '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.NegativeExpression <em>Negative Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Negative Expression</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.NegativeExpression
   * @generated
   */
  EClass getNegativeExpression();

  /**
   * Returns the meta object for the containment reference '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.NegativeExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.NegativeExpression#getValue()
   * @see #getNegativeExpression()
   * @generated
   */
  EReference getNegativeExpression_Value();

  /**
   * Returns the meta object for enum '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Operator</em>'.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.Operator
   * @generated
   */
  EEnum getOperator();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  InputConstraintFactory getInputConstraintFactory();

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
     * The meta object literal for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintImpl <em>Input Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintImpl
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getInputConstraint()
     * @generated
     */
    EClass INPUT_CONSTRAINT = eINSTANCE.getInputConstraint();

    /**
     * The meta object literal for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.ExpressionImpl
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.ScalarExpressionImpl <em>Scalar Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.ScalarExpressionImpl
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getScalarExpression()
     * @generated
     */
    EClass SCALAR_EXPRESSION = eINSTANCE.getScalarExpression();

    /**
     * The meta object literal for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.RandomExpressionImpl <em>Random Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.RandomExpressionImpl
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getRandomExpression()
     * @generated
     */
    EClass RANDOM_EXPRESSION = eINSTANCE.getRandomExpression();

    /**
     * The meta object literal for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.RefExpressionImpl <em>Ref Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.RefExpressionImpl
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getRefExpression()
     * @generated
     */
    EClass REF_EXPRESSION = eINSTANCE.getRefExpression();

    /**
     * The meta object literal for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.IntervalExpressionImpl <em>Interval Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.IntervalExpressionImpl
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getIntervalExpression()
     * @generated
     */
    EClass INTERVAL_EXPRESSION = eINSTANCE.getIntervalExpression();

    /**
     * The meta object literal for the '<em><b>Left Closed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERVAL_EXPRESSION__LEFT_CLOSED = eINSTANCE.getIntervalExpression_LeftClosed();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERVAL_EXPRESSION__LEFT = eINSTANCE.getIntervalExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERVAL_EXPRESSION__RIGHT = eINSTANCE.getIntervalExpression_Right();

    /**
     * The meta object literal for the '<em><b>Right Closed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERVAL_EXPRESSION__RIGHT_CLOSED = eINSTANCE.getIntervalExpression_RightClosed();

    /**
     * The meta object literal for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.SetExpressionImpl <em>Set Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.SetExpressionImpl
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getSetExpression()
     * @generated
     */
    EClass SET_EXPRESSION = eINSTANCE.getSetExpression();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_EXPRESSION__MEMBERS = eINSTANCE.getSetExpression_Members();

    /**
     * The meta object literal for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.IntegerLiteralImpl
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getIntegerLiteral()
     * @generated
     */
    EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_LITERAL__VALUE = eINSTANCE.getIntegerLiteral_Value();

    /**
     * The meta object literal for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.RealLiteralImpl <em>Real Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.RealLiteralImpl
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getRealLiteral()
     * @generated
     */
    EClass REAL_LITERAL = eINSTANCE.getRealLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REAL_LITERAL__VALUE = eINSTANCE.getRealLiteral_Value();

    /**
     * The meta object literal for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.BooleanLiteralImpl
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getBooleanLiteral()
     * @generated
     */
    EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

    /**
     * The meta object literal for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.BinaryExpressionImpl
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getBinaryExpression()
     * @generated
     */
    EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_EXPRESSION__LEFT = eINSTANCE.getBinaryExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINARY_EXPRESSION__OP = eINSTANCE.getBinaryExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_EXPRESSION__RIGHT = eINSTANCE.getBinaryExpression_Right();

    /**
     * The meta object literal for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.PreExpressionImpl <em>Pre Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.PreExpressionImpl
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getPreExpression()
     * @generated
     */
    EClass PRE_EXPRESSION = eINSTANCE.getPreExpression();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRE_EXPRESSION__REF = eINSTANCE.getPreExpression_Ref();

    /**
     * The meta object literal for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.RandomIntegerExpressionImpl <em>Random Integer Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.RandomIntegerExpressionImpl
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getRandomIntegerExpression()
     * @generated
     */
    EClass RANDOM_INTEGER_EXPRESSION = eINSTANCE.getRandomIntegerExpression();

    /**
     * The meta object literal for the '<em><b>Interval</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RANDOM_INTEGER_EXPRESSION__INTERVAL = eINSTANCE.getRandomIntegerExpression_Interval();

    /**
     * The meta object literal for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.RandomRealExpressionImpl <em>Random Real Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.RandomRealExpressionImpl
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getRandomRealExpression()
     * @generated
     */
    EClass RANDOM_REAL_EXPRESSION = eINSTANCE.getRandomRealExpression();

    /**
     * The meta object literal for the '<em><b>Interval</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RANDOM_REAL_EXPRESSION__INTERVAL = eINSTANCE.getRandomRealExpression_Interval();

    /**
     * The meta object literal for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.RandomElementExpressionImpl <em>Random Element Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.RandomElementExpressionImpl
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getRandomElementExpression()
     * @generated
     */
    EClass RANDOM_ELEMENT_EXPRESSION = eINSTANCE.getRandomElementExpression();

    /**
     * The meta object literal for the '<em><b>Set</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RANDOM_ELEMENT_EXPRESSION__SET = eINSTANCE.getRandomElementExpression_Set();

    /**
     * The meta object literal for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.ElementRefExpressionImpl <em>Element Ref Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.ElementRefExpressionImpl
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getElementRefExpression()
     * @generated
     */
    EClass ELEMENT_REF_EXPRESSION = eINSTANCE.getElementRefExpression();

    /**
     * The meta object literal for the '<em><b>Ids</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_REF_EXPRESSION__IDS = eINSTANCE.getElementRefExpression_Ids();

    /**
     * The meta object literal for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.ConstRefExpressionImpl <em>Const Ref Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.ConstRefExpressionImpl
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getConstRefExpression()
     * @generated
     */
    EClass CONST_REF_EXPRESSION = eINSTANCE.getConstRefExpression();

    /**
     * The meta object literal for the '<em><b>Package Segments</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONST_REF_EXPRESSION__PACKAGE_SEGMENTS = eINSTANCE.getConstRefExpression_PackageSegments();

    /**
     * The meta object literal for the '<em><b>Constant Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONST_REF_EXPRESSION__CONSTANT_NAME = eINSTANCE.getConstRefExpression_ConstantName();

    /**
     * The meta object literal for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.NegativeExpressionImpl <em>Negative Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.NegativeExpressionImpl
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getNegativeExpression()
     * @generated
     */
    EClass NEGATIVE_EXPRESSION = eINSTANCE.getNegativeExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEGATIVE_EXPRESSION__VALUE = eINSTANCE.getNegativeExpression_Value();

    /**
     * The meta object literal for the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.Operator <em>Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.Operator
     * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl.InputConstraintPackageImpl#getOperator()
     * @generated
     */
    EEnum OPERATOR = eINSTANCE.getOperator();

  }

} //InputConstraintPackage
