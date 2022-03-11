package ds;

import java.util.TreeSet;

public class CeilingonLeftSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] a = {2,8,30,15,25,12};
     printCeiling(a);
	}
	public static void printCeiling(int[] a) {
		TreeSet<Integer> t = new TreeSet<Integer>();
		for(Integer i : a) {
			
			if(t.ceiling(i)!=null)
			{
				System.out.print(t.ceiling(i)+" ");
			}
			else
			{
				System.out.print(-1+" ");
			}
			t.add(i);
		}
		
	}

}
