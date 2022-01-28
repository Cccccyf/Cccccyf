package leetcode;
/*leetcode_2两数之和 */
public class question_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = new ListNode(0);
        ListNode node = first;
        int carry =0;
        while(l1!=null||l2!=null)
        {
            int x = l1==null?0:l1.val;
            int y = l2==null?0:l2.val;
            int sum = x + y + carry;
            carry = sum/10;
            sum = sum % 10;
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
            node.next = new ListNode(sum);
            node = node.next;
        }
        if(carry == 1){
            node.next = new ListNode(carry);
        }
        return first.next;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
    }
}
