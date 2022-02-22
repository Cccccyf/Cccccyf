package leetcode;

import java.util.ArrayList;
import java.util.List;

//leetcode113_路径总和II
public class question_113 {
    private int sum = 0;
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root == null) return res;
        List<Integer> paths = new ArrayList<>();
        dfs(root,targetSum,paths);
        return res;
    }
    public void dfs(TreeNode root,int targetSum,List<Integer> paths){
        sum += root.val;
        paths.add(root.val);
        if(sum==targetSum&&root.left==null&&root.right==null){
            res.add(new ArrayList<>(paths));
        }
        if(root.left!=null){
            dfs(root.left,targetSum,paths);
        }
        if(root.right!=null){
            dfs(root.right,targetSum,paths);
        }
        sum -= root.val;
        paths.remove(paths.size()-1);
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
