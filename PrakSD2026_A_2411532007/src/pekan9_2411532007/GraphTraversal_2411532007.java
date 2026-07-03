package pekan9_2411532007;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Queue;


public class GraphTraversal_2411532007 {
	private Map<String, List<String>> graph_2007 = new HashMap<>();
	

	public void addEdge_2007(String node1_2007, String node2_2007) {
		graph_2007.putIfAbsent(node1_2007, new ArrayList<>());
		graph_2007.putIfAbsent(node2_2007, new ArrayList<>());
		graph_2007.get(node1_2007).add(node2_2007);
		graph_2007.get(node2_2007).add(node1_2007);
	}
	
	public void printGraph_2007() {
		System.out.println("Graf Awal (Adjacency List):");
		for (String node_2007 : graph_2007.keySet()) {
			System.out.print(node_2007 + " -> ");
			List<String> neighbors_2007 = graph_2007.get(node_2007);
			System.out.println(String.join(", ", neighbors_2007));
		}
		System.out.println();
	}
	
	public void dfs_2007(String start_2007) {
		Set<String> visited_2007 = new HashSet<>();
		System.out.println("Penelusuran DFS:");
		dfsHelper_2007(start_2007, visited_2007);
		System.out.println();
	}

	private void dfsHelper_2007(String current_2007, Set<String> visited_2007) {
		if (visited_2007.contains(current_2007)) 
			return;
		visited_2007.add(current_2007);
		System.out.print(current_2007 + " ");
		for (String neighbor_2007 : graph_2007.getOrDefault(current_2007, new ArrayList<>())) {
			dfsHelper_2007(neighbor_2007, visited_2007);
		}
	}
	
	public void bfs_2007(String start_2007) {
		Set<String> visited_2007 = new HashSet<>();
		Queue<String> queue_2007 = new LinkedList<>();
		queue_2007.add(start_2007);
		visited_2007.add(start_2007);
		System.out.println("Penelusuran BFS:");
		while (!queue_2007.isEmpty()) {
			String current_2007 = queue_2007.poll();
			System.out.print(current_2007 + " ");
			for (String neighbor_2007 : graph_2007.getOrDefault(current_2007, new ArrayList<>())) {
				if (!visited_2007.contains(neighbor_2007)) {
					queue_2007.add(neighbor_2007);
					visited_2007.add(neighbor_2007);
				}
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		GraphTraversal_2411532007 graph_2007 = new GraphTraversal_2411532007();
		
		graph_2007.addEdge_2007("A", "B");
		graph_2007.addEdge_2007("A", "C");
		graph_2007.addEdge_2007("B", "D");
		graph_2007.addEdge_2007("B", "E");
		
		System.out.println("Graf Awal adalah: ");
		graph_2007.printGraph_2007();
		
		graph_2007.dfs_2007("A");
		graph_2007.bfs_2007("A");

	}

}
