package leetcode;
//leetcode_98验证二叉搜索树
//边界值太恶心了
public class question_98 {
    public boolean flag = true;
    public boolean isValidBST(TreeNode root) {
        if(root.left==null&&root.right == null) return flag;
        dfs(root,Long.MIN_VALUE,Long.MAX_VALUE);
        return flag;
    }
    public void dfs(TreeNode root,long lower,long upper){
        if(root == null) return;
        if(root.val<=lower||root.val>=upper) flag = false;
        if(flag){
            dfs(root.left,lower,root.val);
            dfs(root.right,root.val,upper);
        }
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
