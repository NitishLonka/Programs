
package ds;
import java.util.*; 

public class BFSGraphDisconnected {

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
		for(int i=0;i<size;i++) {
		if(visited[i]==false) {
		q.add(i);
		visited[i] = true;
		while(q.isEmpty()==false)
		{
			Integer x = q.poll();
			System.out.print(x+" ");
			for (Integer k : gph.get(x)) {
				if(visited[k]!=true) {
					visited[k] = true;
				q.add(k);
				}
			}
		}
		}
		}
	}
}
