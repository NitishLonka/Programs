package ds;

public class FloorinBST {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   TreeNode tl = new TreeNode(5,null,null);
		   TreeNode trl = new TreeNode(12);
		   TreeNode trr = new TreeNode(30);
		   TreeNode tr = new TreeNode(15,trl,trr);
		   TreeNode t = new TreeNode(10,tl,tr);
		  
     System.out.println( floorBST(t,18).val);
		   //floorBST(t,20);
	}
	 	
    public static TreeNode floorBST(TreeNode node,int value)
    {   
//    	if(node.val<value)
//    	{
//    		floorNode = node;
//    		if(node.right!=null)
//    		{
//    			return floorBST(node.right,value);
//    		}
//    	}
//    	else if(node.val>value)
//    	{
//    		
//    		if(node.left!=null)
//    		{
//    			return floorBST(node.left,value);
//    		}
//    		
//    	}
//    		return floorNode;
    	TreeNode floorNode = null; 
    	while(node!=null)
    	{ 
    		if(node.val<value)
    		{
    			floorNode = node;
    			node = node.right;
    		}
    		else if(node.val>value)
    		{
    			node=node.left;
    		}
    		else
    		{
    			floorNode = node;
    			break;
    		}
    	}
    	return floorNode;
    }
}
