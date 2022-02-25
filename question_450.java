package leetcode;
//leetcode_450删除二叉搜索树中的节点
//傻逼
//我是大傻逼草
//傻逼傻逼傻逼傻逼傻逼
public class question_450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if(root.val == key){
            if(root.left==null&&root.right==null){
                return null;
            }else if(root.left == null&&root.right!=null){
                return root.right;
            }else if(root.right == null&&root.left!=null){
                return root.left;
            }else if(root.left != null&&root.right != null){
                TreeNode temp = root.right;
                while(temp.left!=null){
                    temp = temp.left;
                }
                temp.left = root.left;
                return root.right;
            }
        }
        if(root.val>key) root.left = deleteNode(root.left,key);
        if(root.val<key) root.right = deleteNode(root.right,key);
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
