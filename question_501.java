package leetcode;

import java.util.ArrayList;
import java.util.List;

//leetcode_501二叉搜索树中的众数
//中序遍历
//我是臭傻逼
//我是大傻逼
public class question_501 {
    private List<Integer> res = new ArrayList<>();
    private TreeNode pre = null;
    private int MaxCount = 0;
    private int count;
    public int[] findMode(TreeNode root) {
        traversal(root);
        int[] result = res.stream().mapToInt(Integer::valueOf).toArray();
        return result;
    }
    public void traversal(TreeNode root){
        if(root == null){
            return;
        }
        traversal(root.left);
        if(pre == null||pre.val != root.val){
            count = 1;
        }else if(pre.val == root.val){
            count++;
        }
        if(count == MaxCount){
            res.add(root.val);
        }else if(count>MaxCount){
            MaxCount = count;
            res.clear();
            res.add(root.val);
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
