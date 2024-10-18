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
    public ListNode insertionSortList(ListNode head) {
        ArrayList<Integer>list=new ArrayList<>();
        ListNode temp=head;

        while(temp!=null)
        {
            list.add(temp.val);
            temp=temp.next;
        }

        Collections.sort(list);
        ListNode dummy=new ListNode(0);
        ListNode temp2=dummy;
        for(int i=0;i<list.size();i++)
        {
           ListNode node=new ListNode(list.get(i));
           temp2.next=node;
           temp2=temp2.next;
        }

        return dummy.next;
    }
}