package ds;

public class Kthmissingpositivenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2};
		int k=1;
     System.out.print(findKthPositive(arr,k));
	}
	 public static int findKthPositive(int[] arr, int k) {
	       int counter=1;
	        int value=0;
	        int prev=0;
	        for(int i=0;i<arr.length;i++)
	        {
	            if(arr[i]!=counter&& value==0)
	            {  
	                
	               
	                if(k-(arr[i]-counter)<=0)
	                {
	                  value = prev+k;  
	                }
	                else
	                {
	                	 k = k-(arr[i]-counter);
	                }
	               
	            }
	            counter = arr[i]+1;
	            prev=arr[i];
	        }
	        if(value==0)
	        {
	            return arr[arr.length-1]+k;
	        }
	        else
	        {
	            return value;
	        }
	    }
}
