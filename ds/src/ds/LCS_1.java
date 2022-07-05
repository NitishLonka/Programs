package ds;

public class LCS_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1 = "BANPCZ";
        String s2 = "BNPACZ";
        int m = s1.length();
        int n = s2.length();
        
		System.out.print(recur(s1,s2,m-1,n-1));
	}
   
	public static  int recur(String s1,String s2,int m,int n)
	{
		//System.out.println(m+"--"+n);
		if(m==-1||n==-1)
		{
			return 0;
		}
		if(s1.charAt(m)==s2.charAt(n)) {
			return 1+recur(s1,s2,m-1,n-1);
		}
		else
		{ 
		
			return Math.max(recur(s1,s2,m-1,n), recur(s1,s2,m,n-1));
			
		}
	}
}
