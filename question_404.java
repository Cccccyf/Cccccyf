package leetcode;
//leetcode_404左叶子之和
public class question_404 {
    public int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root.left==null&&root.right==null) return 0;
        dfs(root,false);
        return sum;
    }
    public void dfs(TreeNode root,boolean lOr){
        if(root.left==null&&root.right==null&&lOr==true){
            sum+=root.val;
        }
        if(root.left!=null){
            dfs(root.left,true);
        }
        if(root.right!=null){
            dfs(root.right,false);
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
