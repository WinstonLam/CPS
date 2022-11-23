/**
 * generated by Xtext 2.28.0
 */
package grid.gameoflife.gameOfLifeDSL.impl;

import grid.gameoflife.gameOfLifeDSL.Cell;
import grid.gameoflife.gameOfLifeDSL.GameOfLifeDSLPackage;
import grid.gameoflife.gameOfLifeDSL.State;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link grid.gameoflife.gameOfLifeDSL.impl.CellImpl#getRow <em>Row</em>}</li>
 *   <li>{@link grid.gameoflife.gameOfLifeDSL.impl.CellImpl#getCol <em>Col</em>}</li>
 *   <li>{@link grid.gameoflife.gameOfLifeDSL.impl.CellImpl#getState <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CellImpl extends MinimalEObjectImpl.Container implements Cell
{
  /**
   * The default value of the '{@link #getRow() <em>Row</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRow()
   * @generated
   * @ordered
   */
  protected static final int ROW_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRow() <em>Row</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRow()
   * @generated
   * @ordered
   */
  protected int row = ROW_EDEFAULT;

  /**
   * The default value of the '{@link #getCol() <em>Col</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCol()
   * @generated
   * @ordered
   */
  protected static final int COL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCol() <em>Col</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCol()
   * @generated
   * @ordered
   */
  protected int col = COL_EDEFAULT;

  /**
   * The default value of the '{@link #getState() <em>State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected static final State STATE_EDEFAULT = State.DEAD;

  /**
   * The cached value of the '{@link #getState() <em>State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected State state = STATE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CellImpl()
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
    return GameOfLifeDSLPackage.Literals.CELL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getRow()
  {
    return row;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRow(int newRow)
  {
    int oldRow = row;
    row = newRow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GameOfLifeDSLPackage.CELL__ROW, oldRow, row));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getCol()
  {
    return col;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCol(int newCol)
  {
    int oldCol = col;
    col = newCol;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GameOfLifeDSLPackage.CELL__COL, oldCol, col));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public State getState()
  {
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setState(State newState)
  {
    State oldState = state;
    state = newState == null ? STATE_EDEFAULT : newState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GameOfLifeDSLPackage.CELL__STATE, oldState, state));
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
      case GameOfLifeDSLPackage.CELL__ROW:
        return getRow();
      case GameOfLifeDSLPackage.CELL__COL:
        return getCol();
      case GameOfLifeDSLPackage.CELL__STATE:
        return getState();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GameOfLifeDSLPackage.CELL__ROW:
        setRow((Integer)newValue);
        return;
      case GameOfLifeDSLPackage.CELL__COL:
        setCol((Integer)newValue);
        return;
      case GameOfLifeDSLPackage.CELL__STATE:
        setState((State)newValue);
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
      case GameOfLifeDSLPackage.CELL__ROW:
        setRow(ROW_EDEFAULT);
        return;
      case GameOfLifeDSLPackage.CELL__COL:
        setCol(COL_EDEFAULT);
        return;
      case GameOfLifeDSLPackage.CELL__STATE:
        setState(STATE_EDEFAULT);
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
      case GameOfLifeDSLPackage.CELL__ROW:
        return row != ROW_EDEFAULT;
      case GameOfLifeDSLPackage.CELL__COL:
        return col != COL_EDEFAULT;
      case GameOfLifeDSLPackage.CELL__STATE:
        return state != STATE_EDEFAULT;
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (row: ");
    result.append(row);
    result.append(", col: ");
    result.append(col);
    result.append(", state: ");
    result.append(state);
    result.append(')');
    return result.toString();
  }

} //CellImpl