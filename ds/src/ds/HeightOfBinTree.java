package ds;

public class HeightOfBinTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      maxDepth(null);
	}



    public static int maxDepth(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        else
        {
            return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
        }
    }
}
