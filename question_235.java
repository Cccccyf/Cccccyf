package leetcode;
//leetcode_235二叉平衡树的最近公共祖先
public class question_235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val<p.val&&root.val<q.val){
            return lowestCommonAncestor(root.right,p,q);
        }else if(root.val>p.val&&root.val>q.val){
            return lowestCommonAncestor(root.left,p,q);
        }else {
            return root;
        }
    }
    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }
}
