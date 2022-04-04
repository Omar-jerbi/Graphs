package graph_input;

import java.util.ArrayList;

public class myGraph {
	public ArrayList<ArrayList<Node>> NodesEdges = null;
	
	public myGraph() {
		NodesEdges = new ArrayList<ArrayList<Node>>();
	}
	
	public myGraph(char fine) {
		NodesEdges = new ArrayList<ArrayList<Node>>();
		
		for(char c = 'A'; c <= fine ; c++ ) {
			var auxE = new ArrayList<Node>();
			auxE.add(new Node(c));
			
			NodesEdges.add(auxE);
		}
	}
	
	public void addEdge(char from, char to) {
		var LNfrom = NodesEdges.get(from - 65);
		var LNto = NodesEdges.get(to - 65);
		
		LNto.get(0).inEdges++;
		
		LNfrom.add(LNto.get(0));
		
	}
	
	public void displayGraph() {
		for(var lN : NodesEdges) {
			for(var E : lN) {
				System.out.print(E.tag + " ");
			}
			System.out.println();
		}
	}
}
