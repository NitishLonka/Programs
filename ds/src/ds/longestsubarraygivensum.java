package ds;

import java.util.HashMap;



public class longestsubarraygivensum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,-40,40,40,50,75,100};
		int sum =40;
		System.out.println(longestgivensumsubarray
				(arr,sum));
		
	}
  public static int longestgivensumsubarray(int[] arr,int givensum)
  {
	 
	  HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
	  int sum = 0;
	  int max=0;
	  for(int i =0; i<arr.length;i++)
	  {  
		  sum= sum+arr[i];
		  if(sum==givensum)
		  {
			  max=i+1;
		  }
		  if(h.containsKey(sum-givensum))
		  {   
			  h.put(sum,i);
			  if(i-h.get(sum-givensum)>max)
			  {
				  max=i-h.get(sum-givensum);
			  }
		  }
		  else
		  {
			  h.put(sum,i);
		  }
	  }
	  System.out.println(h);
	  return max;
  }
}
