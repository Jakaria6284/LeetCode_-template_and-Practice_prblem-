/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {

        ListNode node1 = head1;
        ListNode node2 = head2;
        int size1 = 0;
        int size2 = 0;

        // Count the length of the first list
        while (node1 != null) {
            size1++;
            node1 = node1.next;
        }

        // Count the length of the second list
        while (node2 != null) {
            size2++;
            node2 = node2.next;
        }

        // Reset the pointers to the heads
        node1 = head1;
        node2 = head2;

        // Move the pointer of the longer list ahead by the difference in lengths
        if (size1 > size2) {
            for (int i = 0; i < size1 - size2; i++) {
                node1 = node1.next;
            }
        } else {
            for (int i = 0; i < size2 - size1; i++) {
                node2 = node2.next;
            }
        }

        // Traverse both lists together and find the intersection point
        while (node1 != null && node2 != null) {
            if (node1 == node2) {
                return node1;
            }
            node1 = node1.next;
            node2 = node2.next;
        }

        return null;  // No intersection
    }
}