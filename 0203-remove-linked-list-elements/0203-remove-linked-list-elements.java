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
    public ListNode removeElements(ListNode head, int val) {
        ListNode curr=new ListNode(0,head);
        ListNode currHead=curr;
        if(head==null)
        {
            return head;
        }
        while(currHead.next!=null)
        {
            if(currHead.val!=val && currHead.next.val==val)
            {
                currHead.next=currHead.next.next;
            }else
            {
                currHead=currHead.next;
            }
        }

        return curr.next;
        
    }
}