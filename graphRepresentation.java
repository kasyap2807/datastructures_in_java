package Ds;

import java.util.ArrayList;

class graph{
	ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
	public graph(int v) {
		for(int i=0;i<v;i++) {
			adjList.add(new ArrayList<Integer>());
		}
	}
	public void addEdge(int v,int e) {
		adjList.get(v).add(e);
		adjList.get(e).add(v);
		
	}
	public void printAdjList() {
		for(int i=0;i<adjList.size();i++) {
			System.out.println("adjlist of vertex "+i);
			for(int j=0;j<adjList.get(i).size();j++) {
				System.out.print(adjList.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}
}
public class graphRepresentation {

	public static void main(String[] args) {
			graph g = new graph(5);
			g.addEdge(0,1);
			g.addEdge(2,3);
			g.addEdge(1,2);
			g.addEdge(3,4);
			g.addEdge(0,4);
			g.addEdge(1,4);
			g.printAdjList();
			}

}
