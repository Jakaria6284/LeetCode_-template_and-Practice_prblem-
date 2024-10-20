class Solution {
    public int numComponents(ListNode head, int[] nums) {
        // Store nums in a map for quick lookup
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, 1);
        }

        ListNode slow = head;
        ListNode fast = head.next;
        int count = 0;

        // Traverse the list
        while (fast != null) {
            // Check if both slow and fast nodes are part of nums
            if (map.containsKey(slow.val) && !map.containsKey(fast.val)) {
                // If slow is in nums and fast is not, end of a component
                count++;
            }
            slow = slow.next;
            fast = fast.next;
        }

        // Handle the case where the last node is part of nums
        if (map.containsKey(slow.val)) {
            count++;
        }

        return count;
    }
}
