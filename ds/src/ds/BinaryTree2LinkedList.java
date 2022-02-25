package ds;

import ds.DLL.Node;

public class BinaryTree2LinkedList {
	public TreeNode prev = null;
    public TreeNode buildUp(TreeNode root) {
    	if(root==null) {
    	  return root;
    	}
    	TreeNode head = buildUp(root.left);
    	if(prev==null) {
    	head = root;
    	}
    	else
    	{
    		root.left=prev;
    		prev.right = root;
    	}
    	prev = root;
    	buildUp(root.right);
    	return head;
    }
}
