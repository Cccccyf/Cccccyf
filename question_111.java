package leetcode;
import java.util.LinkedList;
import java.util.Queue;

//leetcode_111二叉树的最小深度
public class question_111 {
    public int minDepth(TreeNode root) {
        int depth = 0;
        if(root == null) return depth;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode temp = new TreeNode();
        while(!queue.isEmpty())
        {
            int size = queue.size();
            temp = queue.poll();
            depth++;
            for(int i = 0;i<size;i++)
            {
                if(temp.left==null&&temp.right==null){
                    return depth;
                }
                if(temp.left!=null) queue.offer(temp.left);
                if(temp.right!=null) queue.offer(temp.right);
            }
        }
        return depth;
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
