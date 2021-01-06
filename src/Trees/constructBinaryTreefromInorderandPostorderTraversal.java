package Trees;
//assume duplicates do not exist in the tree

//inorder = [9,3,15,20,7]
//postorder = [9,15,7,20,3]
/* 
 * return the binary tree:
 * 
 *   3
   / \
  9  20
    /  \
   15   7
   
   InOrder and PostOrder
   */

// InOrder && Postorder
// PostOrder's last number is root.

public class constructBinaryTreefromInorderandPostorderTraversal {
	
    public TreeNode buildTree(int[] inorder, int[] postorder) {
    	return helper(inorder , postorder, 0, inorder.length-1, postorder.length-1);
    }
    //postorderend is always the root
    // postorder[postorderend] 永远指向recursion 的root
    public TreeNode helper(int[] inorder, int[] postorder, int inorderstart, int inorderend, int postorderend)
    {
    	if(inorderstart> inorderend || postorderend <0)
    	{
    		return  null;
    	}
    	TreeNode root = new TreeNode(postorder[postorderend]);
    	int i= inorderstart; 
    	for(; i< inorderend; i++)
    	{
    		if(inorder[i] == root.val)
    		{
    			break;
    		}
    	}
    	root.left=helper(inorder, postorder, inorderstart, i-1, postorderend-1+i-inorderend);
		root.right=helper(inorder, postorder, i+1, inorderend, postorderend-1);
    	return root;
    }

}
