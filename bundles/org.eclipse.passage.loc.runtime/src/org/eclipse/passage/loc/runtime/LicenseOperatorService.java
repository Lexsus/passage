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
package org.eclipse.passage.loc.runtime;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.passage.lic.licenses.LicensePackDescriptor;

public interface LicenseOperatorService {
	
	IStatus issueLicensePack(LicensePackDescriptor licensePack);

}
