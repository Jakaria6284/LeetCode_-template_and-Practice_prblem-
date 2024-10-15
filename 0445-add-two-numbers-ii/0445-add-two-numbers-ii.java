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
    public ListNode reverse(ListNode head)
    {
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null)
        {
            ListNode nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode temp1=reverse(l1);
        ListNode temp2=reverse(l2);
        ListNode dumy=new ListNode(0);
        ListNode temp=dumy;

        int carry=0;

        while(temp1!=null || temp2!=null || carry>0)
        {
            int sum=0;

            if(temp1!=null)
            {
                sum=sum+temp1.val;
                temp1=temp1.next;
            }

             if(temp2!=null)
            {
                sum=sum+temp2.val;
                temp2=temp2.next;
            }

            sum+=carry;
            carry=sum/10;
            ListNode node=new ListNode(sum%10);
            temp.next=node;
            temp=temp.next;
        }

        ListNode ans=reverse(dumy.next);

        return ans;

        
    }
}