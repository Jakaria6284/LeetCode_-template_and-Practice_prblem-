class Solution {
    public int rob(int[] nums) {
        int index=nums.length;

        int dp[]=new int[nums.length+1];
        Arrays.fill(dp,-1);
       return recur(nums,index,dp);

        
    }

    public int recur(int []nums,int index,int dp[])
    {
        if(index==1)
        {
            dp[index]=nums[0];
            return nums[0];
        }
        if(index==0)
        {
            dp[index]=0;
            return 0;
        }

        if(dp[index]!=-1)
        {
            return dp[index];
        }

        int pick=nums[index-1]+recur(nums,index-2,dp);
        int notPick=0+recur(nums,index-1,dp);

        dp[index]= Math.max(pick,notPick);
        return dp[index];

    }
}