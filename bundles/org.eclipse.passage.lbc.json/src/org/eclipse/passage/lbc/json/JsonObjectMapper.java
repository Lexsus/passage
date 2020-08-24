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
package org.eclipse.passage.lbc.json;

import java.util.function.Function;
import java.util.function.Supplier;

import org.eclipse.passage.lbc.internal.api.BoundLicense;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

public final class JsonObjectMapper implements Supplier<ObjectMapper> {

	@Override
	public ObjectMapper get() {
		return ((Function<ObjectMapper, ObjectMapper>) this::withVisibility)//
				.andThen(this::withFeatures) //
				.andThen(this::withSerializers) //
				.apply(new ObjectMapper());
	}

	private ObjectMapper withVisibility(ObjectMapper mapper) {
		return mapper.setVisibility(mapper.getSerializationConfig().getDefaultVisibilityChecker()
				.withFieldVisibility(JsonAutoDetect.Visibility.ANY)//
				.withGetterVisibility(JsonAutoDetect.Visibility.NONE)//
				.withSetterVisibility(JsonAutoDetect.Visibility.ANY)//
				.withCreatorVisibility(JsonAutoDetect.Visibility.ANY));
	}

	private ObjectMapper withFeatures(ObjectMapper mapper) {
		return mapper//
				.enable(SerializationFeature.INDENT_OUTPUT) //
				.enable(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);
	}

	private ObjectMapper withSerializers(ObjectMapper mapper) {
		SimpleModule module = new SimpleModule();
		module.addSerializer(new BoundLicenseSerializer(BoundLicense.class));
		module.addDeserializer(BoundLicense.class, new BoundLicenseDeserializer(BoundLicense.class));
		mapper.registerModule(module);
		return mapper;
	}

}
