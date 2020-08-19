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
package org.eclipse.passage.lbc.internal.base.requests;

import org.eclipse.passage.lbc.internal.api.BackendLicensingRequest;
import org.eclipse.passage.lbc.internal.api.ReleaseRequest;
import org.eclipse.passage.lbc.internal.api.Requester;
import org.eclipse.passage.lic.internal.api.restrictions.ExaminationCertificate;

public final class BaseReleaseRequest implements ReleaseRequest {

	private final BackendLicensingRequest request;

	public BaseReleaseRequest(BackendLicensingRequest request) {
		this.request = request;
	}

	@Override
	public Requester requester() {
		return request.requester();
	}

	@Override
	public ExaminationCertificate certificate() {
		throw new UnsupportedOperationException();
	}

}