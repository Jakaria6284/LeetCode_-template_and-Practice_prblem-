class Solution {
    public int maximumCandies(int[] nums, long k) {
        Arrays.sort(nums);

        // Binary search range
        int start = 1;  // Minimum candies per child can be 1
        int end = nums[nums.length - 1];  // Maximum candies per child can be the maximum value in nums
        int ans = 0;  // Initialize result

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (canPossible(nums, mid, k)) {
                ans = mid;  // Update answer if possible
                start = mid + 1;  // Try for a higher number of candies
            } else {
                end = mid - 1;  // Try a lower number of candies
            }
        }

        return ans;
    }

    // Function to check if it's possible to distribute candies such that each child gets `mid` candies
    boolean canPossible(int[] nums, int mid, long k) {
        long sum = 0;  // Total number of children who can receive `mid` candies

        for (int num : nums) {
            sum += num / mid;  // Calculate how many children can receive `mid` candies from `num` candies
            if (sum >= k) {  // If we already have enough children, no need to continue
                return true;
            }
        }
        
        return sum >= k;  // Check if we have at least `k` children
    }
}
