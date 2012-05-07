package de.uni_mannheim.informatik.swt.mlm.reasoning.service.util.tarjan;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Collection;

public class AdjacencyList {

   private Map<Node, List<Edge>> adjacencies = new HashMap<Node, List<Edge>>();

   public void addEdge(Node source, Node target, int weight){
       List<Edge> list;
       if(!adjacencies.containsKey(source)){
           list = new ArrayList<Edge>();
           adjacencies.put(source, list);
       }else{
           list = adjacencies.get(source);
       }
       list.add(new Edge(source, target, weight));
   }

   public List<Edge> getAdjacent(Node source){
	   if (adjacencies.containsKey(source))
		   return adjacencies.get(source);
	   return new ArrayList<Edge>();
   }

   public void reverseEdge(Edge e){
       adjacencies.get(e.from).remove(e);
       addEdge(e.to, e.from, e.weight);
   }

   public void reverseGraph(){
       adjacencies = getReversedList().adjacencies;
   }

   public AdjacencyList getReversedList(){
       AdjacencyList newlist = new AdjacencyList();
       for(List<Edge> edges : adjacencies.values()){
           for(Edge e : edges){
               newlist.addEdge(e.to, e.from, e.weight);
           }
       }
       return newlist;
   }

   public Set<Node> getSourceNodeSet(){
       return adjacencies.keySet();
   }

   public Collection<Edge> getAllEdges(){
       List<Edge> edges = new ArrayList<Edge>();
       for(List<Edge> e : adjacencies.values()){
           edges.addAll(e);
       }
       return edges;
   }
}