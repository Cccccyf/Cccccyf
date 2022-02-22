package leetcode;

import java.util.LinkedList;
import java.util.Queue;

//leetcode_513找树左下角的值
public class question_513 {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode temp = new TreeNode();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int size = queue.size();
            for(int i = 0;i<size;i++)
            {
                temp = queue.poll();
                if(temp.right!=null){
                    queue.offer(temp.right);
                }
                if(temp.left!=null){
                    queue.offer(temp.left);
                }
            }
        }
        return temp.val;
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
