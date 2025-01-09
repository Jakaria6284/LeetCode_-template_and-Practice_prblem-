import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public long pickGifts(int[] gifts, int k) {
        // Use PriorityQueue<Long> with reverse order (max-heap)
        PriorityQueue<Long> pd = new PriorityQueue<>(Collections.reverseOrder());
        
        // Add all elements from gifts to the PriorityQueue, converted to Long
        for (int gift : gifts) {
            pd.offer((long) gift);
        }

        // Perform k operations
        for (int i = 0; i < k; i++) {
            long maxval = pd.poll(); // Retrieve and remove the maximum value
            long newVal = (long) Math.sqrt(maxval); // Calculate square root and cast to long
            pd.offer(newVal); // Add the new value back to the queue
        }

        // Sum up all remaining elements in the PriorityQueue
        long ans = 0;
        while (!pd.isEmpty()) {
            ans += pd.poll();
        }

        return ans;
    }
}
