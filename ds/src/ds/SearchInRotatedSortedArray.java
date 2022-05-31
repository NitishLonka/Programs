//package ds;
//
//public class SearchInRotatedSortedArray {
//
//	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int len = nums.length;
//        boolean isFound = false;
//        int mid = len/2;
//        int start = 0;
//        int startnum = 0;
//        int end = len-1;
//        int pivot = Integer.MIN_VALUE ;
//        if(len==1)
//        {
//            if(nums[len-1]==target)
//                return 0;
//            else
//                return -1;
//        }
//        while(start<end&&start>=0){
//            System.out.println(nums[start]+"--"+nums[mid]+"--"+nums[end]);
//            if(nums[mid]<nums[mid-1])
//            {
//                 System.out.println("there");
//                pivot = mid;
//                break;
//            }
//            else if(nums[start]>=nums[end])
//            {
//                start = mid+1;
//            }
//            else
//            {
//                end = mid-1;
//            }
//            mid = (start+end-1)/2;
//        }
//        if(start == end)
//        {
//            pivot = start;
//        }
//        System.out.println(pivot);
//        if(target==nums[pivot])
//        {
//            return pivot;
//        }
//        if(pivot!=0&&target<=nums[pivot-1]&&target>=nums[0]){
//            
//            start = 0;
//            end = pivot-1;
//        }
//        else
//        {
//            start =0;
//            end = len-1;
//        }
//        if(pivot!=len-1&&target>=nums[pivot+1]&&target<=nums[len-1])
//        {
//            System.out.println("here"+nums[len-1]+"---"+nums[pivot+1]);
//          start = pivot+1;
//          end =len-1;
//        }
//        else
//        {
//            start=0;
//            end=len-1;
//        }
//        mid = (start+end-1)/2;
//        System.out.println(start+"---"+end);
//        while(start<end&&start>=0&&end>=0)
//        {
//             mid = (start+end-1)/2;
//            if(nums[mid]==target)
//            {
//                return mid;
//            }
//            
//                if(nums[mid]<target){
//                    start = mid+1;
//                    
//                }
//                else
//                {
//                    end = mid-1;
//                }
//               
//        
//        }
//        if(nums[end]==target)
//            return end;
//        else 
//        return -1;
//    }
//	}
//		
//	}
//}

class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
    
       return binsearch(nums, 0, nums.length-1, target);
}
    public static int binsearch(int arr[], int l, int h, int key)
    {
         if (l > h)  //Code source:GeeksForGeeks
            return -1;
 
        int mid = (l + h) / 2;
        if (arr[mid] == key)
            return mid;
 
        /* If arr[l...mid] first subarray is sorted */
        if (arr[l] <= arr[mid]) {
            /* As this subarray is sorted, we
               can quickly check if key lies in
               half or other half */
            if (key >= arr[l] && key <= arr[mid])
                return binsearch(arr, l, mid - 1, key);
            /*If key not lies in first half subarray,
           Divide other half  into two subarrays,
           such that we can quickly check if key lies
           in other half */
            return binsearch(arr, mid + 1, h, key);
        }
 
        /* If arr[l..mid] first subarray is not sorted,
           then arr[mid... h] must be sorted subarray*/
        if (key >= arr[mid] && key <= arr[h])
            return binsearch(arr, mid + 1, h, key);
 
        return binsearch(arr, l, mid - 1, key);
    }
}
