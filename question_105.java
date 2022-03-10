package leetcode;
//leetcode_105从前序与中序遍历序列构造二叉树
public class question_105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return traversal(preorder,0,preorder.length-1,
                inorder,0,inorder.length-1);
    }
    public TreeNode traversal(int[] preorder,int preLeft,int preRight,int[] inorder
    ,int inLeft,int inRight){
        if(inRight-inLeft < 0) return null;
        TreeNode root = null;
        int preValue = preorder[preLeft];
        int index;
        for(index = inLeft;index<=inRight;index++)
        {
            if(inorder[index] == preValue){
                root = new TreeNode(preValue);
                break;
            }
        }
        root.left = traversal(preorder,preLeft+1,preLeft+index-inLeft,inorder,inLeft,index-1);
        root.right = traversal(preorder,preLeft+index-inLeft+1,preRight,inorder,index+1,inRight);
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
