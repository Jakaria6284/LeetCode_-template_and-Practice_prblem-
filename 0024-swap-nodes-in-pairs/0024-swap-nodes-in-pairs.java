/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }

        
        ListNode slow=head;
        ListNode fast=head.next;

       while(slow != null && fast != null)

        {
            int t=slow.val;
            slow.val=fast.val;
            fast.val=t;
           if(slow!=null && slow.next!=null)
           {
            slow=slow.next.next;
           }

           if(fast!=null && fast.next!=null)
           {
            fast=fast.next.next;
           }
        }

        return head;
        
    }
}