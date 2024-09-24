class Solution {
    public int minCapability(int[] nums, int k) {
        int left = 0, right = (int) 1e9;  // Set high boundary for binary search

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Check if it's possible to rob at least `k` houses with max money `mid`
            if (canRobKHouse(nums, k, mid)) {
                right = mid;  // Try to find a smaller max amount
            } else {
                left = mid + 1;  // Increase the maximum money allowed
            }
        }
        return left;  // The minimum max robbery possible
    }

    // Helper function to check if we can rob `k` houses with max money `maxMoney`
    private boolean canRobKHouse(int[] nums, int k, int maxMoney) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= maxMoney) {
                count++;
                i++;  // Skip the next house to avoid robbing consecutive houses
            }
        }
        return count >= k;  // Return true if we can rob at least `k` houses
    }
}
