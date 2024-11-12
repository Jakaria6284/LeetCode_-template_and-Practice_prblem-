class Solution {
    List<List<Integer>> result = new ArrayList<>();
    Set<List<Integer>> set = new HashSet<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        findsequesnce(nums, 0, new ArrayList<>());
        return result;
    }

    public void findsequesnce(int[] nums, int index, List<Integer> list) {
        // Base condition
        if (index == nums.length) {
            if (list.size() > 1 && !set.contains(list)) {
                result.add(new ArrayList<>(list));
                set.add(new ArrayList<>(list)); // Add to set to avoid duplicates
            }
            return;
        }

        // Include current number if it satisfies non-decreasing condition
        if (list.isEmpty() || list.get(list.size() - 1) <= nums[index]) {
            list.add(nums[index]);
            findsequesnce(nums, index + 1, list);
            list.remove(list.size() - 1); // Backtrack
        }

        // Explore the path without including the current number
        findsequesnce(nums, index + 1, list);
    }
}
