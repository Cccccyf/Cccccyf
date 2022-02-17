package leetcode;

import java.util.LinkedList;
import java.util.Queue;

//leetcode_222完全二叉树的节点个数
//层序遍历方法……时间复杂度有点不够看
public class question_222 {
    public int countNodes(TreeNode root) {
        int depth = 0;
        if(root==null) return depth;
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode temp  = new TreeNode();
        queue.offer(root);
        depth++;
        while(!queue.isEmpty())
        {
            int size = queue.size();
            for(int i = 0;i<size;i++)
            {
                temp = queue.poll();
                if(temp.left!=null){
                    queue.offer(temp.left);
                    depth++;
                }
                if(temp.right!=null){
                    queue.offer(temp.right);
                    depth++;
                }
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
