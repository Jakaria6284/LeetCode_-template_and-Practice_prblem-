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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode ptr1=list1;
        ListNode ptr2=list1;

        for(int i=1;i<a;i++)
        {
            ptr1=ptr1.next;
        }

        for(int i=0;i<b+1;i++)
        {
            ptr2=ptr2.next;
        }

        ptr1.next=list2;

        ListNode temp=list2;

        while(temp.next!=null)
        {
            temp=temp.next;
        }

        temp.next=ptr2;
        return list1;
        
    }
}