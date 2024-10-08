//Algo Used: Hashing
// TC: O N , SC: O N
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Initialize a HashMap to store the last index of each element.
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Iterate over each element in the array.
        for (int i = 0; i < nums.length; i++) {
            // If the current element is found in the map and satisfies the condition.
            if (map.containsKey(nums[i]) && (i - map.get(nums[i]) <= k)) {
                return true; // Found the pair.
            }
            // Update the current element's index in the map.
            map.put(nums[i], i);
        }
        
        // No such pair found, return false.
        return false;
    }
}

    