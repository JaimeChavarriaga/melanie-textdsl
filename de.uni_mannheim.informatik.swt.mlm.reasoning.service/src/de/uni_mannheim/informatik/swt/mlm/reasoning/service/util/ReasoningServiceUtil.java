package de.uni_mannheim.informatik.swt.mlm.reasoning.service.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import de.uni_mannheim.informatik.swt.mlm.reasoning.service.util.tarjan.AdjacencyList;
import de.uni_mannheim.informatik.swt.mlm.reasoning.service.util.tarjan.Node;
import de.uni_mannheim.informatik.swt.mlm.reasoning.service.util.tarjan.Tarjan;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;

//TODO: Add copyright statement
public class ReasoningServiceUtil {
	
	public static <T> Collection<T> filter(Collection<T> target, Predicate<T> predicate) {
	    Collection<T> result;
	    if (target instanceof List)
	    	result = new ArrayList<T>();
	    else if (target instanceof Set)
	    	result = new HashSet<T>();
	    else throw new RuntimeException("Unimplemented Collection filter type " + target.getClass());
	    for (T element: target) {
	        if (predicate.apply(element)) {
	            result.add(element);
	        }
	    }
	    return result;
	}
	
	public static <T> Set<T> intersect(Set<T> one, Set<T> other) {
		Set<T> result = new HashSet<T>(one);
		result.retainAll(other);
		return result;
	}
	
	public static String getDateString() {
		 Calendar cal = Calendar.getInstance();
		 SimpleDateFormat sdf = new SimpleDateFormat("H:mm:ss");
		 return sdf.format(cal.getTime());
	}
	
	private static boolean isAlreadyCovered(Clabject subject, Set<Set<Clabject>> universe) {
		for (Set<Clabject> current: universe) {
			if (current.contains(subject)) {
				return true;
			}
		}
		return false;
	}
	
	public static Set<Set<Clabject>> computeSimilaritySets(List<Pair<Clabject,Clabject>> clabjects) {
		Set<Set<Clabject>> result = new HashSet<Set<Clabject>>();
		// Compute a graph from the clabjects and invoke tarjan's algorithm from it
		// A Graph is an AdjacencyList
		AdjacencyList graph = new AdjacencyList();
		// build the nodes from the clabjects
		Map<Clabject,Node> nodes = new HashMap<Clabject,Node>();
		for (Pair<Clabject,Clabject> pair:clabjects) {
			Clabject supertype = pair.getFirst();
			Clabject subtype = pair.getSecond();
			if (!nodes.containsKey(supertype))
				nodes.put(supertype, new Node(supertype));
			if (!nodes.containsKey(subtype))
				nodes.put(subtype, new Node(subtype));
		}
		// and now the adjacencyList
		for (Pair<Clabject,Clabject> pair:clabjects) {
			graph.addEdge(nodes.get(pair.getSecond()), nodes.get(pair.getFirst()), 1);
		}
		// Now that the graph is ready, pass it to tarjan
		Tarjan tarjan = new Tarjan();
		ArrayList<ArrayList<Node>> allScc = tarjan.executeTarjan(graph);
		// transform the result back to our format
		for (ArrayList<Node> scc: allScc) {
			Set<Clabject> current = new HashSet<Clabject>();
			for (Node node:scc)
				current.add(node.getClabject());
			result.add(current);
		}
		return result;
	}
	
	
}



