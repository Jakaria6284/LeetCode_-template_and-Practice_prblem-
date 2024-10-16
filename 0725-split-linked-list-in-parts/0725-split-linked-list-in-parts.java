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
    public int sizeofLinkedList(ListNode head)
    {
        int count=0;
        while(head!=null)
        {
            head=head.next;
            count++;
        }
        return count;
    }
    public ListNode[] splitListToParts(ListNode head, int k) {
        int lengthOfLinkedList= sizeofLinkedList(head);
        int sizeOfEachBlock= lengthOfLinkedList/k;
        int rem=lengthOfLinkedList%k;

        ListNode[]result=new ListNode[k];

        for(int i=0;i<k;i++)
        {
            
            ListNode temp=head;
            ListNode currHead=temp;
            ListNode prev=null;
            int len=0;

            while(temp!=null && len<sizeOfEachBlock)
            {
                prev=temp;
                temp=temp.next;
                
                len++;
            }
            if(rem>0 && temp!=null)
            {
                prev=temp;
                temp=temp.next;
                
                rem--;
            }
            if(prev!=null)
            {
               prev.next=null;
            }

            
            result[i]=currHead;
            head = temp;
        }


        return result;
    }
}