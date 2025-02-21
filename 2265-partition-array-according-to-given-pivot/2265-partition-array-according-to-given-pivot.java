import java.util.*;

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] arr = new int[nums.length];
        int index = 0;

        // First pass: Add elements smaller than pivot
        for (int num : nums) {
            if (num < pivot) {
                arr[index++] = num;
            }
        }

        // Second pass: Add elements equal to pivot
        for (int num : nums) {
            if (num == pivot) {
                arr[index++] = num;
            }
        }

        // Third pass: Add elements greater than pivot
        for (int num : nums) {
            if (num > pivot) {
                arr[index++] = num;
            }
        }

        return arr;
    }
}
