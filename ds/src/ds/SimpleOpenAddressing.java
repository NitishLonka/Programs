/*
 * package ds;
 * 
 * public class SimpleOpenAddressing {
 * 
 * public int[] simpleOAstructure = new int[7];
 * 
 * public SimpleOpenAddressing() { for(int i=0;i<7;i++) {
 * simpleOAstructure[i]=-1; } }
 * 
 * public void insert(int a ) { int n=hashify(a); int count = n;
 * while(simpleOAstructure[n]!=-1||count!=n) { count = count+1;
 * 
 * }
 * 
 * }
 * 
 * public String erase(int a) { a=hashify(a);
 * 
 * } public String search(int a) { a = hashify(a);
 * 
 * }
 * 
 * public void print() { for(int i=0;i<7;i++) {
 * System.out.println(simpleOAstructure[i]); } }
 * 
 * public static int hashify(int a) { return a%7; }
 * 
 * 
 * }
 */