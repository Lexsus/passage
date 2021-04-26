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
package org.eclipse.passage.loc.workspace;

import org.eclipse.passage.lic.internal.base.io.PassageFileExtension;

@SuppressWarnings("restriction")
interface DomainFileExtension {

	public static final class Keys extends PassageFileExtension {

		@Override
		public String get() {
			return ".keys_xmi"; //$NON-NLS-1$
		}

	}

}
