import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);  // Sort the array to use the two-pointer technique
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 3; i++) {  // Loop for the first number
            if (i > 0 && nums[i] == nums[i - 1]) {  // Skip duplicate for the first number
                continue;
            }

            for (int j = i + 1; j < nums.length - 2; j++) {  // Loop for the second number
                if (j > i + 1 && nums[j] == nums[j - 1]) {  // Skip duplicate for the second number
                    continue;
                }

                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) {
                    long sum =(long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        // Skip duplicates for the left pointer
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }

                        // Skip duplicates for the right pointer
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }

                        // Move both pointers after adding the quadruplet
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;  // Move the left pointer to a larger value
                    } else {
                        right--;  // Move the right pointer to a smaller value
                    }
                }
            }
        }

        return result;
    }

   
}
