package leetcode;
/*19.删除链表的倒数第N个结点*/
public class question_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode();
        pre.next = head;
        ListNode node = pre;
        ListNode point = node;
        for(int i = 0;i<n;i++)
        {
            point = point.next;
        }
        while(point.next!=null)
        {
            node = node.next;
            point = point.next;
        }
        node.next = node.next.next;
        return pre.next;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next;
        }
    }
}
