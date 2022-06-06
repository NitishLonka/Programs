package ds;
import java.util.*;
public class Permutation {
	
	public static void main(String[] args)
	{
		System.out.println(permute(new int[] {1,2,3}));
	}

	 public static List<List<Integer>> permute(int[] nums) {
	        List<List<Integer>> res = new ArrayList(); //Copied from LeetCode Discussions Board
	        backtrack(nums, res, new ArrayList());
	        return res;
	    }
	    private static void backtrack(int[] nums, List<List<Integer>> res, List<Integer> temp){
	        if(temp.size() == nums.length){
	            res.add(new ArrayList(temp));
	            return;
	        }
	        for(int i=0; i<nums.length; i++){
	            if(temp.contains(nums[i])) continue;
	            temp.add(nums[i]);
	            backtrack(nums, res, temp);
	            temp.remove(temp.size()-1);
	        }
	    }
}

