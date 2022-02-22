package leetcode;
//leetcode_112路径总和
//我是臭傻逼
public class question_112 {
    private boolean has_path_sum = false;
    private int sum = 0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        dfs(root,targetSum);
        return has_path_sum;
    }
    public void dfs(TreeNode root, int targetSum) {
        if(root == null){
            has_path_sum = false;
            return;
        }
        sum += root.val;
        if(sum == targetSum&&root.left==null&&root.right==null) has_path_sum = true;
        if(root.left==null&&root.right==null){
            sum-=root.val;
            return;
        }
        if(root.left!=null) {
            dfs(root.left,targetSum);
        }
        if(root.right!=null) {
            dfs(root.right,targetSum);
        }
        sum-=root.val;
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
