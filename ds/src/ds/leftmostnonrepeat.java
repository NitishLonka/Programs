package ds;
import java.util.*;
public class leftmostnonrepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s = "aabbccdd";
     System.out.print(checker(s));
	}
 
	public static int checker(String s)
	{   int[] fIndex=new int[256];
    Arrays.fill(fIndex,Integer.MAX_VALUE);
    int min=Integer.MAX_VALUE;
	  for(int i=0;i<s.length();i++)
	  {  
		  if(fIndex[s.charAt(i)]!=Integer.MAX_VALUE)
		  {
			  fIndex[s.charAt(i)]=Integer.MAX_VALUE;
		  }
		  else
		  {
			  fIndex[s.charAt(i)]=i;
			 
		  }
		  
	  }
	  for(int i=0;i<fIndex.length;i++)
	  { // System.out.println(fIndex[i]);
		  if(fIndex[i]<min)
		  {
			  min = fIndex[i];
		  }
	  }
	  return min;
	}
}
