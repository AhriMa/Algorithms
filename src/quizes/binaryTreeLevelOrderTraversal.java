package quizes;


import Trees.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    int data;
    Node left, right;
 
    public Node(int item) {
        data = item;
        left = null;
        right = null;
    }
}

public class binaryTreeLevelOrderTraversal {
	 Node root;
    public List<List<Integer>> levelOrder(TreeNode root) {

    	List result =  new ArrayList();
    	if(root == null)
    		return result;
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	queue.offer(root);
    	queue.add(root);
    	while(!queue.isEmpty())
    	{
    		ArrayList<Integer> level = new ArrayList<Integer>();
    		int size = queue.size();
    		for (int i =0; i < size; i++)
    		{ 
    			TreeNode head = queue.poll();
    			level.add(head.val);
    			if(head.left != null)
    			{
    				queue.offer(head.left);
    			}
    			if(head.right != null)
    			{
    				queue.offer(head.right);
    			}
    			
    		}
    		result.add(level);
    		

    	}
    	return result;
    	
    	
    	


    }
}
