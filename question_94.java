package leetcode;

import java.util.ArrayList;
import java.util.List;

//leetcode_94二叉树的中序遍历
public class question_94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inTraversal(root,res);
        return res;
    }
    public void inTraversal(TreeNode root,List<Integer> list){
        if(root == null) return;
        inTraversal(root.left,list);
        list.add(root.val);
        inTraversal(root.right,list);
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
