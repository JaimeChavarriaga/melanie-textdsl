/*package de.uni_mannheim.informatik.swt.models.plm.diagram.custom;

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

import de.uni_mannheim.informatik.swt.models.plm.PLM.DomainEntity;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Equality;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Equals;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMFactory;
import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.EqualityEditPart;
import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.EqualityEqualEditPart;
import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.policies.PLMBaseItemSemanticEditPolicy;
import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes;

public class ImplicitEqualsCreateCommand extends AbstractImplicitMiddleElementLinkCreateCommand {
	
	public ImplicitEqualsCreateCommand(CreateRelationshipRequest request, EObject source, EObject target) {
		super(request, source, target);
	}

	@Override
	protected boolean checkSource(EObject source) {
		return source instanceof DomainEntity && 
			PLMBaseItemSemanticEditPolicy.getLinkConstraints().canCreateSetRelationshipBase_4013(null, (DomainEntity) source);
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
		Equality equality = PLMFactory.eINSTANCE.createEquality();
		IElementTypeAwareAdapter result = new EObjectAndElementTypeAdapter(equality, PLMElementTypes.Equality_3024, EqualityEditPart.VISUAL_ID);
		invokeDefaultElementTypeConfiguration(result, monitor, info);
		return result;
	}

	@Override
	protected IElementTypeAwareAdapter createImplicitTargetLink(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		//PLMElementTypes.SetRelationshipTarget_4005 is the EqualsLink
		return new ElementTypeOnlyAdapter(PLMElementTypes.EqualityEqual_4018, EqualityEqualEditPart.VISUAL_ID);
	}

	@Override
	protected void setupSemanticConnections(EObject source, IElementTypeAwareAdapter middle, EObject target) {
		DomainEntity sourceImpl = (DomainEntity) source;
		DomainEntity targetImpl = (DomainEntity) target;
		Equals implicitEquals = (Equals) middle.getAdapter(EObject.class);

		implicitEquals.setBase(sourceImpl);
		implicitEquals.getEqual().add(targetImpl);

		if (implicitEquals.eContainer() == null) {
			Model commonContainer = (Model) sourceImpl.eContainer();
			commonContainer.getElements().add(implicitEquals);
		}
	}
}*/