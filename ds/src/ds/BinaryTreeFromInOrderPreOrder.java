package ds;

public class BinaryTreeFromInOrderPreOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in = {20,10,40,30,50};
		int[] pre = {10,20,30,40,50};
    TreeNode node = new BinaryTreeFromInOrderPreOrder().cTree(in,pre,0,4);
    new LevelOrderTraversal().printOrder(node);
	}
	public int preindex =0;
	public TreeNode cTree(int in[],int pre[],int is,int ie) {
		if(is>ie) return null;
		TreeNode root = new TreeNode(pre[preindex++]);
		int inIndex=0;
		for(int i = is;i<=ie;i++)
		{
		  if(in[i]==root.val) {
			 inIndex=i;
			 break;
		  }
		}
		root.left = cTree(in,pre,is,inIndex-1);
		root.right = cTree(in,pre,inIndex+1,ie);
		return root;
	}
}
