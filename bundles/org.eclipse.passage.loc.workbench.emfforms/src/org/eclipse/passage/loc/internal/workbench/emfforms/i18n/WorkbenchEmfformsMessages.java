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
package org.eclipse.passage.loc.internal.workbench.emfforms.i18n;

import org.eclipse.osgi.util.NLS;

public final class WorkbenchEmfformsMessages extends NLS {

	private static final String BUNDLE_NAME = "org.eclipse.passage.loc.internal.workbench.emfforms.i18n.WorkbenchEmfformsMessages"; //$NON-NLS-1$

	public static String DetailsView_label_details;
	public static String TextWithButtonRenderer_button_edit;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, WorkbenchEmfformsMessages.class);
	}

	private WorkbenchEmfformsMessages() {
	}
}