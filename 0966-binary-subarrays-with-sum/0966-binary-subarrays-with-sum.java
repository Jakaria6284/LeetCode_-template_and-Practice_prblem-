import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        map.put(0, 1); // Initialize with 0 sum having 1 occurrence
        int sum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            
            // Check if there's a subarray whose sum equals goal
            if (map.containsKey(sum - goal)) {
                count += map.get(sum - goal);
            }
            
            // Store the frequency of the current sum
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }
    

}
