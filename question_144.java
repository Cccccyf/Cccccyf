package leetcode;

import java.util.ArrayList;
import java.util.List;

//leetcode_144二叉树的前序遍历
public class question_144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preTraversal(root,res);
        return  res;
    }
    public void  preTraversal(TreeNode root,List<Integer> list){
        if(root == null) return;
        list.add(root.val);
        preTraversal(root.left,list);
        preTraversal(root.right,list);
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
