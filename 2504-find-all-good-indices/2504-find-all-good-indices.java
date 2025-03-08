import java.util.*;

class Solution {
    public List<Integer> goodIndices(int[] nums, int k) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        
        // Arrays to store the length of non-increasing and non-decreasing sequences
        int[] nonInc = new int[n]; // non-increasing count ending at i
        int[] nonDec = new int[n]; // non-decreasing count starting at i
        
        // Compute non-increasing prefix count
        Arrays.fill(nonInc, 1);
        for (int i = 1; i < n; i++) {
            if (nums[i] <= nums[i - 1]) {
                nonInc[i] = nonInc[i - 1] + 1;
            }
        }
        
        // Compute non-decreasing suffix count
        Arrays.fill(nonDec, 1);
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] <= nums[i + 1]) {
                nonDec[i] = nonDec[i + 1] + 1;
            }
        }
        
        // Find valid indices
        for (int i = k; i < n - k; i++) {
            if (nonInc[i - 1] >= k && nonDec[i + 1] >= k) {
                result.add(i);
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example 1
        int[] nums1 = {2, 1, 1, 1, 3, 4, 1};
        int k1 = 2;
        System.out.println(solution.goodIndices(nums1, k1)); // Output: [2, 3]

        // Example 2
        int[] nums2 = {2, 1, 1, 2};
        int k2 = 2;
        System.out.println(solution.goodIndices(nums2, k2)); // Output: []
    }
}