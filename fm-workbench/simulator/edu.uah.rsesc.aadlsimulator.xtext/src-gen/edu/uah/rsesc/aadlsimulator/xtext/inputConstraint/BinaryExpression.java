/**
 */
package edu.uah.rsesc.aadlsimulator.xtext.inputConstraint;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.BinaryExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.BinaryExpression#getOp <em>Op</em>}</li>
 *   <li>{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.BinaryExpression#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.InputConstraintPackage#getBinaryExpression()
 * @model
 * @generated
 */
public interface BinaryExpression extends ScalarExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(ScalarExpression)
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.InputConstraintPackage#getBinaryExpression_Left()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getLeft();

  /**
   * Sets the value of the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.BinaryExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(ScalarExpression value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * The literals are from the enumeration {@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.Operator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.Operator
   * @see #setOp(Operator)
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.InputConstraintPackage#getBinaryExpression_Op()
   * @model
   * @generated
   */
  Operator getOp();

  /**
   * Sets the value of the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.BinaryExpression#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.Operator
   * @see #getOp()
   * @generated
   */
  void setOp(Operator value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(ScalarExpression)
   * @see edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.InputConstraintPackage#getBinaryExpression_Right()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getRight();

  /**
   * Sets the value of the '{@link edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.BinaryExpression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(ScalarExpression value);

} // BinaryExpression
