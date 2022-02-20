package ds;

import java.util.HashSet;

public class SubArraywithgivensum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,90,67};
    System.out.println(GivenSumSubArray(arr,89));
	}

	public static boolean GivenSumSubArray(int[] arr,int givensum)
	{
		HashSet<Integer> s = new HashSet<Integer>();
		int sum=0;
		for(Integer i:arr)
		{
			sum = sum+i;
		    if(s.contains(sum-givensum)||sum==givensum)
		    {
		       return true;	
		    }
		    else
		    {
		    	s.add(sum);
		    	
		    }
			
		}
		return false;
	}
}
