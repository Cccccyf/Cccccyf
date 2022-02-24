package leetcode;

import java.util.LinkedList;
import java.util.Queue;

//leetcode_530二叉搜索树的最小绝对差
//没写出来我是傻逼
//傻逼
//中序遍历
public class question_530 {
    private TreeNode pre;
    private int MinimumDifference = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        traversal(root);
        return MinimumDifference;
    }
    public void traversal(TreeNode root){
        if(root == null) return;
        traversal(root.left);
        if(pre!=null){
            MinimumDifference = Math.min(MinimumDifference,root.val-pre.val);
        }
        pre = root;
        traversal(root.right);
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
