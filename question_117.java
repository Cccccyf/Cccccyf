package leetcode;

import java.util.LinkedList;
import java.util.Queue;

//leetcode_117填充每个节点的下一个右侧节点指针II
public class question_117 {
    public Node connect(Node root) {
        if(root == null) {
            return null;
        }
        Queue<Node> res = new LinkedList<>();
        Node temp = new Node();
        Node swap = new Node();
        res.offer(root);
        while(!res.isEmpty())
        {
            int size = res.size();
            for(int i = 0;i<size;i++)
            {
                temp = res.poll();
                if(i == 0){
                    temp.next = null;
                }else{
                    temp.next = swap;
                }
                if (temp.right != null || temp.left != null) {
                    if (temp.right != null) res.offer(temp.right);
                    if (temp.left != null) res.offer(temp.left);
                }
                swap = temp;
            }
        }
        return root;
    }
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
}
