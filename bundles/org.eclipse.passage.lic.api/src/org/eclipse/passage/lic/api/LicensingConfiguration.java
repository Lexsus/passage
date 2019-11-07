/*******************************************************************************
 * Copyright (c) 2018-2019 ArSysOp
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     ArSysOp - initial API and implementation
 *******************************************************************************/
package org.eclipse.passage.lic.api;

/**
 * Runtime descriptor for the configuration being examined for restrictions.
 * <p>
 * It represents the pair <code>{id, version</code>} for the running product.
 * </p>
 *
 * @since 0.4.0
 */
public interface LicensingConfiguration {

	String getProductIdentifier();

	String getProductVersion();

}
