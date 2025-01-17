class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
         PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> 
            Double.compare((double) a[0] / a[1], (double) b[0] / b[1])
        );

        // Populate the priority queue with fractions
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                pq.offer(new int[] {arr[i], arr[j]});
            }
        }

        // Extract the k-th smallest fraction
        int[] result = new int[2];
        for (int i = 0; i < k; i++) {
            result = pq.poll();
        }

        return result;
    
    }
}