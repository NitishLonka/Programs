package ds;

public class ElementsKthdistance {
   public static void main(String[] args)
   {
	   
	   
	   TreeNode tll = new TreeNode(6);
	   TreeNode tlr = new TreeNode(7);
	   TreeNode tl = new TreeNode(4,tll,tlr);
	   TreeNode trl = new TreeNode(8);
	   TreeNode trr = new TreeNode(9);
	   TreeNode tr = new TreeNode(5,trl,trr);
	   TreeNode t = new TreeNode(3,tl,tr);
	   printkthelement(t,2);
   }
	public static void printkthelement(TreeNode node,int count)
	{
		if(node==null)
			return;
		else {
		if(count==0)
		{
			System.out.println(node.val);
		}
		else
		{
			printkthelement(node.left,count-1);
			printkthelement(node.right,count-1);
		}
		}
	}
}
