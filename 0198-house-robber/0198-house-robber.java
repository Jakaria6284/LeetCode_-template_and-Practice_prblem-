class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length+1];
        dp[0]=0;
        dp[1]=nums[0];

        for(int i=2;i<dp.length;i++)
        {
            int pick=nums[i-1]+dp[i-2];
            int notpick=0+dp[i-1];
            dp[i]=Math.max(pick,notpick);
        }

        return dp[nums.length];


        
    }

   
}