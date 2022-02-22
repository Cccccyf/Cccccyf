package leetcode;
//leetcode_100相同的树
public class question_100 {
    public boolean is_same_tree = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        check(p,q);
        return is_same_tree;
    }
    public void check(TreeNode p,TreeNode q){
        if((p==null&&q!=null)||(q==null&&p!=null)){
            is_same_tree = false;
        }else if(p==null&&q==null) {
            return;
        } else if(p.val==q.val){
            check(p.left,q.left);
            check(p.right,q.right);
        }else
        {
            is_same_tree = false;
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
