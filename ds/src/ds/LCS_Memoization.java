package ds;

public class LCS_Memoization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s1 = "ABCF";
       String s2 = "ADCF";
       int m = s1.length();
       int n = s2.length();
       int[][] mem = new int[m+1][n+1];
       for(int i=0;i<m+1;i++) {
    	   for(int j=0;j<n+1;j++) {
    		   mem[i][j] = -1;
    	   }
       }
	System.out.print(memo(s1,s2,m,n,mem));
	}
	public static int memo(String s1,String s2,int m, int n,int[][] mem) {
		
		if(mem[m][n]!=-1) {
			return mem[m][n];
		}
		else
		{
		if(m==0||n==0)
		{
			mem[m][n]=0;
		}
		else
		{
			if(s1.charAt(m-1)==s2.charAt(n-1)) {
			
				mem[m][n] =  1+memo(s1,s2,m-1,n-1,mem);
			}
			else
			{
			  mem[m][n] =  Math.max(memo(s1,s2,m-1,n,mem),memo(s1,s2,m,n-1,mem));
			}
		}
		}
		return mem[m][n];
	}

}




//public int recur(int[] coins,int amount,int[] dp){
//   // System.out.println(amount);
//
//   if(amount<0)
//    {
//        return  Integer.MAX_VALUE;
//    }
//    else if(amount==0)
//    {
//        return 0;
//    }
//    else
//    {
//        if(dp[amount]!=0) return dp[amount]; 
//        int min = Integer.MAX_VALUE;
//        for(int i=0;i<coins.length;i++){
//            int value = recur(coins,amount-coins[i],dp);
//            if(value==Integer.MAX_VALUE)
//                continue;
//            value = 1+value;
//            
//              if(min > value){
//               min = value;
//              } 
//            
//        }
//        dp[amount] = min;
//        return min;
//    }
//}
