package ds;

import java.util.HashSet;

public class IntersectionElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,20,30,40,50,60};
		int[] b= {10,20,30,30,30,40,50};
      System.out.print( intersectionelements(a,b));
	}
    
	public static int intersectionelements(int [] a, int[] b)
	{
		/*
		 * int count=0; HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
		 * for(Integer i:a) { h.put(i,0); }
		 * 
		 * for(Integer i:b) { if(h.containsKey(i)&&h.get(i)!=1) { h.put(i,1); count++; }
		 * }
		 */
		
		int count=0;
		HashSet<Integer> h = new HashSet<Integer>();
		for(Integer i:a) {h.add(i);}
		for(Integer i:b) {if(h.contains(i)) {count++;h.remove(i);}}
		
		return count;
	}
}
