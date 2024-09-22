class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        // Edge case: if it's impossible to form m bouquets
        if (bloomDay.length < m * k) {
            return -1;
        }
        
        int start = 1;
        int end = (int) 1e9;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isPossible(bloomDay, mid, k, m)) {
                ans = mid;  // We found a valid solution, try minimizing
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    boolean isPossible(int[] bloomDay, int mid, int k, int m) {
        int totalCount = 0;
        int count = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= mid) {
                count++;  // Flower bloomed, increase the count
                if (count == k) {
                    totalCount++;  // Formed a bouquet
                    count = 0;     // Reset the count for the next bouquet
                }
            } else {
                count = 0;  // If the flower didn't bloom, reset the count
            }

            if (totalCount == m) {
                return true;  // We can form `m` bouquets
            }
        }

        return false;  // We couldn't form enough bouquets
    }
}
