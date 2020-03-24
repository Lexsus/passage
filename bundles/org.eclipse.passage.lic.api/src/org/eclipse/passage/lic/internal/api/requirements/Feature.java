/*******************************************************************************
 * Copyright (c) 2020 ArSysOp
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
package org.eclipse.passage.lic.internal.api.requirements;

/**
 * Describes a <i> feature under licensing</i> in context of access cycle
 * 
 * @see Requirement
 * @see org.eclipse.passage.lic.api
 */
public interface Feature {

	/**
	 * Name of the feature under requirement
	 */
	String name();

	/**
	 * Version of the feature under requirement
	 */
	String version();

	/**
	 * Id of the feature under licensing
	 */
	String identifier();

	String provider();

}
