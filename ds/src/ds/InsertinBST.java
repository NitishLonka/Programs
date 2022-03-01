package ds;

public class InsertinBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertIntoBST(null,0);
	}
	  public static TreeNode insertIntoBST(TreeNode root, int val) {
	         if(root==null) {
			  return new TreeNode(val,null,null);
		  }
		  else
		  {
			  if(val>root.val) {
				 root.right = insertIntoBST(root.right,val);
			  }
			  else {
				 root.left = insertIntoBST(root.left,val);
			  }
		  }

		  return root;
	  }	        
}
