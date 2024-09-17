class Solution {
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return true;
            }

            // If duplicates are present, increment start
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
            } 
            // Check if the left half is sorted
            else if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1; // target is in the left half
                } else {
                    start = mid + 1; // target is in the right half
                }
            } 
            // Right half is sorted
            else {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1; // target is in the right half
                } else {
                    end = mid - 1; // target is in the left half
                }
            }
        }

        return false;
    }
}
