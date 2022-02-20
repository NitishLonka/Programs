package ds;

import java.util.HashSet;

public class Union {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a = {10,20,30,40,50};
        int[] b = {10,20,30,40,10,10,10};
		System.out.print(UnionCount(a,b));
	}
	
	public static int UnionCount(int[] a,int[] b) {
		
		HashSet<Integer> h = new HashSet<Integer>();
		for(Integer i:a) {h.add(i);}
		for(Integer i:b) {h.add(i);}
		return h.size();
		
	}

}
