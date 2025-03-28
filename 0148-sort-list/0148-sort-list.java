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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer>list=new ArrayList<>();

        ListNode temp=head;
        while(temp!=null)
        {
            list.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(list);
        ListNode dummy=new ListNode(0);
        ListNode temp1=dummy;

        for(int i=0;i<list.size();i++)
        {
            ListNode node=new ListNode(list.get(i));
            temp1.next=node;
            temp1=temp1.next;
        }

        return dummy.next;
        
    }
}