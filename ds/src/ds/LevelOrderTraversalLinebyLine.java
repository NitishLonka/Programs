package ds;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalLinebyLine {

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

	/*
	 * public static void printOrder(TreeNode node) { Queue<TreeNode> q = new
	 * LinkedList<TreeNode>(); Queue<Integer> i = new LinkedList<Integer>();
	 * q.add(node); i.add(1); int l = i.element(); while(!q.isEmpty()) { TreeNode
	 * head = q.element(); if(i.element()!=l) { System.out.println(); }
	 * System.out.print(head.val); l= i.element(); q.remove(head); i.remove(l);
	 * if(head.left!=null) { q.add(head.left); i.add(l+1); } if(head.right!=null) {
	 * q.add(head.right); i.add(l+1); }
	 * 
	 * } }
	 */
	
	public static void printOrder(TreeNode node) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(node);
		int count = 0;
		while(!q.isEmpty()) {
			count = q.size();
			for(int i=0;i<count;i++) {
			TreeNode t = q.poll();
			System.out.print(t.val);
			if(t.left!=null)
			{
				q.add(t.left);
			}
			if(t.right!=null)
			{
				q.add(t.right);
			}
			
			}
			System.out.println();
		}
	}
}

