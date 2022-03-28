package ds;

import java.util.PriorityQueue;

public class sortK_sortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{2,6,3,12,56,8};
		int k=3;
     int[] array=Ksort(arr,k);
     for(int a:array)
     {
    	 System.out.print(a+" ");
     }
	}
	public static int[] Ksort(int[] arr,int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		int index=0;
		for(int i=0;i<=k;i++)
		{
			pq.add(arr[i]);
		}
		for(int i=k+1;i<arr.length;i++)
		{
			arr[index++]=pq.poll();
			pq.add(arr[i]);
		}
		while(pq.isEmpty()==false)
		{
			arr[index++]=pq.poll();
		}
		return arr;
	}

}
