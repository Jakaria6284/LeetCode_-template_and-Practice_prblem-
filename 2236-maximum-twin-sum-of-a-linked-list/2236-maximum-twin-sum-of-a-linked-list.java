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
    public ListNode reverse(ListNode midhead)
    {
        ListNode current=midhead;
        ListNode prev=null;

        while(current!=null)
        {
            ListNode Next=current.next;
            current.next=prev;
            prev=current;
            current=Next;
        }

        return prev;
    }
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode temp=reverse(slow.next);
        slow.next=temp;

        ListNode p1=head;
        ListNode p2=slow.next;
        int max=0;

        while(p2!=null)
        {
           int sum=p1.val+p2.val;
           max=Math.max(sum,max);
           p1=p1.next;
           p2=p2.next;


        }

        return max;
        
    }
}