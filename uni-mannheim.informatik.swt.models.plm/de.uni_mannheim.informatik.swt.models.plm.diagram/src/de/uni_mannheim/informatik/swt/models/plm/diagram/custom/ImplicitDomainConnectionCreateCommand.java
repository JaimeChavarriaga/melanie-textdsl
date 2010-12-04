package de.uni_mannheim.informatik.swt.models.plm.diagram.custom;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

import com.borlander.gmftools.samples.inthemiddle.gmf.commands.AbstractImplicitMiddleElementLinkCreateCommand;
import com.borlander.gmftools.samples.inthemiddle.gmf.commands.EObjectAndElementTypeAdapter;
import com.borlander.gmftools.samples.inthemiddle.gmf.commands.ElementTypeOnlyAdapter;
import com.borlander.gmftools.samples.inthemiddle.gmf.commands.IElementTypeAwareAdapter;

import de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection;
import de.uni_mannheim.informatik.swt.models.plm.PLM.DomainEntity;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMFactory;
import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionEditPart;
import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionParticipantEditPart;
import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.policies.PLMBaseItemSemanticEditPolicy;
import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes;

public class ImplicitDomainConnectionCreateCommand extends AbstractImplicitMiddleElementLinkCreateCommand {
	
	public ImplicitDomainConnectionCreateCommand(CreateRelationshipRequest request, EObject source, EObject target) {
		super(request, source, target);
	}

	@Override
	protected boolean checkSource(EObject source) {
		return source instanceof DomainEntity && 
			PLMBaseItemSemanticEditPolicy.getLinkConstraints().canExistDomainConnectionParticipant_4003(null, (DomainEntity) source);
	}

	@Override
	protected boolean checkTarget(EObject target) {
		return target instanceof DomainEntity;
	}

	@Override
	protected Dimension getImplicitNodeDefaultSizeHint() {
		return new Dimension(60, 30);
	}

	@Override
	protected IElementTypeAwareAdapter createSemanticMiddle(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		DomainConnection con = PLMFactory.eINSTANCE.createDomainConnection();
		IElementTypeAwareAdapter result = new EObjectAndElementTypeAdapter(con, PLMElementTypes.DomainConnection_3006, DomainConnectionEditPart.VISUAL_ID);
		invokeDefaultElementTypeConfiguration(result, monitor, info);
		return result;
	}

	@Override
	protected IElementTypeAwareAdapter createImplicitTargetLink(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		return new ElementTypeOnlyAdapter(PLMElementTypes.DomainConnectionParticipant_4003, DomainConnectionParticipantEditPart.VISUAL_ID);
	}

	@Override
	protected void setupSemanticConnections(EObject source, IElementTypeAwareAdapter middle, EObject target) {
		DomainEntity sourceImpl = (DomainEntity) source;
		DomainEntity targetImpl = (DomainEntity) target;
		DomainConnection implicitDomainConnection = (DomainConnection) middle.getAdapter(EObject.class);

		implicitDomainConnection.getParticipant().add(sourceImpl);
		implicitDomainConnection.getParticipant().add(targetImpl);

		if (implicitDomainConnection.eContainer() == null) {
			Model commonContainer = (Model) sourceImpl.eContainer();
			commonContainer.getElements().add(implicitDomainConnection);
		}
	}
}
