package org.eclipse.passage.loc.internal.workbench.wizards;

import java.io.IOException;
import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.passage.lic.emf.meta.EntityMetadata;
import org.eclipse.passage.lic.emf.resource.ResourceSaveFailed;
import org.eclipse.passage.lic.internal.api.ServiceInvocationResult;
import org.eclipse.passage.lic.internal.api.diagnostic.Trouble;
import org.eclipse.passage.lic.internal.base.BaseServiceInvocationResult;
import org.eclipse.passage.lic.internal.base.diagnostic.BaseDiagnostic;
import org.eclipse.passage.loc.internal.emf.EditingDomainRegistry;
import org.eclipse.passage.loc.internal.workbench.i18n.WorkbenchMessages;

/**
 * Creates new root licensing object. Can be asked for a reference to a created
 * instance.
 * 
 */
public final class RootClassifierWizard extends BaseClassifierWizard<RootClassifierWizardPage> {

	/**
	 * Creates a new wizard for root licensing object with given metadata,
	 * initializer and registry
	 * 
	 * @param metadata describes EMF metadata for an object to be created, must not
	 *                 be <code>null</code>
	 * @param registry registry for an object to be created, must not be
	 *                 <code>null</code>
	 * @see BaseClassifierWizard
	 * @see EntityMetadata
	 * @see EditingDomainRegistry
	 * 
	 */
	public RootClassifierWizard(EntityMetadata metadata, EditingDomainRegistry<?> registry) {
		super(metadata, registry);
	}

	@Override
	protected RootClassifierWizardPage createNewClassifierPage() {
		return new RootClassifierWizardPage(metadata, registry.getFileExtension());
	}

	@Override
	protected ServiceInvocationResult<Boolean> store() {
		return store(newClassifierPage.path(), newClassifierPage.candidate());
	}

	protected ServiceInvocationResult<Boolean> store(String path, EObject candidate) {
		URI fileURI = URI.createFileURI(path);
		Resource resource = resourceSet().createResource(fileURI);
		resource.getContents().add(candidate);
		try {
			resource.save(new HashMap<>());
			return registry.registerSource(fileURI.toFileString());
		} catch (IOException e) {
			return new BaseServiceInvocationResult<Boolean>(new BaseDiagnostic(
					new Trouble(new ResourceSaveFailed(), WorkbenchMessages.InnerClassifierWizard_e_store, e)));
		}
	}

}
