package Test_main;

import Topsort.TopSort;
import graph_input.myGraph;

public class Main_TopSort {

	public static void main(String[] args) {
		
		var g = new myGraph('G');
		
		
		g.addEdge('A', 'B');
		g.addEdge('A', 'C');
		g.addEdge('A', 'F');
		g.addEdge('B', 'E');
		g.addEdge('C', 'B');
		g.addEdge('C', 'E');
		g.addEdge('C', 'D');
		g.addEdge('C', 'G');
		g.addEdge('E', 'D');
		g.addEdge('F', 'C');
		g.addEdge('F', 'G');
		
		
		g.displayGraph();
			
		System.out.println();
		
		TopSort.topologicalOrderSimple(g).displayGraph();
		System.out.println();
		TopSort.topologicalOrderWEdges(g).displayGraph();
		
		
		

		
	}

}
