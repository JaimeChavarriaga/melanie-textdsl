/*******************************************************************************
 * Copyright (c) 2011 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Bastian Kennel - initial API and implementation and initial documentation
 *******************************************************************************/ 
package de.uni_mannheim.informatik.swt.mlm.reasoning.service.proximity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EObject;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.LMLModel;

/**
 * @author bastian
 *
 */
public class ProximityIndicator {
	
	private interface ProximityHelper<T> {
		
		public String appendResult(String currentResult, String newAddition);
		
		public List<T> getNextProximityLevel(T current);
		
		public String getSeparator();
		
	}
	
	private LinkedList<Integer> generQueue = new LinkedList<Integer>();
	private LinkedList<Integer> contQueue = new LinkedList<Integer>();
	private LinkedList<Integer> classQueue = new LinkedList<Integer>();
	
	private final int STAR = -1;

	public String run(Clabject c, String expression) {
		parseInput(expression);
		String generalizationProximityString = createProximityString(c, generQueue, new ProximityHelper<Clabject>(){

			@Override
			public String appendResult(String currentResult, String newAddition) {
				return newAddition + currentResult;
			}

			@Override
			public List<Clabject> getNextProximityLevel(Clabject current) {
				return current.getModelDirectSupertypes();
			}

			@Override
			public String getSeparator() {
				return "<";
			}
			
		});
		String classificationProximityString = createProximityString(c, classQueue, new ProximityHelper<Clabject>() {

			@Override
			public String appendResult(String currentResult, String newAddition) {
				return currentResult + newAddition;
			}

			@Override
			public List<Clabject> getNextProximityLevel(Clabject current) {
				return current.getModelDirectTypes();
			}

			@Override
			public String getSeparator() {
				return ":";
			}
			
		});
		String containmentProximityString = createProximityString(c, contQueue, new ProximityHelper<Element>() {

			@Override
			public String appendResult(String currentResult, String newAddition) {
				return newAddition + currentResult;
			}

			@Override
			public List<Element> getNextProximityLevel(Element current) {
				ArrayList<Element> temp = new ArrayList<Element>();
				EObject possible = current.eContainer();
				if (possible instanceof LMLModel) return temp;
				temp.add((Element) possible);
				return temp;
			}

			@Override
			public String getSeparator() {
				return ".";
			}
			
		});
		String result = generalizationProximityString + containmentProximityString + c.getName() + classificationProximityString;  
		return  result;
	}


	private String createProximityString(Clabject c, LinkedList<Integer> queue, ProximityHelper helper) {
		String result = "";
		if (queue.isEmpty()) {
			return result;
		}
		int currentRequest = queue.poll();
		int currentLevel = 0;
		int lastRequest = -1;
		List<List<? extends Element>> allLevels = new ArrayList<List<? extends Element>>();
		allLevels.add(helper.getNextProximityLevel(c));
		boolean nextLevelPresent = true;
		while (nextLevelPresent) {
			List<? extends Element> nextLevel = new ArrayList<Element>();
			for (Element t: allLevels.get(currentLevel)) {
				nextLevel.addAll(helper.getNextProximityLevel(t));
			}
			nextLevelPresent = nextLevel.size() > 0;
			if (nextLevelPresent)	allLevels.add(nextLevel);
			currentLevel++;
		}
		for (List<? extends Element> currentLevelClabjects: allLevels) {
			if (currentRequest == allLevels.indexOf(currentLevelClabjects) || currentRequest == STAR) { 
				String temp = "";
				if (currentLevelClabjects.size()>1) temp += "(";
				for (Element t: currentLevelClabjects) {
					if (t.getName() != null && t.getName().length()>0) {
						temp += t.getName();
					} else {
						temp += "_";
					}
					temp += ",";
				}
				if (temp.length() > 0) temp = temp.substring(0,temp.length()-1);
				if (currentLevelClabjects.size()>1) temp += ")";
				temp += helper.getSeparator();
				if (currentRequest != STAR && currentRequest - lastRequest >= 2) temp += helper.getSeparator();
				result = helper.appendResult(result, temp);
				if (!queue.isEmpty()) {
					lastRequest = currentRequest;
					currentRequest = queue.poll();
				}
			}
		}
		return result;
	}
	

	private void parseInput(String expression) {
		Pattern pattern = Pattern.compile("\\[(.*?)\\]\\((.*?)\\)\\{(.*?)\\}");
		Matcher matcher = pattern.matcher(expression);
		matcher.matches();
		String generalization = matcher.group(1);
		String containment = matcher.group(2);
		String classification = matcher.group(3);
		String[] generalizationArray = generalization.split(",");
		String[] containmentArray = containment.split(",");
		String[] classificationArray = classification.split(",");
		for(String i:generalizationArray) {
			try {
				generQueue.add(Integer.parseInt(i));
			} catch (NumberFormatException ex) {
				ex.printStackTrace();
			}
		}
		for(String i:containmentArray) {
			try {
				contQueue.add(Integer.parseInt(i));
			} catch (NumberFormatException ex) {
				ex.printStackTrace();
			}
		}
		for(String i:classificationArray) {
			try {
				classQueue.add(Integer.parseInt(i));
			} catch (NumberFormatException ex) {
				ex.printStackTrace();
			}
		}
	}

}
