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
package org.eclipse.passage.lic.runtime.conditions;

import static org.eclipse.passage.lic.runtime.LicensingEvents.ALL_SUB_TOPICS;
import static org.eclipse.passage.lic.runtime.LicensingEvents.TOPIC_BASE;
import static org.eclipse.passage.lic.runtime.LicensingEvents.TOPIC_SEP;

public final class ConditionEvents {

	private ConditionEvents() {
		// block
	}

	/**
	 * Base name for all licensing condition events
	 */
	public static final String TOPIC = TOPIC_BASE + TOPIC_SEP + "ConditionEvents"; //$NON-NLS-1$

	/**
	 * Name for all licensing condition events
	 */
	public static final String TOPIC_ALL = TOPIC + TOPIC_SEP + ALL_SUB_TOPICS;

	/**
	 * Sent when conditions are ignored
	 */
	public static final String CONDITIONS_IGNORED = TOPIC + TOPIC_SEP + "conditionsIgnored"; //$NON-NLS-1$

	/**
	 * Sent when conditions are rejected as not valid
	 */
	public static final String CONDITIONS_NOT_VALID = TOPIC + TOPIC_SEP + "conditionsNotValid"; //$NON-NLS-1$
	/**
	 * Sent when conditions are rejected as invalid
	 */
	public static final String CONDITIONS_NOT_EVALUATED = TOPIC + TOPIC_SEP + "conditionsNotEvaluated"; //$NON-NLS-1$
	/**
	 * Sent when conditions are leased
	 */
	public static final String CONDITIONS_LEASED = TOPIC + TOPIC_SEP + "conditionsLeased"; //$NON-NLS-1$

}