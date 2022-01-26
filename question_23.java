package leetcode;
/*LeetCode_23合并N个升序链表*/
public class question_23 {
    public ListNode mergeKLists(ListNode[] lists) {
        int length = lists.length;
        boolean k = true;
        for(int i =0;i<length;i++)
        {
            if(lists[i]!=null)
            {
                k = false;
            }
        }
        if(length == 0||k == true) return null;
        for(int i = 0;i<length-1;i++)
        {
            lists[length-1] = merge2Lists(lists[i],lists[length-1]);
        }
        return lists[length-1];
    }

    public ListNode merge2Lists(ListNode listnode1,ListNode listnode2){
        ListNode first = new ListNode();
        ListNode pre = first;
        while(listnode1!=null&&listnode2!=null)
        {
            if(listnode1.val<=listnode2.val){
                pre.next = listnode1;
                listnode1 = listnode1.next;

            }else{
                pre.next = listnode2;
                listnode2 = listnode2.next;
            }
            pre = pre.next;
        }
        if(listnode1!=null)
        {
            pre.next = listnode1;
        }else{
            pre.next = listnode2;
        }
        return first.next;
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
