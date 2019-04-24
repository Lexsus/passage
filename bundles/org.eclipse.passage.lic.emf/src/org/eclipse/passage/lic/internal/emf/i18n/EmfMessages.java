/*******************************************************************************
 * Copyright (c) 2019 ArSysOp
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
package org.eclipse.passage.lic.internal.emf.i18n;

import org.eclipse.osgi.util.NLS;

public class EmfMessages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.passage.lic.internal.emf.i18n.EmfMessages"; //$NON-NLS-1$
	public static String LicensingEcore_inpur_header;
	public static String LicensingEcore_input_entry;
	public static String LicensingEcore_input_invalid;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, EmfMessages.class);
	}

	private EmfMessages() {
	}
}
