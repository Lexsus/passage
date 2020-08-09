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
package org.eclipse.passage.lbc.internal.base;

import java.util.Optional;
import java.util.function.Supplier;

import org.eclipse.passage.lbc.internal.api.MiningRequest;
import org.eclipse.passage.lic.internal.base.ProductIdentifier;
import org.eclipse.passage.lic.internal.base.ProductVersion;

/**
 * @since 1.0
 */
public class BaseMiningRequest implements MiningRequest {

	private final ProductIdentifier identifier;
	private final ProductVersion version;
	private final Requester user;

	public BaseMiningRequest(ProductIdentifier identifier, ProductVersion version, Requester user) {
		this.identifier = identifier;
		this.version = version;
		this.user = user;
	}

	@Override
	public Supplier<Optional<String>> getProductIdentifier() {
		return identifier;
	}

	@Override
	public Supplier<Optional<String>> getProductVersion() {
		return version;
	}

	@Override
	public Supplier<Optional<String>> getRequester() {
		return user;
	}

}
