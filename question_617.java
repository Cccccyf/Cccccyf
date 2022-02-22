package leetcode;
//leetcode_617合并二叉树
//哈哈开香槟喵
public class question_617 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return merge(root1,root2);
    }
    public TreeNode merge(TreeNode root1,TreeNode root2){
        TreeNode root = new TreeNode();
        if(root1!=null&&root2!=null){
            root = new TreeNode(root1.val+root2.val);
            root.left = merge(root1.left,root2.left);
            root.right = merge(root1.right,root2.right);
        }else if(root1!=null&&root2==null){
            return root1;
        }else if(root1==null&&root2!=null){
            return root2;
        }else if(root1==null&&root2==null){
            return null;
        }
        return root;
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
