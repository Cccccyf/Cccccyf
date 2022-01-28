package leetcode;
/*leetcode_61旋转链表*/
public class question_61 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        int num = 0;
        ListNode node = head;
        while(true){
            num++;
            if(node.next == null) {
                node.next = head;
                break;
            }
            node = node.next;
        }
        k = num-k%num;
        node = head;
        for(int i = 0;i<k-1;i++)
        {
            node = node.next;
        }
        ListNode new_head = node.next;
        node.next = null;
        return new_head;
    }
}
