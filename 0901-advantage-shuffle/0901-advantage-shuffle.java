import java.util.Arrays;
import java.util.PriorityQueue;

class Pair {
    int val;
    int idx;
    
    Pair(int val, int idx) {
        this.val = val;
        this.idx = idx;
    }
    
    int getVal() {
        return val;
    }
    
    int getKey() {
        return idx;
    }
}

class Solution {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        // Sort nums1 to prepare for the greedy assignment from smallest to largest
        Arrays.sort(nums1);
        
        // Initialize an array for the result
        int[] arr = new int[nums1.length];
        
        // Max-heap to store pairs of value and index from nums2
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> b.getVal() - a.getVal()); // Max-heap based on value
        
        // Insert all pairs (value, index) from nums2 into the priority queue
        for (int i = 0; i < nums2.length; i++) {
            pq.offer(new Pair(nums2[i], i));
        }
        
        // Pointer to iterate through sorted nums1
        int j = nums1.length-1;
        int i=0;
        
        // Process each element of the max-heap
        while (!pq.isEmpty()) {
            Pair pair = pq.poll();
            
            // If we can beat the current value of nums2 with nums1[j]
            if (nums1[j] > pair.getVal()) {
                arr[pair.getKey()] = nums1[j--];
            } else {
                // If we can't beat it, assign the smallest remaining value from nums1
                arr[pair.getKey()] = nums1[i++];
            }
        }
        
        return arr;
    }
}
