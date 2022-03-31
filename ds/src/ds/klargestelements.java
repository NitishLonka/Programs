package ds;

import java.util.PriorityQueue;

public class klargestelements { //using Heap

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {100,100,2,3,9,6};
		int k=5;
    printklargestelements(arr,k);
	}
   public static void printklargestelements(int[] arr,int k) {
	   PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	   for(int i=0;i<k;i++)
	   {
		   pq.add(arr[i]);
	   }
	   for(int i=k;i<arr.length;i++)
	   {
		   if(arr[i]>pq.peek())
		   {
			   pq.poll();
			   pq.add(arr[i]);
		   }
	   }
	   for(Integer i:pq) {
		   System.out.println(i);
	   }
   }
}
