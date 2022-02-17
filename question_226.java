package leetcode;
//leetcode_226翻转二叉树
public class question_226 {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        swap(root);
        return root;
    }
    public void swap(TreeNode root){
        if(root==null) return;
        TreeNode temp = new TreeNode();
        swap(root.left);
        swap(root.right);
        temp = root.left;
        root.left = root.right;
        root.right = temp;
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
