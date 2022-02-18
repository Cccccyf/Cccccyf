package leetcode;


import java.util.ArrayList;
import java.util.List;

//leetcode_257二叉树的所有路径
//思想
public class question_257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        List<Integer>paths = new ArrayList<>();
        if(root == null) return res;
        dfs(root,paths,res);
        return res;
    }
    public void dfs(TreeNode root,List<Integer> paths,List<String> res){
        paths.add(root.val);
        if(root.left== null&&root.right==null){
            StringBuilder stringBuilder = new StringBuilder();
            for(int i = 0;i<paths.size()-1;i++)
            {
                stringBuilder.append(paths.get(i)).append("->");
            }
            stringBuilder.append(paths.get(paths.size()-1));
            res.add(stringBuilder.toString());
        }
        if(root.left!=null){
            dfs(root.left,paths,res);
            paths.remove(paths.size()-1);
        }
        if(root.right!=null){
            dfs(root.right,paths,res);
            paths.remove(paths.size()-1);
        }
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
