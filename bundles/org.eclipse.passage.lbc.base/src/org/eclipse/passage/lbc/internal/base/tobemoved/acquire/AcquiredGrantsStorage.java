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
package org.eclipse.passage.lbc.internal.base.tobemoved.acquire;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import org.eclipse.passage.lic.floating.model.api.FeatureGrant;
import org.eclipse.passage.lic.floating.model.api.GrantAcqisition;
import org.eclipse.passage.lic.floating.model.meta.FloatingFactory;
import org.eclipse.passage.lic.internal.api.LicensedProduct;

final class AcquiredGrantsStorage {

	/**
	 * <p>
	 * For a {@code product} we keep all {@code acquisitions} in a {@code Map}
	 * </p>
	 * <p>
	 * LicensedProduct -> [FeatureGrant::identifier -> {GrantAcquistion}s]
	 * </p>
	 * <p>
	 * Where each {@code feature grant} (globally uniquely identified) keeps it's
	 * own collection of {@code acquisitions}
	 * </p>
	 */
	private final Map<LicensedProduct, Map<String, Collection<GrantAcqisition>>> locks = new HashMap<>();

	AcquiredGrantsStorage() {
		synchronized (this) {
			// TODO: read locks from persistent state #569158
		}
	}

	synchronized Optional<GrantAcqisition> acquire(LicensedProduct product, String user, FeatureGrant grant) {
		Collection<GrantAcqisition> acquisitions = grantLocks(product, grant.getIdentifier());
		if (acquisitions.size() < grant.getCapacity()) {
			GrantAcqisition acquistion = acquistion(grant, user);
			acquisitions.add(acquistion);
			return Optional.of(acquistion);
		}
		return Optional.empty();
	}

	synchronized boolean release(LicensedProduct product, GrantAcqisition acquisition) {
		Collection<GrantAcqisition> colleagues = grantLocks(product, acquisition.getGrant());
		for (GrantAcqisition colleage : colleagues) {
			if (matches(colleage, acquisition)) {
				colleagues.remove(colleage);
				return true;
			}
		}
		return false;
	}

	private boolean matches(GrantAcqisition actual, GrantAcqisition expected) {
		return actual.getIdentifier().equals(expected.getIdentifier());
	}

	private GrantAcqisition acquistion(FeatureGrant grant, String user) {
		GrantAcqisition acquisition = FloatingFactory.eINSTANCE.createGrantAcqisition();
		acquisition.setCreated(new Date());
		acquisition.setFeature(grant.getFeature());
		acquisition.setGrant(grant.getIdentifier());
		acquisition.setIdentifier(UUID.randomUUID().toString());
		acquisition.setUser(user);
		return acquisition;
	}

	private Collection<GrantAcqisition> grantLocks(LicensedProduct product, String grant) {
		return productLocks(product).computeIfAbsent(grant, id -> new HashSet<>());
	}

	private Map<String, Collection<GrantAcqisition>> productLocks(LicensedProduct product) {
		return locks.computeIfAbsent(product, p -> new HashMap<String, Collection<GrantAcqisition>>());
	}

}
