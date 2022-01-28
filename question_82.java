package leetcode;
/*leetcode_82删除排序链表中的重复元素II*/
public class question_82 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode real_head = new ListNode(-1);
        real_head.next = head;
        ListNode slow = real_head;
        ListNode fast = real_head.next;
        boolean whether_repeat = false;
        while(fast!=null){   //real_head->1 1 ->null
            int value = fast.val;
            while(fast!=null){
                if(whether_repeat == false){
                    if(fast.next!=null){
                        if(fast.next.val==value){
                            whether_repeat=true;
                            fast = fast.next;
                        }else{
                            break;
                        }
                    }else{
                        break;
                    }
                }else{
                    if(fast.next == null){
                        fast =fast.next;
                        break;
                    }
                    if(fast.next.val == value){
                        fast = fast.next;
                    }else{
                        fast = fast.next;
                        break;
                    }
                }
            }
            slow.next =fast;
            if(fast!=null) {
                if(fast.next!=null) {
                    if (fast.next.val != fast.val) {
                        slow = slow.next;
                        fast = fast.next;
                    }
                }else{
                    fast = fast.next;
                }
            }
            whether_repeat = false;
        }
        return real_head.next;
    }
}
//终于通过了，太不容易了，操
