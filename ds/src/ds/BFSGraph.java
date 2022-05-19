package ds;
import java.util.*; 

public class BFSGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=5;
	ArrayList<ArrayList<Integer>> gph = new ArrayList<ArrayList<Integer>>(5);
	for(int i=0;i<5;i++)
	{
		gph.add(new ArrayList<Integer>());
	}
	addEdge(gph,0,1); 
	addEdge(gph,0,2); 
	addEdge(gph,1,2); 
	addEdge(gph,2,3); 
	addEdge(gph,1,3);
	addEdge(gph,3,4);
	addEdge(gph,2,4);
    BFSTraversal(gph,size);
	}
    public static void addEdge(ArrayList<ArrayList<Integer>> gph,int u , int v)
    {
    	gph.get(u).add(v);
    	gph.get(v).add(u);
    }
	public static void BFSTraversal(ArrayList<ArrayList<Integer>> gph,int size) {
		
		boolean[] visited = new boolean[size];
		 for(int i=0;i<visited.length;i++)
		 {
			 visited[i]=false;
		 }
		Queue<Integer> q = new LinkedList();
		q.add(0);
		visited[0] = true;
		while(q.isEmpty()==false)
		{
			Integer x = q.poll();
			System.out.print(x+" ");
			for (Integer i : gph.get(x)) {
				if(visited[i]!=true) {
					visited[i] = true;
				q.add(i);
				}
			}
		}
		
	}
}
