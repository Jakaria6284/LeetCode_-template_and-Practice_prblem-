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
    public ListNode removeZeroSumSublists(ListNode head) {
        Map<Integer,ListNode>map=new HashMap<>();
        ListNode dumy=new ListNode(0,head);
        ListNode temp=dumy;
        int prefixsum=0;

        while(temp!=null)
        {
            prefixsum+=temp.val;
            map.put(prefixsum,temp);
            temp=temp.next;

        }

        temp=dumy;
        prefixsum=0;

        while(temp!=null)
        {
            prefixsum+=temp.val;
            temp.next=map.get(prefixsum).next;
            temp=temp.next;
        }


     
        return dumy.next;
    }
}