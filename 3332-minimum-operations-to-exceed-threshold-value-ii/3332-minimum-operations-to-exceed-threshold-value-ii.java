class Solution {
    public int minOperations(int[] nums, int k) {

         PriorityQueue<Long> pq = new PriorityQueue<>();
        int minOperations = 0;
        for (int i = 0; i < nums.length; i++) {

            pq.add((long)nums[i]);
        }

        while (pq.size() >= 2 && pq.peek() < k) {

            long x = pq.poll();

            long y = pq.poll();

            long z = (long) (2 * Math.min(x, y) + Math.max(x, y));
            
            pq.add(z);

            minOperations++;

        }
        return minOperations;
    }
}