class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int event = 0;
        int odd = 1;

        while (event < nums.length && odd < nums.length) {
            if (nums[event] % 2 == 0) {
                event += 2;
            } else if (nums[odd] % 2 == 1) {
                odd += 2;
            } else {
                swap(nums, event, odd);
                event += 2;
                odd += 2;
            }
        }

        return nums;
    }

    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
