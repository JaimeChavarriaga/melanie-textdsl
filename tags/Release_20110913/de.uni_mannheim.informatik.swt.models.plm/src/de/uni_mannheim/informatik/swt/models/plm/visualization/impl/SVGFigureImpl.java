/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.visualization.impl;

import de.uni_mannheim.informatik.swt.models.plm.visualization.SVGFigure;
import de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SVG Figure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.SVGFigureImpl#getDocumentURI <em>Document URI</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.SVGFigureImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.SVGFigureImpl#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SVGFigureImpl extends ShapeDescriptorImpl implements SVGFigure {
	/**
	 * The default value of the '{@link #getDocumentURI() <em>Document URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentURI()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentURI() <em>Document URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentURI()
	 * @generated
	 * @ordered
	 */
	protected String documentURI = DOCUMENT_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SVGFigureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualizationPackage.Literals.SVG_FIGURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentURI() {
		return documentURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentURI(String newDocumentURI) {
		String oldDocumentURI = documentURI;
		documentURI = newDocumentURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.SVG_FIGURE__DOCUMENT_URI, oldDocumentURI, documentURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.SVG_FIGURE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.SVG_FIGURE__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisualizationPackage.SVG_FIGURE__DOCUMENT_URI:
				return getDocumentURI();
			case VisualizationPackage.SVG_FIGURE__WIDTH:
				return getWidth();
			case VisualizationPackage.SVG_FIGURE__HEIGHT:
				return getHeight();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VisualizationPackage.SVG_FIGURE__DOCUMENT_URI:
				setDocumentURI((String)newValue);
				return;
			case VisualizationPackage.SVG_FIGURE__WIDTH:
				setWidth((Integer)newValue);
				return;
			case VisualizationPackage.SVG_FIGURE__HEIGHT:
				setHeight((Integer)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case VisualizationPackage.SVG_FIGURE__DOCUMENT_URI:
				setDocumentURI(DOCUMENT_URI_EDEFAULT);
				return;
			case VisualizationPackage.SVG_FIGURE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case VisualizationPackage.SVG_FIGURE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VisualizationPackage.SVG_FIGURE__DOCUMENT_URI:
				return DOCUMENT_URI_EDEFAULT == null ? documentURI != null : !DOCUMENT_URI_EDEFAULT.equals(documentURI);
			case VisualizationPackage.SVG_FIGURE__WIDTH:
				return width != WIDTH_EDEFAULT;
			case VisualizationPackage.SVG_FIGURE__HEIGHT:
				return height != HEIGHT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (documentURI: ");
		result.append(documentURI);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(')');
		return result.toString();
	}

} //SVGFigureImpl
