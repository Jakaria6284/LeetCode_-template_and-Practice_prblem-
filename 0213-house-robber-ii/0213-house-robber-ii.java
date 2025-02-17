class Solution {
    public int rob(int[] nums) {
         if(nums.length==1)
        {
            return nums[0];
        }

        int nums1[] = new int[nums.length - 1];
        int nums2[] = new int[nums.length - 1];
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                nums1[i - 1] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length-1) {
                nums2[i] = nums[i];
            }
        }
        return Math.max(rob1(nums1),rob1(nums2));

    }

    public int rob1(int[] nums) {
       
        int dp[] = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];

        for (int i = 2; i < dp.length; i++) {
            int pick = nums[i - 1] + dp[i - 2];
            int notpick = 0 + dp[i - 1];
            dp[i] = Math.max(pick, notpick);
        }

        return dp[nums.length];

    }

}