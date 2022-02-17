package leetcode;
//leetcode_110平衡二叉树
public class question_110 {
    boolean is_balanced = true;
    public boolean isBalanced(TreeNode root) {
        if(root == null) return is_balanced;
        height(root);
        return  is_balanced;
    }
    public int height(TreeNode root){
        if(root == null) return 0;
        int left_height = height(root.left);
        int right_height = height(root.right);
        if(Math.abs(left_height-right_height)>1) is_balanced = false;
        return Math.max(left_height, right_height)+1;
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
