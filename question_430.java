package leetcode;
/*leetcode 430扁平化多级双向链表*/
public class question_430 {
    // Definition for a Node.
    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    };
    public Node flatten(Node head) {
        if(head == null ) return null;
        return dfs(head);
    }
    public Node dfs(Node head){
        Node node = head;
        while(node.child==null){
            if(node.next == null) return head;
            node = node.next;
        }
        Node next = node.next;
        Node new_head = dfs(node.child);
        node.child = null;
        node.next = new_head;
        new_head.prev = node;
        while(node.next!=null){
            node = node.next;
        }
        node.next = next;
        if(next!=null) {
            next.prev = node;
        }
        return head;
    }
}
