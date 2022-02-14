package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//leetcode_199二叉树的右视图
public class question_199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        TreeNode temp = new TreeNode();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0;i<size;i++) {
                temp = queue.poll();
                if (i == size-1) res.add(temp.val);
                if (temp.right != null || temp.left != null) {
                    if (temp.left != null) queue.offer(temp.left);
                    if (temp.right != null) queue.offer(temp.right);
                }
            }
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
