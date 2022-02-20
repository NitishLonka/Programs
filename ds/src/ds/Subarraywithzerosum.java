package ds;

import java.util.HashSet;

public class Subarraywithzerosum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr= {4,-3,-2,-1,6,9,7};
		System.out.println(ZeroSubArray(arr));
	}
	
	public static boolean ZeroSubArray(int[] arr)
	{
		HashSet<Integer> s = new HashSet<Integer>();
		int sum=0;
		for(Integer i: arr)
		{
			sum=sum+i;
			if(s.contains(sum)||sum==0) {
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
