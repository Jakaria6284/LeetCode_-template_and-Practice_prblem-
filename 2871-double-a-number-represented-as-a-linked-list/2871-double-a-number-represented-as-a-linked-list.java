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
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null)
        {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }

    public ListNode doubleIt(ListNode head) {

        int carry = 0;

        // Reverse the input list
        ListNode newHead = reverse(head);
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while (newHead != null)
        {
            // Multiply current node by 2 and add carry
            int value = newHead.val * 2 + carry;
            
            // Compute new carry
            carry = value / 10;
            
            // Add the current digit
            ListNode node = new ListNode(value % 10);
            temp.next = node;
            temp = temp.next;

            // Move to the next node
            newHead = newHead.next;
        }

        // If there's a carry left after the loop, add it as a new node
        if (carry > 0) {
            temp.next = new ListNode(carry);
        }

        // Reverse the result list and return
        return reverse(dummy.next);
    }
}
