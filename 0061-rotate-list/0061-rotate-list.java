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
    public ListNode rotateRight(ListNode head, int k) {

        if(head==null || head.next==null)return head;
        
        

        

        ListNode tail=head;
        int size=1;

        while(tail.next!=null)
        {
            tail=tail.next;
            size++;

        }
        if(k%size==0)
        {
            return head;
        }else
        {
            k=k%size;
        }
        tail.next=head;

        ListNode tempHead=head;

        for(int i=1;i<size-k;i++)
        {
            tempHead=tempHead.next;
        }
        ListNode newHead=tempHead.next;
        tempHead.next=null;

        return newHead;


    }
}