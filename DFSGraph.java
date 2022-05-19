package ds;
import java.util.*;
public class DFSGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<ArrayList<Integer> > gph = new ArrayList<ArrayList<Integer>>(7);
	ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(7);
    for(int i=0;i<7;i++)
    {
    	gph.add(new ArrayList<Integer>());
    }
	boolean[] visited = new boolean[5];
	for(int i=0;i<5;i++)
	{
		visited[i] = false;
	}
	addEdge(gph,0,1); 
	addEdge(gph,0,2); 
	addEdge(gph,2,3); 
	addEdge(gph,1,3); 
	addEdge(gph,1,4);
	addEdge(gph,3,4);
	DFSTraversal(gph,gph.get(0),0,visited);
	}
    public static void addEdge(ArrayList<ArrayList<Integer>>gph,int u,int v)
    {
    	gph.get(u).add(v);
    	gph.get(v).add(u);
    }
    
    public static void DFSTraversal(ArrayList<ArrayList<Integer>> gph,ArrayList<Integer> adlist,int i,boolean[] visited)
    {  
    	System.out.print(i+" ");
    	visited[i]=true;
    	for(Integer x : adlist)
    	{
    		if(visited[x]==false) {
    		DFSTraversal(gph,gph.get(x),x,visited);
    		}
    	}
    }
}
