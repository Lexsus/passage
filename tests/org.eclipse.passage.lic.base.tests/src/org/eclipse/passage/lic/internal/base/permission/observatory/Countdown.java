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
package org.eclipse.passage.lic.internal.base.permission.observatory;

import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

@SuppressWarnings("restriction")
final class Countdown implements Consumer<Set<Limited>> {
	private final AtomicInteger counter;

	Countdown(int from) {
		this.counter = new AtomicInteger(from);
	}

	@Override
	public void accept(Set<Limited> entries) {
		counter.updateAndGet(i -> i - entries.size());
	}

	boolean complete() {
		return counter.get() == 0;
	}

}
