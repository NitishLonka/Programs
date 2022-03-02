package ds;

public class DeleteinBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static TreeNode deleteNode(TreeNode node,int value)
    {
    	if(node==null) {
    	 return null;
    	}
    	else {
    		if(node.val==value) {
    		  if(node.right==null&&node.left==null) {
    		   return null;
    		  }
    		  else if(node.right==null)
    		  {   
    			  return node.left;
    		  }
    		  else if(node.left==null)
    		  {
    			  return node.right;
    		  }
    		  else
    		  {
    			   TreeNode curr = findnextsuccessor(node.right);
    			   node.val=curr.val;
    			   node.right = deleteNode(node.right,curr.val);
    		  }
        	}
    		else if(value > node.val) {
    			node.right = deleteNode(node.right,value);
    		}
    		else {
    			node.left = deleteNode(node.left,value);
    		}
    		return node;
    	}
    }
    public static TreeNode findnextsuccessor(TreeNode node)
    {   
    	TreeNode curr = node;
    	while(curr!=null&&curr.left!=null) {
    		curr=curr.left;
    	}
    	return curr;	
    }
}
