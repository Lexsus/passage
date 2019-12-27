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
package org.eclipse.passage.loc.yars.internal.api;

/**
 * <p>
 * Represent data ready to be exported ({@code written}) to some output.
 * </p>
 * <p>
 * The implementation can handle a bunch of data of type {@code T} (say, result
 * of a fetch) and be responsible for the whole bunch export.
 * </p>
 * <p>
 * It also can represent interests of a single entry of type {@code T} to be
 * exported and be able to {@code write} only this one.
 * </p>
 * <p>
 * Actual export is implemented by {@linkplain ListMedia}
 * </p>
 * 
 * <p>
 * This interface is intended to be implemented by two parties in an export
 * implementation:
 * </p>
 * <ul>
 * <li>a target-format aware service: it creates a format-dedicated output and
 * iterates over a given <i>data</i>, {@code writing} each to this output. This
 * party is responsible for orchestrating media calls like {@linkplain #start()}
 * or {@linkplain #finish()}. There is a default implementation of such an
 * orchesterator {@linkplain Export}.</li>
 * <li>each exportable entry {instance of @code T} should be able to
 * {@code write} one's innards to the output as well</li>
 * </ul>
 *
 * @param O represent the type of output format
 * @param T type of data intended to be exported ({@code written})
 *
 * @see ListMedia
 * @see Export
 * @see org.eclipse.passage.loc.yars.internal.api
 * @param T is the type ready to be exported
 * @since 0.1
 */
public interface ExportData<T, M extends ListMedia<T>> {

	/**
	 * <p>
	 * Export-ready entity must only be able to write it's content (encapsulated
	 * data) to the {@linkplain ListMedia}.
	 * </p>
	 * 
	 * @param M any sub type of {@linkplain ListMedia}
	 * @since 0.1
	 */
	void write(M media);

}
