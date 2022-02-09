package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//leetcode_102二叉树的层序遍历
public class question_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        TreeNode temp = new TreeNode();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            List<Integer> son = new ArrayList<>();
            int size = queue.size();
            for(int i = 0;i<size;i++)
            {
                temp = queue.poll();
                son.add(temp.val);
                if (temp.left != null || temp.right != null) {
                    if (temp.left != null) queue.offer(temp.left);
                    if (temp.right != null) queue.offer(temp.right);
                }
            }
            res.add(son);
        }
        return res;
    }
    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode() {}
       TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }
   }
}
