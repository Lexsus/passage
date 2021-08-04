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
package org.eclipse.passage.lic.agreements.model.meta;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.passage.lic.agreements.model.meta.AgreementsFactory
 * @model kind="package"
 * @generated
 */
public interface AgreementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "agreements"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/passage/lic/agreements/0.1.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "agreements"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AgreementsPackage eINSTANCE = org.eclipse.passage.lic.agreements.model.impl.AgreementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.passage.lic.agreements.AgreementDescriptor <em>Agreement Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.passage.lic.agreements.AgreementDescriptor
	 * @see org.eclipse.passage.lic.agreements.model.impl.AgreementsPackageImpl#getAgreementDescriptor()
	 * @generated
	 */
	int AGREEMENT_DESCRIPTOR = 0;

	/**
	 * The number of structural features of the '<em>Agreement Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_DESCRIPTOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Agreement Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.passage.lic.agreements.AgreementsRegistryDescriptor <em>Registry Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.passage.lic.agreements.AgreementsRegistryDescriptor
	 * @see org.eclipse.passage.lic.agreements.model.impl.AgreementsPackageImpl#getAgreementsRegistryDescriptor()
	 * @generated
	 */
	int AGREEMENTS_REGISTRY_DESCRIPTOR = 1;

	/**
	 * The number of structural features of the '<em>Registry Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENTS_REGISTRY_DESCRIPTOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Registry Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENTS_REGISTRY_DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.passage.lic.agreements.model.impl.AgreementImpl <em>Agreement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.passage.lic.agreements.model.impl.AgreementImpl
	 * @see org.eclipse.passage.lic.agreements.model.impl.AgreementsPackageImpl#getAgreement()
	 * @generated
	 */
	int AGREEMENT = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__IDENTIFIER = AGREEMENT_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Spdx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__SPDX = AGREEMENT_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__NAME = AGREEMENT_DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__FILE = AGREEMENT_DESCRIPTOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__MIME = AGREEMENT_DESCRIPTOR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_FEATURE_COUNT = AGREEMENT_DESCRIPTOR_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_OPERATION_COUNT = AGREEMENT_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.passage.lic.agreements.model.impl.AgreementsRegistryImpl <em>Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.passage.lic.agreements.model.impl.AgreementsRegistryImpl
	 * @see org.eclipse.passage.lic.agreements.model.impl.AgreementsPackageImpl#getAgreementsRegistry()
	 * @generated
	 */
	int AGREEMENTS_REGISTRY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENTS_REGISTRY__NAME = AGREEMENTS_REGISTRY_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENTS_REGISTRY__DESCRIPTION = AGREEMENTS_REGISTRY_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Agreements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENTS_REGISTRY__AGREEMENTS = AGREEMENTS_REGISTRY_DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENTS_REGISTRY_FEATURE_COUNT = AGREEMENTS_REGISTRY_DESCRIPTOR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENTS_REGISTRY_OPERATION_COUNT = AGREEMENTS_REGISTRY_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.passage.lic.agreements.model.api.Agreement <em>Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agreement</em>'.
	 * @see org.eclipse.passage.lic.agreements.model.api.Agreement
	 * @generated
	 */
	EClass getAgreement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.passage.lic.agreements.model.api.Agreement#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipse.passage.lic.agreements.model.api.Agreement#getIdentifier()
	 * @see #getAgreement()
	 * @generated
	 */
	EAttribute getAgreement_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.passage.lic.agreements.model.api.Agreement#getSpdx <em>Spdx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spdx</em>'.
	 * @see org.eclipse.passage.lic.agreements.model.api.Agreement#getSpdx()
	 * @see #getAgreement()
	 * @generated
	 */
	EAttribute getAgreement_Spdx();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.passage.lic.agreements.model.api.Agreement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.passage.lic.agreements.model.api.Agreement#getName()
	 * @see #getAgreement()
	 * @generated
	 */
	EAttribute getAgreement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.passage.lic.agreements.model.api.Agreement#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see org.eclipse.passage.lic.agreements.model.api.Agreement#getFile()
	 * @see #getAgreement()
	 * @generated
	 */
	EAttribute getAgreement_File();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.passage.lic.agreements.model.api.Agreement#getMime <em>Mime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime</em>'.
	 * @see org.eclipse.passage.lic.agreements.model.api.Agreement#getMime()
	 * @see #getAgreement()
	 * @generated
	 */
	EAttribute getAgreement_Mime();

	/**
	 * Returns the meta object for class '{@link org.eclipse.passage.lic.agreements.model.api.AgreementsRegistry <em>Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registry</em>'.
	 * @see org.eclipse.passage.lic.agreements.model.api.AgreementsRegistry
	 * @generated
	 */
	EClass getAgreementsRegistry();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.passage.lic.agreements.model.api.AgreementsRegistry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.passage.lic.agreements.model.api.AgreementsRegistry#getName()
	 * @see #getAgreementsRegistry()
	 * @generated
	 */
	EAttribute getAgreementsRegistry_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.passage.lic.agreements.model.api.AgreementsRegistry#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.passage.lic.agreements.model.api.AgreementsRegistry#getDescription()
	 * @see #getAgreementsRegistry()
	 * @generated
	 */
	EAttribute getAgreementsRegistry_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.passage.lic.agreements.model.api.AgreementsRegistry#getAgreements <em>Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agreements</em>'.
	 * @see org.eclipse.passage.lic.agreements.model.api.AgreementsRegistry#getAgreements()
	 * @see #getAgreementsRegistry()
	 * @generated
	 */
	EReference getAgreementsRegistry_Agreements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.passage.lic.agreements.AgreementDescriptor <em>Agreement Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agreement Descriptor</em>'.
	 * @see org.eclipse.passage.lic.agreements.AgreementDescriptor
	 * @model instanceClass="org.eclipse.passage.lic.agreements.AgreementDescriptor"
	 * @generated
	 */
	EClass getAgreementDescriptor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.passage.lic.agreements.AgreementsRegistryDescriptor <em>Registry Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registry Descriptor</em>'.
	 * @see org.eclipse.passage.lic.agreements.AgreementsRegistryDescriptor
	 * @model instanceClass="org.eclipse.passage.lic.agreements.AgreementsRegistryDescriptor"
	 * @generated
	 */
	EClass getAgreementsRegistryDescriptor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AgreementsFactory getAgreementsFactory();

} //AgreementsPackage
