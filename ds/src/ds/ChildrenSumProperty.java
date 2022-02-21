package ds;

public class ChildrenSumProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tll = new TreeNode(1);
		 TreeNode tlr = new TreeNode(2);
		 TreeNode tl = new TreeNode(3,tll,tlr);
		 TreeNode trl = new TreeNode(3);
		 TreeNode trr = new TreeNode(4);
		 TreeNode tr = new TreeNode(7,trl,trr);
		 TreeNode t = new TreeNode(10,tl,tr);
		 System.out.println(CheckChildrenSum(t));  
	
	
}
	public static boolean CheckChildrenSum(TreeNode node) {
		
		if(node==null)
		{
			return true;
		}
		if(node.left==null&&node.right==null)
		{
			return true;
		}
		int sum =0;
		if(node.left!=null)
		{
			sum += node.right.val;
		}
		if(node.right!=null)
		{
			sum += node.left.val;
		}
		
		   return sum==node.val&&CheckChildrenSum(node.left)&&CheckChildrenSum(node.right);
	   
	}
}
