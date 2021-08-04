/*******************************************************************************
 * Copyright (c) 2018, 2021 ArSysOp
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0/.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     ArSysOp - initial API and implementation
 *******************************************************************************/
package org.eclipse.passage.lic.agreements.model.impl;

import java.util.Collection;
import java.util.Objects;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.passage.lic.agreements.model.api.Agreement;
import org.eclipse.passage.lic.agreements.model.api.AgreementsRegistry;

import org.eclipse.passage.lic.agreements.model.meta.AgreementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.passage.lic.agreements.model.impl.AgreementsRegistryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.passage.lic.agreements.model.impl.AgreementsRegistryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.passage.lic.agreements.model.impl.AgreementsRegistryImpl#getAgreements <em>Agreements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgreementsRegistryImpl extends MinimalEObjectImpl.Container implements AgreementsRegistry {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	private String name = NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	private String description = DESCRIPTION_EDEFAULT;
	/**
	 * The cached value of the '{@link #getAgreements() <em>Agreements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreements()
	 * @generated
	 * @ordered
	 */
	protected EList<Agreement> agreements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgreementsRegistryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgreementsPackage.eINSTANCE.getAgreementsRegistry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementsPackage.AGREEMENTS_REGISTRY__NAME, oldName,
					name));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementsPackage.AGREEMENTS_REGISTRY__DESCRIPTION,
					oldDescription, description));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Agreement> getAgreements() {
		if (agreements == null) {
			agreements = new EObjectContainmentEList<Agreement>(Agreement.class, this,
					AgreementsPackage.AGREEMENTS_REGISTRY__AGREEMENTS);
		}
		return agreements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AgreementsPackage.AGREEMENTS_REGISTRY__AGREEMENTS:
			return ((InternalEList<?>) getAgreements()).basicRemove(otherEnd, msgs);
		default:
			return super.eInverseRemove(otherEnd, featureID, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AgreementsPackage.AGREEMENTS_REGISTRY__NAME:
			return getName();
		case AgreementsPackage.AGREEMENTS_REGISTRY__DESCRIPTION:
			return getDescription();
		case AgreementsPackage.AGREEMENTS_REGISTRY__AGREEMENTS:
			return getAgreements();
		default:
			return super.eGet(featureID, resolve, coreType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AgreementsPackage.AGREEMENTS_REGISTRY__NAME:
			setName((String) newValue);
			return;
		case AgreementsPackage.AGREEMENTS_REGISTRY__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case AgreementsPackage.AGREEMENTS_REGISTRY__AGREEMENTS:
			getAgreements().clear();
			getAgreements().addAll((Collection<? extends Agreement>) newValue);
			return;
		default:
			super.eSet(featureID, newValue);
			return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case AgreementsPackage.AGREEMENTS_REGISTRY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case AgreementsPackage.AGREEMENTS_REGISTRY__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case AgreementsPackage.AGREEMENTS_REGISTRY__AGREEMENTS:
			getAgreements().clear();
			return;
		default:
			super.eUnset(featureID);
			return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AgreementsPackage.AGREEMENTS_REGISTRY__NAME:
			return !Objects.equals(NAME_EDEFAULT, name);
		case AgreementsPackage.AGREEMENTS_REGISTRY__DESCRIPTION:
			return !Objects.equals(DESCRIPTION_EDEFAULT, description);
		case AgreementsPackage.AGREEMENTS_REGISTRY__AGREEMENTS:
			return agreements != null && !agreements.isEmpty();
		default:
			return super.eIsSet(featureID);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}
		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", description: "); //$NON-NLS-1$
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //AgreementsRegistryImpl
