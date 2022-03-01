package ds;

public class SearchinBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    TreeNode N = null;
	}
   public boolean SearchBST(TreeNode Node,int value)
   {
	   if(Node==null)
	   {
		   return false;
	   }
	   else if(Node.val==value)
	   {
		   return true;
	   }
	   else
	   {
		   if(value>Node.val)
		   {
			 return SearchBST(Node.right,value);
		   }
		   else
		   {
			  return SearchBST(Node.left,value);
		   }
	   }
   }
}
