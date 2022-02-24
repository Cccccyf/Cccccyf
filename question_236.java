package leetcode;
//leetcode_236二叉树的最近公共祖先
//傻逼
public class question_236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||root==p||root==q) return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left == null&&right != null){
            return right;
        }else if(left != null&&right == null){
            return left;
        }else if(left != null&&right != null){
            return root;
        }else{
            return null;
        }
    }
    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }
}
