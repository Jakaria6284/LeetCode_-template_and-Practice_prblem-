import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    private List<List<Integer>> results;

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        results = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(new ArrayList<>(), nums, target, 0);
        return results;
    }

    private void backtrack(List<Integer> tempList, int[] nums, int remain, int start) {
        if (remain < 0) return; // Terminate invalid paths
        if (remain == 0) {
            results.add(new ArrayList<>(tempList)); // Add a valid combination
            return;
        }
        if (start >= nums.length) return; // Out of bounds

        // Include the current element
        tempList.add(nums[start]);
        backtrack(tempList, nums, remain - nums[start], start); // Reuse the same element
        tempList.remove(tempList.size() - 1); // Backtrack

        // Move to the next element
        backtrack(tempList, nums, remain, start + 1);
    }

    
}
