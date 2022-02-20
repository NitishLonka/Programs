package ds;
import java.util.*;
public class Hash {
	public static ArrayList<LinkedList<Integer>> l = new ArrayList<LinkedList<Integer>> ();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<LinkedList<Integer>> l = new ArrayList<LinkedList<Integer>> ();
		/*
		 * for(int i=0;i<7;i++) { l.add(new LinkedList<Integer>()); } insert(4);
		 * insert(11); System.out.print(search(7)); System.out.print(l); delete(5);
		 * System.out.print(l);
		 */
		/*
		 * SimpleOpenAddressing s = new SimpleOpenAddressing(); s.insert(51);
		 * s.insert(49); s.insert(50); s.insert(70); s.insert(81); s.print();
		 * System.out.println(s.erase(50)); s.print(); System.out.println(s.search(50));
		 */
	}
	public static void insert(int a) {
	 
		int temp=a%7;
		/*
		 * if(l.get(temp)==null) { LinkedList<Integer> li = new LinkedList<Integer>();
		 * li.add(a); l.add(li); } else { LinkedList<Integer> li=l.get(temp); li.add(a);
		 * }
		 */
		l.get(temp).add(a);
	
	}
	public static boolean search(int a) {
		 
		int temp=a%7;
		/*
		 * if(l.get(temp)!=null) { LinkedList<Integer> ll = l.get(temp); for (Integer
		 * integer : ll) { if(integer==a) { return true; } } return false; } else {
		 * return false; }
		 */
		return l.get(temp).contains((Integer) a);
	}
	public static void delete(int a) {
		int temp=a%7;
		/*
		 * if(l.get(temp)!=null) { LinkedList<Integer> li = l.get(temp); for(Integer i :
		 * li){ if(i==a) { li.remove(i); return true; } } return false; } else { return
		 * false; }
		 */
		l.get(temp).remove((Integer)a);
	}
}
