/*******************************************************************************
 * Copyright (c) 2013 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ralph Gerbig - initial API and implementation and initial documentation
 *******************************************************************************/
package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor;

import java.util.Iterator;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.MarkerAnnotation;

import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.TextElement;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel;

/**
 * 
 * This class listens to change in the resource for which text is displayed.
 * The annotation model is updated as soon as the markers are changed.
 *
 */
public class MarkerAnnotationSynchronizer implements IResourceChangeListener {

	final private IResource resource;
	final private WeavingModel weavingModel;
	final private IDocumentProvider documentProvider;
	final private IEditorInput editorInput;
	
	public MarkerAnnotationSynchronizer(IResource resource, WeavingModel weavingModel, IDocumentProvider documentProvider, IEditorInput editorInput){
		this.resource = resource;
		this.weavingModel = weavingModel;
		this.documentProvider = documentProvider;
		this.editorInput = editorInput;
	}
	
	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		try {
			
			IAnnotationModel annotationModel = documentProvider.getAnnotationModel(editorInput);
			Iterator<Annotation> annotationIterator = annotationModel.getAnnotationIterator();
			
			if (annotationIterator.hasNext())
				for (Annotation annotation = annotationIterator.next(); annotationIterator.hasNext(); annotation = annotationIterator.next())
					annotationModel.removeAnnotation(annotation);
			
			for (IMarker marker : resource.findMarkers(IMarker.PROBLEM, true, IResource.DEPTH_INFINITE)){
				String elementId = (String)marker.getAttribute("elementId");
				
				//Find model element in model resource
				String plattformURi = marker.getResource().getFullPath().toString();
				URI uri = URI.createPlatformResourceURI(plattformURi, true);
				ResourceSet rs = new ResourceSetImpl();
				Resource r = rs.getResource(uri, true);
				TreeIterator<EObject> gmfModelIterator = r.getAllContents();
				for (EObject eObj = gmfModelIterator.next(); gmfModelIterator.hasNext(); eObj = gmfModelIterator.next())
					if (EMFCoreUtil.getProxyID(eObj).equals(elementId)
							&& eObj instanceof View){
						elementId = EMFCoreUtil.getProxyID(((View)eObj).getElement());
						break;
					}
				
				TreeIterator<EObject> iterator = weavingModel.eAllContents();
				for (EObject eObj = iterator.next() ;iterator.hasNext(); eObj = iterator.next())
					if (eObj instanceof WeavingLink &&
							EMFCoreUtil.getProxyID(((WeavingLink)eObj).getModelElement()).equals(elementId)){
						createAnnotation((WeavingLink)eObj, marker);
						break;
					}
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}

	}
	
	private void createAnnotation(WeavingLink link, IMarker marker){
		IAnnotationModel annotationModel = documentProvider.getAnnotationModel(editorInput);
		MarkerAnnotation annotation = new MarkerAnnotation(marker);
//		annotation.setType("org.eclipse.ui.workbench.texteditor.error");
//		annotation.setType("de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.type1");
		TextElement te = (TextElement)link.getChildren().get(0);
		annotationModel.connect(documentProvider.getDocument(editorInput));
		annotationModel.addAnnotation(annotation, new Position(te.getOffset(), te.getLength()));
		annotationModel.disconnect(documentProvider.getDocument(editorInput));
	}
}
