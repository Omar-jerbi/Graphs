package sort;


import java.util.ArrayList;
import java.util.LinkedList;

import graph_input.Node;
import graph_input.myGraph;

public class TopSort {

	public static myGraph topologicalOrderSimple(myGraph g) {
		var S = new LinkedList<Node>();
		
		var inDegree = new int[g.NodesEdges.size()];
		
		
		var ORD = new myGraph();
		
		int i = 0;
		for(var lN : g.NodesEdges) {
			inDegree[i] = lN.get(0).inEdges;
			i++;
		}
		
		
		for(var lN : g.NodesEdges) {
			if(lN.get(0).inEdges == 0) {
				S.add(lN.get(0));
			}
		}
		
		while(!S.isEmpty()) {
			
			var u = S.pop();

			
			var auxE = new ArrayList<Node>();
			auxE.add(u);	
			ORD.NodesEdges.add(auxE);
		
			for(var lN: g.NodesEdges) {
				if(lN.get(0).tag == u.tag) {
					var aux = lN.iterator();
					if(aux.hasNext()) aux.next();
					while(aux.hasNext()) {
						var v = aux.next();
						inDegree[v.tag - 65]--;
						if(inDegree[v.tag - 65] == 0) S.add(v);
					}
					
				}
			}
			
		}
				
		return ORD;
	}
	
	
	
	public static myGraph topologicalOrderWEdges(myGraph g) {
		var S = new LinkedList<Node>();
		
		var inDegree = new int[g.NodesEdges.size()];
		
		
		var ORD = new myGraph();// da modificare per creare archi tra nodi via via aggiunti
		
		int i = 0;
		for(var lN : g.NodesEdges) {
			inDegree[i] = lN.get(0).inEdges;
			i++;
		}
		
		
		for(var lN : g.NodesEdges) {
			if(lN.get(0).inEdges == 0) {
				S.add(lN.get(0));
			}
		}
		
		while(!S.isEmpty()) {
			
			var u = S.pop();

			
			var auxE = new ArrayList<Node>();
			auxE.add(u);	
			ORD.NodesEdges.add(auxE);
		
			for(var lN: g.NodesEdges) {
				if(lN.get(0).tag == u.tag) {
					var aux = lN.iterator();
					if(aux.hasNext()) aux.next();
					while(aux.hasNext()) {
						var v = aux.next();
						inDegree[v.tag - 65]--;
						if(inDegree[v.tag - 65] == 0) S.add(v);
					}
					
				}
			}
			
		}
				
		return ORD;
	}
	
	
	
	
}
