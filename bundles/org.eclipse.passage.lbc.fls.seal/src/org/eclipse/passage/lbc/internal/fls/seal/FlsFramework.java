/*******************************************************************************
 * Copyright (c) 2021 ArSysOp
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
package org.eclipse.passage.lbc.internal.fls.seal;

import org.eclipse.passage.lic.api.AccessCycleConfiguration;
import org.eclipse.passage.lic.api.Framework;
import org.eclipse.passage.lic.api.LicensedProduct;
import org.eclipse.passage.lic.api.LicensingException;
import org.eclipse.passage.lic.base.BaseFramework;
import org.eclipse.passage.lic.base.InvalidLicensedProduct;
import org.eclipse.passage.lic.internal.equinox.LicensedApplication;

@SuppressWarnings("restriction")
public class FlsFramework extends BaseFramework {

	static final Framework instance = new FlsFramework();

	@Override
	protected final LicensedProduct productRead() {
		LicensedProduct prod;
		try {
			prod = new LicensedApplication().product();
		} catch (LicensingException e) {
			prod = new InvalidLicensedProduct();
		}
		return prod;
	}

	@Override
	protected AccessCycleConfiguration configuration(LicensedProduct product) {
		return new SealedAccessCycleConfiguration(() -> product);
	}

}
