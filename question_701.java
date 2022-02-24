package leetcode;
//leetcode_701二叉搜索树中的插入操作
//我真的铁脑残
//我他妈把这个跟其他东西弄混了草
public class question_701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            TreeNode node = new TreeNode(val);
            return node;
        }
        if(val>root.val){
            root.right = insertIntoBST(root.right,val);
        }else if(val<root.val){
            root.left = insertIntoBST(root.left,val);
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
