package ds;

import java.util.HashSet;

public class Pairwithsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] a = {10,20,30,30,40,30,40};
    int sum = 70;
    System.out.print(IsPairPresent(a,sum));
	}
	
	public static boolean IsPairPresent(int[] a , int sum) {
		
		HashSet<Integer> h = new HashSet<Integer>();
		for(int i:a) {if(h.contains(sum-i)) {return true;} else{h.add(i);}}
		return false;
		
	}

}
