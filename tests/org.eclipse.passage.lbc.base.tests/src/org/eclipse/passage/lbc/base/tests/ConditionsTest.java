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
package org.eclipse.passage.lbc.base.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.passage.lbc.internal.api.FloatingResponse;
import org.eclipse.passage.lbc.internal.base.ProductUserRequest;
import org.eclipse.passage.lbc.internal.base.mine.Conditions;
import org.eclipse.passage.lic.internal.api.LicensingException;
import org.eclipse.passage.lic.internal.base.ProductIdentifier;
import org.eclipse.passage.lic.internal.base.ProductVersion;
import org.eclipse.passage.lic.internal.net.LicenseUser;
import org.eclipse.passage.lic.licenses.model.api.LicenseGrant;
import org.junit.Test;

public final class ConditionsTest {

	@Test
	public void mineAllForRightUser() throws LicensingException, IOException {
		TestData data = new TestData();
		LicenseGrant grant = mineForUser(data.albert.id, 1).get(0);
		data.assertGrantIsValid(grant);
	}

	@Test
	public void mineNothingForWrongUser() throws LicensingException, IOException {
		mineForUser("imposter", 0); //$NON-NLS-1$
	}

	private List<LicenseGrant> mineForUser(String user, int conditions) throws IOException, LicensingException {
		FloatingResponse response = new Conditions(request(user), new LicFolder()).get();
		assertFalse(response.failed());
		EList<LicenseGrant> grants = new License(response).get().getLicenseGrants();
		assertEquals(conditions, grants.size());
		return grants;
	}

	private ProductUserRequest request(String user) throws LicensingException {
		return new ProductUserRequest(//
				new RequestConstructed()//
						.withParameters(Arrays.asList(//
								new ProductIdentifier("anti-human-magic.product"), //$NON-NLS-1$
								new ProductVersion("0.2.1"), //$NON-NLS-1$
								new LicenseUser(user)))
						.get()//
		);
	}

}