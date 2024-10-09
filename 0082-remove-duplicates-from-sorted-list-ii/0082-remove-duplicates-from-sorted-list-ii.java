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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev=new ListNode(0,head);
        ListNode dumy=prev;

        while(head!=null)
        {
            if(head.next!=null && head.val==head.next.val)
            {
                int val=head.val;

                while(head.next!=null && val==head.next.val)
                {
                    head=head.next;
                }

                dumy.next=head.next;
            }else
            {
                dumy=dumy.next;
            }
            head=head.next;
        }

        return prev.next;
        
    }
}