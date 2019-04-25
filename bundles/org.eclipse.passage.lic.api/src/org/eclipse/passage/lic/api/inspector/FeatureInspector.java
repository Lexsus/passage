package org.eclipse.passage.lic.api.inspector;

import org.eclipse.passage.lic.api.LicensingConfiguration;

public interface FeatureInspector {
	
	LicensingConfiguration getLicensingConfiguration();
	
	FeatureCase inspectFeatures(String... identifiers);

	FeatureCase inspectFeatures(Iterable<String> identifiers);

}