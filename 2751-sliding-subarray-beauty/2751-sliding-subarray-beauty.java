class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        // Use TreeMap to maintain order automatically
        TreeMap<Integer, Integer> map = new TreeMap<>();
        List<Integer> result = new ArrayList<>();

        // Initialize the first window
        for (int i = 0; i < k; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1); // Count frequency
        }

        // Get the x-th smallest element for the first window
        int count = 0;
        for (int key : map.keySet()) {
            count += map.get(key);
            if (count >= x) { // Found the x-th smallest
                result.add(key <= 0 ? key : 0); // Add only if <= 0
                break;
            }
        }

        // Slide the window
        for (int i = k; i < nums.length; i++) {
            // Remove one occurrence of nums[i - k]
            if (map.get(nums[i - k]) == 1) {
                map.remove(nums[i - k]);
            } else {
                map.put(nums[i - k], map.get(nums[i - k]) - 1);
            }

            // Add nums[i] to the map
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            // Find the x-th smallest element in the updated window
            count = 0;
            for (int key : map.keySet()) {
                count += map.get(key);
                if (count >= x) { // Found the x-th smallest
                    result.add(key <= 0 ? key : 0); // Add only if <= 0
                    break;
                }
            }
        }

        // Convert result to array
        int[] arr = new int[result.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = result.get(i);
        }

        return arr;
    }
}
