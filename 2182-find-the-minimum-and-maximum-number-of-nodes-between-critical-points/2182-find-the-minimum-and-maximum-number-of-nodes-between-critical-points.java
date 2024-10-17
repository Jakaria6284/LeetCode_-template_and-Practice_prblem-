class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        // Result array initialized to [-1, -1]
        int[] result = new int[2];
        Arrays.fill(result, -1);

        // Edge case: fewer than 3 nodes, no critical points possible
        if (head == null || head.next == null || head.next.next == null) {
            return result;
        }

        ListNode prev = head;
        ListNode curr = head.next;
        ListNode nextNode = curr.next;
        int j = 1;  // To keep track of positions
        int firstCritical = -1; // To store the position of the first critical point
        int lastCritical = -1;  // To store the position of the last critical point
        int minDistance = Integer.MAX_VALUE; // Track minimum distance

        while (nextNode != null) {
            // Check for critical points (local maxima or minima)
            if ((curr.val > prev.val && curr.val > nextNode.val) || 
                (curr.val < prev.val && curr.val < nextNode.val)) {

                // If it's the first critical point
                if (firstCritical == -1) {
                    firstCritical = j; // Store the position of the first critical point
                } else {
                    // Calculate the distance between current and last critical points
                    int distance = j - lastCritical;
                    minDistance = Math.min(minDistance, distance); // Update minimum distance
                   
                }
                 lastCritical = j;

                // Update lastCritical to the current position
                
            }

            // Move the pointers forward
            prev = curr;
            curr = nextNode;
            nextNode = nextNode.next;
            j++;
        }

        // If two or more critical points found, update result[0] with minDistance
        // and result[1] with lastCritical - firstCritical (maximum distance)
        if (firstCritical != -1 && lastCritical != -1 && lastCritical != firstCritical) {
            result[0] = minDistance; // Minimum distance between critical points
            result[1] = lastCritical - firstCritical; // Maximum distance between critical points
        }

        return result;
    }
}
