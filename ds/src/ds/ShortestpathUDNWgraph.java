package ds;
import java.util.*;
public class ShortestpathUDNWgraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=7;
		ArrayList<ArrayList<Integer>> gph = new ArrayList<ArrayList<Integer>>(7);
		for(int i=0;i<7;i++)
		{
			gph.add(new ArrayList<Integer>());
		}
		addEdge(gph,0,1); 
		addEdge(gph,0,2); 
		addEdge(gph,2,3); 
		addEdge(gph,1,3); 
		addEdge(gph,4,5);
		addEdge(gph,5,6);
		addEdge(gph,4,6);
		
		Shortestpath(gph,size,3);
		}
	    public static void addEdge(ArrayList<ArrayList<Integer>> gph,int u , int v)
	    {
	    	gph.get(u).add(v);
	    	gph.get(v).add(u);
	    }
	public static void Shortestpath(ArrayList<ArrayList<Integer>> graph,int size,int source) {
		int[] distArray = new int[size];
		for(int i=0;i<size;i++) {
			distArray[i] = Integer.MAX_VALUE;
		}
		Boolean[] visited = new Boolean[size];
		for(int i=0;i<size;i++)
		{
			visited[i] = false;
		}
		Queue<Integer> q =  new LinkedList<Integer>();
		q.add(source);
		distArray[source] = 0;
		visited[source] = true;
		while(q.isEmpty()!=true) {
			int k = q.poll();
			for(Integer p : graph.get(k)) {
			  if(visited[p]==false) {
				distArray[p] = distArray[k]+1;  
			  q.add(p);
			  visited[p] = true;
			  }
			}
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(distArray[i]);
		}
	}

}
