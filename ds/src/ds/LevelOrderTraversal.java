package ds;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeNode tll = new TreeNode(6);
		 TreeNode tlr = new TreeNode(7);
		 TreeNode tl = new TreeNode(4,tll,tlr);
		 TreeNode trl = new TreeNode(8);
		 TreeNode trr = new TreeNode(9);
		 TreeNode tr = new TreeNode(5,trl,trr);
		 TreeNode t = new TreeNode(3,tl,tr);		  
         printOrder(t);
	}

    public static void printOrder(TreeNode node)
    {
    	Queue<TreeNode> q = new LinkedList<TreeNode>();
    	q.add(node);
    	while(!q.isEmpty()) {
    		TreeNode head = q.element();
    		System.out.print(head.val+" ");
    		q.remove(head);
    	   if(head.left!=null) {
    		q.add(head.left);
    	    }
    		if(head.right!=null) {
    		q.add(head.right);
    		}
    		
    	}
    }
}

