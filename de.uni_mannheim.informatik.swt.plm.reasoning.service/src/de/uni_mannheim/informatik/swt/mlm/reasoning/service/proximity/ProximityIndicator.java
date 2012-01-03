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
	
	/**
	 * 
	 * @author bastian
	 *
	 * @param <T> Either Clabject or Element in case of containment
	 * 
	 * Helper to parametrize the three proximity types.
	 * 
	 */
	private interface ProximityHelper<T> {
		
		/**
		 * 
		 * @param currentResult
		 * @param newAddition
		 * @return The new Result with the two combined
		 */
		public String appendResult(String currentResult, String newAddition);
		
		/**
		 * 
		 * @param current
		 * @return the next level of proximity from current
		 */
		public List<T> getNextProximityLevel(T current);
		
		/**
		 * 
		 * @return the separation string for the current type of proximity
		 */
		public String getSeparator();
		
	}
	
	// The queues containing the parsed input of the proximity indication strings
	private LinkedList<Integer> generQueue = new LinkedList<Integer>();
	private LinkedList<Integer> contQueue = new LinkedList<Integer>();
	private LinkedList<Integer> classQueue = new LinkedList<Integer>();
	
	// Star proximity flushes everything 
	private final int STAR = -1;

	/**
	 * 
	 * @param c the clabject to evaluate the proximity string from
	 * @param expression
	 * @return the string replacing the name in the header compartment
	 */
	public String run(Clabject c, String expression) {
		// Parse the input expression
		parseInput(expression);
		// Create the three proximity strings with helpers
		String generalizationProximityString = createGeneralizationProximityString(c);
		String classificationProximityString = createClassificationProximityString(c);
		String containmentProximityString = createContainmentProximityString(c);
		// Put them together
		String result = generalizationProximityString + containmentProximityString + c.getName() + classificationProximityString;  
		return  result;
	}


	public String createContainmentProximityString(Clabject c) {
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
		return containmentProximityString;
	}


	public String createClassificationProximityString(Clabject c) {
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
		return classificationProximityString;
	}


	public String createGeneralizationProximityString(Clabject c) {
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
		return generalizationProximityString;
	}


	private String createProximityString(Clabject c, LinkedList<Integer> queue, ProximityHelper helper) {
		String result = "";
		//When there is no queue there is no string
		if (queue.isEmpty()) {
			return result;
		}
		// The current string request level
		int currentRequest = queue.poll();
		// helper to collect the possible name givers
		int currentLevel = 0;
		// the last request level to determine if we skip levels
		int lastRequest = -1;
		// all the possible elements to contribute to the proximity, each entry is one level of them
		List<List<? extends Element>> allLevels = new ArrayList<List<? extends Element>>();
		// initialize with the first level from the input
		allLevels.add(helper.getNextProximityLevel(c));
		// local flag to store if there is a next level
		boolean nextLevelPresent = true;
		while (nextLevelPresent) {
			List<? extends Element> nextLevel = new ArrayList<Element>();
			// Collect the next level from all elements on the current level
			for (Element t: allLevels.get(currentLevel)) {
				nextLevel.addAll(helper.getNextProximityLevel(t));
			}
			// Determine if there is a next level
			nextLevelPresent = nextLevel.size() > 0;
			// Prevent empty lists in allLevels
			if (nextLevelPresent) allLevels.add(nextLevel);
			currentLevel++;
		}
		//Loop through all the possible elements on all the levels and see if there is a request for it
		for (List<? extends Element> currentLevelElements: allLevels) {
			// Only act if the current level is of interest 
			// Interest can be either a request or STAR
			if (currentRequest == allLevels.indexOf(currentLevelElements) || currentRequest == STAR) {
				String temp = "";
				// If there is more than one element in the current level, we have to bracket them
				if (currentLevelElements.size()>1) temp += "(";
				// Parse the current level string from the names of the current level Elements
				for (Element t: currentLevelElements) {
					// If there is no name or its empty, use a underscore
					if (t.getName() != null && t.getName().length()>0) {
						temp += t.getName();
					} else {
						temp += "_";
					}
					temp += ",";
				}
				// If there was any, there is a trailing comma too much
				if (temp.length() > 0) temp = temp.substring(0,temp.length()-1);
				// If there was more than one, we have to close the bracket
				if (currentLevelElements.size()>1) temp += ")";
				// add the proximity separator
				temp += helper.getSeparator();
				// If we skipped a level, add a second separator
				if (currentRequest != STAR && currentRequest - lastRequest >= 2) temp += helper.getSeparator();
				// Let the helper build the result 
				result = helper.appendResult(result, temp);
				// if the queue is not empty, go to the next request
				// the loop will still do all elements even if there are no more requests because a 
				// star request will be relevant for all levels
				if (!queue.isEmpty()) {
					lastRequest = currentRequest;
					currentRequest = queue.poll();
				}
			}
		}
		return result;
	}
	

	private void parseInput(String expression) {
		// Parse the input integer queues of the requested levels from the expression string
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
