import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int lastStoneWeight(int[] nums) {
        // Create a max-heap
        PriorityQueue<Integer> pd = new PriorityQueue<>(Collections.reverseOrder());

        // Add all stones to the priority queue
        for (int num : nums) {
            pd.offer(num);
        }

        // Smash stones until at most one remains
        while (pd.size() > 1) {
            int y = pd.poll(); // Largest stone
            int x = pd.poll(); // Second largest stone
            if (y != x) {
                pd.offer(y - x); // Add the difference back to the queue if they are not equal
            }
        }

        // If there is a stone left, return its weight; otherwise, return 0
        return pd.isEmpty() ? 0 : pd.poll();
    }
}
