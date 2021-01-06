package Trees;

public class maximumDepthofBinaryTree {
	
	// Version 1: Divide Conquer
	 public int maxDepth(TreeNode root) {
		 if(root == null)
			 return 0;
		 
		 return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
	        
	    }
}

class maxmumDepthofBinaryTreeTraverseSolution{
	
	// version 2: Traverse
	private int depth;
	public int maxDepth(TreeNode root)
	{
		depth =0;
		helper(root, 1);
		return depth;
	}
	private void helper(TreeNode node, int curDepth)
	{
		if(node==null)
		{return;}
		depth = Math.max(curDepth, depth);
		helper(node.left, curDepth+1);
		helper(node.right, curDepth +1);
	}
	
}