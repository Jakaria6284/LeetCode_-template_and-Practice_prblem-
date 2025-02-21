class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k > n
        if (k == 0) return; // No rotation needed if k is 0

        int[] arr = new int[n];
        int j = 0;

        // Copy last k elements to the beginning
        for (int i = n - k; i < n; i++) {
            arr[j++] = nums[i];
        }

        // Copy first n-k elements after the shifted elements
        for (int i = 0; i < n - k; i++) {
            arr[j++] = nums[i];
        }

        // Copy back to nums
        System.arraycopy(arr, 0, nums, 0, n);
    }
}
