class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // Count frequencies of each number
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Add frequencies to the priority queue
        for (int frequency : map.values()) {
            pq.offer(frequency);
        }

        // Remove elements until we reduce the array size to half or less
        int removed = 0;
        int setSize = 0;
        int halfSize = arr.length / 2;

        while (removed < halfSize) {
            removed += pq.poll();
            setSize++;
        }

        return setSize;
    }
}
