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
    public int len(ListNode head)
    {
        int count=0;
        while(head!=null)
        {
            count++;
            head=head.next;
        }
        return count;
    }
    public ListNode swapPairs(ListNode head) {

        if(head==null || head.next==null)
        {
            return head;
        }

        int size=len(head);
        int group=size/2;

        ListNode prevHead=null;
        ListNode currHead=head;
        ListNode ansNode=null;

        for(int i=0;i<group;i++)
        {
            ListNode prev=null;
            ListNode curr=currHead;
            for(int j=0;j<2;j++)
            {
                ListNode nextNode=curr.next;
                curr.next=prev;
                prev=curr;
                curr=nextNode;
            }

            if(prevHead==null)
            {
                ansNode=prev;
            }else
            {
                prevHead.next=prev;
            }

            prevHead=currHead;
            currHead=curr;
        }

        prevHead.next=currHead;

        return ansNode;
       
    }
}