package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//leetcode_637二叉树的层平均值
public class question_637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        double sum = 0.0;
        if(root == null){
            res.add(sum);
            return res;
        }
        TreeNode temp = new TreeNode();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            sum = 0.0;
            for(int i = 0;i<size;i++) {
                temp = queue.poll();
                sum += (double)temp.val;
                if (i == size-1) res.add(sum/size);
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
