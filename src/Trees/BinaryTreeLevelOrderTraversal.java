package Trees;


import jdk.nashorn.api.tree.Tree;

import java.util.*;


public class BinaryTreeLevelOrderTraversal {
    //单队列解法
    public static List<List<Integer>> levelOrderSingleQueue(TreeNode root) {

        // step 1 判断根结点
        List result = new ArrayList();
        if(root ==  null)
        {
            return result;
        }
        // step 2 遍历叶子结点， 用queue, 因为queue size 变化， 需要定义一个size ， 双队列 不需要pop 头部所以用arraylist 即可
        Queue<TreeNode> queue = new LinkedList<TreeNode>();//需要pop 所以用linked list
        // offer() : This method is preferable to add() method since this method does not throws an exception when the capacity of the container is full since it returns false.，
        // Returns: This method returns true on successful insertion else it returns false.
        queue.offer(root);
        while(!queue.isEmpty())
        {
            ArrayList<Integer> level = new ArrayList<Integer>();
            int size = queue.size();
            for(int i=0; i < size ; i++)
            {
                //The poll() method of Queue Interface returns and removes the element at the front the container. It deletes the element in the container.
                // The method does not throws an exception when the Queue is empty, it returns null instead.
                TreeNode head = queue.poll();
                level.add(head.val);
                if(head.left!=null)
                {
                    queue.offer(head.left);
                }
                if(head.right !=null)
                {
                    queue.offer(head.right);
                }

            }
            result.add(level); // 每一层level  加一次
        }
        return result;


    }



}
