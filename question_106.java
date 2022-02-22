package leetcode;
//leetcode_106从中序与后序遍历序列构造二叉树
//分治算法？
//我是臭傻逼
public class question_106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree1(inorder, 0, inorder.length,
                postorder, 0, postorder.length);
    }
    public TreeNode buildTree1(int[] inorder, int inLeft, int inRight,
                               int[] postorder, int postLeft, int postRight) {
        int postValue = postorder[postRight-1];
        TreeNode root = new TreeNode();
        if(inRight-inLeft < 1) return null;
        if(inRight-inLeft == 1) return new TreeNode(inorder[inLeft]);
        int index;
        for(index = 0;index<inRight;index++)
        {
            if(inorder[index] == postValue)
            {
                root = new TreeNode(postValue);
                break;
            }
        }
        root.left = buildTree1(inorder,inLeft,index,postorder,postLeft,postLeft+(index-inLeft));
        root.right = buildTree1(inorder,index+1,inRight,postorder,postLeft+index-inLeft,postRight-1);
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
