class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        // The number of subarrays with exactly k distinct elements
        return atMostKDistinct(nums, k) - atMostKDistinct(nums, k - 1);
    }

    // Helper function to calculate subarrays with at most k distinct elements
    private int atMostKDistinct(int[] nums, int k) {
        int n = nums.length;
        int r = 0, l = 0, count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        while (r < n) {
            // Add the element at the right pointer to the map
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);

            // If the size of the map exceeds 'k', shrink the window from the left
            while (map.size() > k) {
                map.put(nums[l], map.get(nums[l]) - 1);
                if (map.get(nums[l]) == 0) {
                    map.remove(nums[l]);
                }
                l++;
            }

            // Count the number of valid subarrays
            count += (r - l + 1);
            r++;
        }

        return count;
    }
}
