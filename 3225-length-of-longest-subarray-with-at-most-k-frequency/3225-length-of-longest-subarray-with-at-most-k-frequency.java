class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int l = 0, r = 0;
        int maxLength = 0;

        while (r < nums.length) {
            // Add current element to the map and increment its count
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);

            // Shrink the window if any element appears more than k times
            while (map.get(nums[r]) > k) {
                map.put(nums[l], map.get(nums[l]) - 1);
                if (map.get(nums[l]) == 0) {
                    map.remove(nums[l]); // remove the element when count becomes 0
                }
                l++;
            }

            // Calculate the current window length and update the maximum length
            maxLength = Math.max(maxLength, r - l + 1);

            r++;
        }

        return maxLength;
    }
}
