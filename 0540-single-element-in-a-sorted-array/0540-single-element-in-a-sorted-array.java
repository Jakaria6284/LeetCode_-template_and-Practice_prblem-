class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // Check if mid is even or odd and adjust start or end accordingly
            if (mid % 2 == 0) {
                if (nums[mid] == nums[mid + 1]) {
                    // Move start to mid + 2 (since we already checked mid and mid + 1)
                    start = mid + 2;
                } else {
                    // Single element is on the left side or at mid
                    end = mid;
                }
            } else {
                if (nums[mid] == nums[mid - 1]) {
                    // Move start to mid + 1 since pairs are intact to the left
                    start = mid + 1;
                } else {
                    // Single element is on the left side
                    end = mid - 1;
                }
            }
        }

        // The start will eventually point to the single element
        return nums[start];
    }
}
