package ds;



public class DiameterOfBinTree {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeNode tll = new TreeNode(6);
		 TreeNode tlr = new TreeNode(7);
		 TreeNode tl = new TreeNode(4,tll,tlr);
		 TreeNode trl = new TreeNode(8);
		 TreeNode trr = new TreeNode(9);
		 TreeNode tr = new TreeNode(5,trl,trr);
		 TreeNode t = new TreeNode(3,tl,tr);		  
        
		 diameter(t);
    System.out.print(result);	
    
	}
	public static int result = 0;
    public static int diameter(TreeNode node) {
    if(node==null) {
    	return 0;
    }
    else {
    	int leftheight = diameter(node.left);
    	int rightheight = diameter(node.right);
    	System.out.println(leftheight+"-"+rightheight);
    	
    	result = Math.max(result, leftheight+rightheight);
    	System.out.println(result);
    	return 1+Math.max(leftheight, rightheight);
    }
    
    }
   }
 