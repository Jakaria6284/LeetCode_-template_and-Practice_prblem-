public class Solution {
    public int findDuplicate(int[] nums) {
        int low = 1, high = nums.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;
            int count = 0;

            // Using a traditional for loop instead of for-each
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= mid) count++;
            }

            if (count > mid) high = mid;
            else low = mid + 1;
        }

        return low;
    }
}
