package leetcode;
//leetcode_101对称二叉树
//靠清楚思想啊你个傻逼
public class question_101 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return check(root,root);
    }
    public boolean check(TreeNode node1,TreeNode node2){
        if(node1==null&&node2==null) return true;
        if(node1==null||node2==null) return false;
        return node1.val==node2.val&&check(node1.left,node2.right)&&check(node1.right,node2.left);
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
