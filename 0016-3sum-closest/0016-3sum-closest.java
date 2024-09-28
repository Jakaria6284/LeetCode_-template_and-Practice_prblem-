import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // Sort the array
        int closestSum = nums[0] + nums[1] + nums[2]; // Initialize with the sum of the first three numbers
        
        // Loop through the array for the first number
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1; // Start pointer
            int right = nums.length - 1; // End pointer
            
            // While left pointer is less than right pointer
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                
                // Update closestSum if currentSum is closer to the target
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }
                
                // Move pointers based on the comparison of currentSum and target
                if (currentSum < target) {
                    left++; // Increase the sum
                } else if (currentSum > target) {
                    right--; // Decrease the sum
                } else {
                    return currentSum; // Exact match found
                }
            }
        }
        
        return closestSum; // Return the closest sum found
    }
}
