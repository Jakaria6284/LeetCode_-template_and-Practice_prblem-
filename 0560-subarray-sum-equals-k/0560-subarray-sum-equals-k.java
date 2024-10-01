class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Initialize the map with a sum of 0 occurring once
        map.put(0, 1);

        for (int num : nums) {
            sum += num; // Update the cumulative sum
            
            // Check if there is a subarray (from previous indices) that sums to k
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            
            // Update the map with the current sum
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
