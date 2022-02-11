package leetcode;

import java.util.ArrayList;
import java.util.List;

//leetcode_145二叉树的后序遍历
public class question_145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postTraversal(root,res);
        return res;
    }
    public void postTraversal(TreeNode root,List<Integer> list){
        if(root == null) return;
        postTraversal(root.left,list);
        postTraversal(root.right,list);
        list.add(root.val);
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
