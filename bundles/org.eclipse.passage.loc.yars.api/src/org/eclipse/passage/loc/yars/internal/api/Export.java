/*******************************************************************************
 * Copyright (c) 2019, 2020 ArSysOp
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
package org.eclipse.passage.loc.yars.internal.api;

/**
 * <p>
 * Auxiliary exporter, based on a fetcher, which causes the actual fetch in a
 * lazy way and orcheterates the whole export of fetched data.
 * <p>
 * 
 * <p>
 * Having
 * </p>
 * <ul>
 * <li>a source storage {@code Sto}</li>
 * <li>a query {@code Que} over the storage, who's fetches beget instances
 * of</li>
 * <li>an exportable entry class like
 * {@code class Exportable implements ExportedData<Exportable>}, which can
 * {@code write} itself into a {@code media}, and</li>
 * <li>an {@code output format} media, like {@code Json}, that knows how to
 * {@code write} each element of a {@code result list} to the format,</li>
 * </ul>
 * <p>
 * you can trigger the whole writing with something like
 * </p>
 * 
 * <pre>
 *   new Export<Sto, Exportable>(
 *       new Que().fetch(getSto(), createParams())
 *	 .write(new Json(file));
 * </pre>
 * 
 * @param <S> type of storage
 * @param <T> type of data ready for export, sub type of {@linkplain ExportData}
 * @param <M> any sub type of {@linkplain ListMedia}
 * 
 * @see org.eclipse.passage.loc.yars.internal.api
 * @since 0.1
 */
public final class Export<S extends Storage<?>, T extends ExportData<T, DOSHandleMedia<T>>>
		implements ExportData<T, DOSHandleMedia<T>> {

	private final FetchedData<S, T> query;

	public Export(FetchedData<S, T> query) {
		this.query = query;
	}

	@Override
	public void write(DOSHandleMedia<T> media) {
		media.start();
		query.get().forEach(data -> {
			media.startNode(data);
			data.write(media);
			media.finishNode(data);
		});
		media.finish();
	}

}
