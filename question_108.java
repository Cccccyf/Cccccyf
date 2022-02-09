package leetcode;
//leetcode_108将有序数组转换为二叉搜索树
//初步思路是二分法，反复二分
public class question_108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;
        return dfs(nums,0,nums.length-1);
    }
    public TreeNode dfs(int[] nums,int start,int end){
        int mid = start + (end - start)/2;
        TreeNode new_node = new TreeNode(nums[mid]);
        if(mid!=start) {
            new_node.left = dfs(nums, start, mid - 1);
        }
        if(mid!=end) {
            new_node.right = dfs(nums, mid + 1, end);
        }
        return new_node;
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
