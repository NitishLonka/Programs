package ds;

public class KthSmallestelementinLogTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=4;
		
		int arr[]=  { 20, 8, 22, 4, 12, 10, 14 };
		AugNode root=null;
		for(int i:arr)
		{
			root=insertAug(i,root);
		}
		
		AugNode res = findkthsmallest(root, k);
        if (res == null)
            System.out.println("There are less "
                           + "than "+k+" nodes in the BST");
        else
            System.out.println(k+"-th Smallest"
                    + " Element is " + res.data);
	}
    public static AugNode findkthsmallest(AugNode root,int k) {

        if (root == null)
            return null;
     
        int count = root.lcount + 1;
        if (count == k)
            return root;
     
        if (count > k)
            return findkthsmallest(root.left, k);
     
        return findkthsmallest(root.right, k - count);

    }
    public static AugNode insertAug(int x,AugNode root)
    {
    	if (root == null)
            return new AugNode(x);
      
        if (x < root.data) {
            root.left = insertAug(x,root.left);
            root.lcount++;
        }
     
        else if (x > root.data)
            root.right = insertAug(x,root.right);
        return root;
    	
    }
}
