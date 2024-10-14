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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer>list=new ArrayList<>();
        

        for(ListNode head:lists)
        {
            while(head!=null)
            {
              list.add(head.val);
              head=head.next;
            }
        }

        Collections.sort(list);
        ListNode dumy=new ListNode(0);
        ListNode temp=dumy;

        for(int value:list)
        {
            ListNode finallist=new ListNode(value);
            temp.next=finallist;
            temp=temp.next;
            

        }

        return dumy.next;
    }
}