package ds;

public class SizeOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tll = new TreeNode(6);
		 TreeNode tlr = new TreeNode(7);
		 TreeNode tl = new TreeNode(4,tll,tlr);
		 TreeNode trl = new TreeNode(8);
		 TreeNode trr = new TreeNode(9);
		 TreeNode tr = new TreeNode(5,trl,trr);
		 TreeNode t = new TreeNode(3,tl,tr);		  
		 System.out.print(sizeOfBin(t));
    
	}
   public static int sizeOfBin(TreeNode node) {
	   if(node==null) {
		   return 0;
	   }
	   return 1+sizeOfBin(node.left)+sizeOfBin(node.right);
   }
}
