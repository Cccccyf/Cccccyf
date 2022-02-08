package leetcode;

import java.util.LinkedList;
import java.util.Queue;

//leetcode_104二叉树的最大深度
public class question_104 {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 1;
        while(!queue.isEmpty())
        {
            int k = queue.size();
            for(int i = 0;i<k;i++) {
                root = queue.poll();
                if (root.left != null || root.right != null) {
                    if (root.left != null) queue.offer(root.left);
                    if (root.right != null) queue.offer(root.right);
                }
            }
            if(!queue.isEmpty()) depth++;
        }
        return depth;
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
