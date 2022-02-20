package ds;

import java.util.HashSet;

public class DistinctElementCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int[] elementlist= {2,2,4,5,6,4,5,6,27};	
      System.out.println(distinctcount(elementlist));
	}
   
	public static int distinctcount(int[] arr)
	{
		HashSet<Integer> s = new HashSet<Integer>(); 
		for(int i=0;i<arr.length;i++)
		{
		  s.add((Integer)arr[i]);
		}
		return s.size();
	}
}
