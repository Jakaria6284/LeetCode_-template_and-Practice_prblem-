class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0;  // k cannot be negative

        Arrays.sort(nums);  // Sort the array to handle duplicates
        int i = 0, j = 1, count = 0, n = nums.length;

        while (j < n) {
            if (i == j) {
                j++;  // Move j ahead if both pointers are equal
            }
            else if (nums[j] - nums[i] == k) {
                count++;  // Found a unique k-diff pair
                i++;
                j++;
                
                // Skip duplicates to ensure unique pairs
                while (j < n && nums[j] == nums[j - 1]) {
                    j++;
                }
            }
            else if (nums[j] - nums[i] < k) {
                j++;  // Increase j if difference is too small
            }
            else {
                i++;  // Increase i if difference is too large
            }
        }
        return count;
    }
}
