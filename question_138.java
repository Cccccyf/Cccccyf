package leetcode;
/*LeetCode_138 复制带随机指针的链表*/

import java.util.HashMap;
import java.util.Map;

/*哈希表的应用，无思路，需看题解*/
/*有点要明白了，但还是不太明白*/
/*另一种方法复制每一个节点，使复制节点称为原节点的next,倘若原节点j是i的random,则j+1是i+1的random,
* 之后分离链表*/
public class question_138 {
    Map<Node, Node> cachedNode = new HashMap<Node, Node>();
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        if (!cachedNode.containsKey(head)) {
            Node headNew = new Node(head.val);
            cachedNode.put(head, headNew);
            headNew.next = copyRandomList(head.next);
            headNew.random = copyRandomList(head.random);
        }
        return cachedNode.get(head);
    }
}
//另一种方法
/*
public class question_138 {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if(head == null) return null;
        Node initial = head;
        while(initial!=null){
            Node new_node = new Node(initial.val);
            new_node.next = initial.next;
            initial.next = new_node;
            initial = initial.next.next;
        }
        initial = head;
        while(initial!=null)
        {
            if(initial.random != null){
                initial.next.random = initial.random.next;
            }
            initial = initial.next.next;
        }
        initial = head;
        Node later = head.next;
        Node new_head = head.next;
        while(later!=null){
            initial.next = later.next;
            if(later.next == null){
                later.next = null;
            }else {
                later.next = initial.next.next;
            }
            initial = initial.next;
            later = later.next;
        }
        return new_head;
    }
}*/
