package leetcode;
//leetcode_654最大二叉树
public class question_654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return traversal(nums,0,nums.length-1);
    }
    public TreeNode traversal(int[] nums,int left,int right){
        if(right<left) return null;
        int index = getMax(nums,left,right);
        TreeNode root = new TreeNode(nums[index]);
        root.left = traversal(nums,left,index-1);
        root.right = traversal(nums,index+1,right);
        return root;
    }
    public int getMax(int[] nums,int left,int right){
        int max = nums[left];
        int index = left;
        for(int i = left+1;i<=right;i++)
        {
            if(max < nums[i]){
                max = nums[i];
                index = i;
            }
        }
        return index;
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
