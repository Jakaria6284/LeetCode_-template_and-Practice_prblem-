class Solution {
    List<List<Integer>> result = new ArrayList<>();
    Set<List<Integer>> set = new HashSet<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
         Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        findsubSetWithoutDuplicate(nums, 0, list);
        return result;
    }

    public void findsubSetWithoutDuplicate(int[] nums, int index, List<Integer> list) {

        if (index == nums.length) {
            if(!set.contains(list))
            {
               result.add(new ArrayList<>(list));
               set.add(new ArrayList<>(list));
            }
           
            return;
        }
        list.add(nums[index]);
        findsubSetWithoutDuplicate(nums, index + 1, list);
        list.remove(list.size() - 1);
        findsubSetWithoutDuplicate(nums, index + 1, list);

    }
}