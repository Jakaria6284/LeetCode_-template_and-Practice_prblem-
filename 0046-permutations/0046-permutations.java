import java.util.*;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // Call the helper function to generate permutations
        backtrack(nums, result, new ArrayList<>());
        return result;
    }

    // Helper function that uses backtracking
    private void backtrack(int[] nums, List<List<Integer>> result, List<Integer> current) {
        // If the current list has the same size as nums, we have a complete permutation
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current)); // Add a copy of the current list to the result
            return;
        }
        
        // Try every number at each position
        for (int i = 0; i < nums.length; i++) {
            // Skip if the number is already in the current permutation
            if (current.contains(nums[i])) {
                continue;
            }
            // Add the number to the current permutation
            current.add(nums[i]);
            // Recursively generate the next part of the permutation
            backtrack(nums, result, current);
            // Backtrack: remove the last number and try the next one
            current.remove(current.size() - 1);
        }
    }

}
