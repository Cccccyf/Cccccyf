package leetcode;
//leetcode_538把二叉搜索树转换为累加树
//我真牛逼
public class question_538 {
    public TreeNode cur;
    private int add = 0;
    public TreeNode convertBST(TreeNode root) {
        if(root == null){
            return null;
        }
        root.right = convertBST(root.right);
        cur = root;
        cur.val += add;
        add = cur.val;
        root.left = convertBST(root.left);
        return  root;
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
