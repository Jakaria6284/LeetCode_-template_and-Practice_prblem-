class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        if (k == 0)
            return;
        int lasthalf = n - k;

        int[] ans = new int[nums.length];
        int idx = 0;

        for (int i = lasthalf; i < n; i++) {
            ans[idx++] = nums[i];
        }

        for (int i = 0; i < lasthalf; i++) {
            ans[idx++] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = ans[i];
        }

    }
}
