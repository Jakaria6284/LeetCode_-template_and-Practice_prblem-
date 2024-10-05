class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;

        // Move fast n steps ahead
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        // If fast is null, it means we need to remove the head (n == list length)
        if (fast == null) {
            return head.next; // Remove the head by returning head.next
        }

        // Move both fast and slow pointers until fast reaches the end
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Now slow is at the node before the one to remove
        slow.next = slow.next.next;

        // Return the original head (not slow)
        return head;
    }
}
