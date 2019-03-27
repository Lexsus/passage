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
package org.eclipse.passage.lic.runtime.access;

import org.eclipse.passage.lic.runtime.LicensingConfiguration;
import org.eclipse.passage.lic.runtime.requirements.LicensingRequirement;
import org.eclipse.passage.lic.runtime.restrictions.RestrictionExecutor;
import org.eclipse.passage.lic.runtime.restrictions.RestrictionVerdict;

/**
 * Examines how {@link FeaturePermission}(s) cover the
 * {@link LicensingRequirement}(s) and produce {@link RestrictionVerdict}(s) to
 * be consumed by {@link RestrictionExecutor}(s)
 */
public interface PermissionExaminer {

	Iterable<RestrictionVerdict> examine(LicensingConfiguration configuration,
			Iterable<LicensingRequirement> requirements, Iterable<FeaturePermission> permissions);

}
