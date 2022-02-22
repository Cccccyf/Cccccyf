package leetcode;
//leetcode_700二叉搜索树中的搜索
//傻逼人做傻逼题
public class question_700 {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null||root.val == val){
            return root;
        }
        if(root.val<val){
            return searchBST(root.right,val);
        }else{
            return searchBST(root.left,val);
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
