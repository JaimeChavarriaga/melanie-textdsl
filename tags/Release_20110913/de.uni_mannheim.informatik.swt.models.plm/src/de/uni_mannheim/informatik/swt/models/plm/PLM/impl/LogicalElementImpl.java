/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.PLM.impl;

import de.uni_mannheim.informatik.swt.models.plm.PLM.LogicalElement;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class LogicalElementImpl extends OwnedElementImpl implements LogicalElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PLMPackage.Literals.LOGICAL_ELEMENT;
	}

	/**
	 * The cached invocation delegate for the '{@link #getModel() <em>Get Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_MODEL__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.LOGICAL_ELEMENT___GET_MODEL).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		try {
			return (Model)GET_MODEL__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PLMPackage.LOGICAL_ELEMENT___GET_MODEL:
				return getModel();
		}
		return super.eInvoke(operationID, arguments);
	}

} //LogicalElementImpl
