class Solution {
    public int shipWithinDays(int[] weights, int D) {
        // Step 1: Define binary search bounds
        int start = getMaxWeight(weights);  // Minimum capacity should be at least the max weight
        int end = getTotalWeight(weights);
          // Maximum capacity is the sum of all weights
          int ans=-1;

        // Step 2: Apply binary search on the capacity
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            // Step 3: Check if we can ship all packages within D days with this capacity
            if (canShipWithinDays(weights, mid, D)) {
                end = mid-1;
                  // Try to minimize the capacity
                  ans=mid;
            } else {
                start = mid + 1;  // Increase the capacity
            }
        }
        return ans;  // The minimum valid capacity found
    }

    // Helper function to check if a given capacity is sufficient to ship within D days
    private boolean canShipWithinDays(int[] weights, int capacity, int D) {
        int days = 1;  // Start with day 1
        int currentLoad = 0;  // Current load on the ship
        
        for (int weight : weights) {
            // If adding this package exceeds capacity, start a new day
            if (currentLoad + weight > capacity) {
                days++;  // Use an additional day
                currentLoad = 0;  // Reset current load for the new day
            }
            currentLoad += weight;  // Add the current package to the load
            
            // If we exceed the allowed days, return false
            if (days > D) {
                return false;
            }
        }
        return true;  // We managed to ship within D days
    }

    // Helper function to get the maximum weight in the array
    private int getMaxWeight(int[] weights) {
        int maxWeight = 0;
        for (int weight : weights) {
            maxWeight = Math.max(maxWeight, weight);
        }
        return maxWeight;
    }

    // Helper function to get the total sum of weights in the array
    private int getTotalWeight(int[] weights) {
        int totalWeight = 0;
        for (int weight : weights) {
            totalWeight += weight;
        }
        return totalWeight;
    }
}
