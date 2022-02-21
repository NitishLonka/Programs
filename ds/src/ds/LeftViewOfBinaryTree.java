package ds;

import java.util.LinkedList;
import java.util.Queue;

public class LeftViewOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeNode tll = new TreeNode(6);
		TreeNode tll = null;
		TreeNode trrr = new TreeNode(10);
		 TreeNode tlr = new TreeNode(7);
		 TreeNode tl = new TreeNode(4,tll,tlr);
		 TreeNode trl = new TreeNode(8);
		 TreeNode trr = new TreeNode(9,null,trrr);
		 TreeNode tr = new TreeNode(5,trl,trr);
		 TreeNode t = new TreeNode(3,tl,tr);		  
		 
    printLeftView(t);
	}
    public static void printLeftView(TreeNode node) {
    	Queue<TreeNode> q = new LinkedList<TreeNode>();
    	q.add(node);
    	while(!q.isEmpty())
    	{
    		int count=q.size();
    		for(int i=0;i<count;i++)
    		{  TreeNode first = q.poll();
    			if(i==0)
    			{ 
    				
    				System.out.println(first.val);
    				
    			}
    			
    			if(first.left!=null)
	    			  q.add(first.left);
	    		if(first.right!=null)
	    			  q.add(first.right);
    			
    		}
    	}
    }
}
