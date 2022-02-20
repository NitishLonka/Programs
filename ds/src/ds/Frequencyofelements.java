package ds;

import java.util.HashMap;

public class Frequencyofelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr= {10};
		printer(arr);
	}
  public static void printer(int[] arr)
  {
	HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	for(int i=0;i<arr.length;i++)
	{
		if(hm.containsKey(arr[i])) {
			hm.put(arr[i], hm.get(arr[i])+1);
		}
		else
		{
			hm.put(arr[i],1);
		}
	}
	System.out.println(hm);
  }
}
