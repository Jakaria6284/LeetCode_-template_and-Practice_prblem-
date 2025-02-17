class Solution {
    public int numSquares(int n) {

       int dp[]=new int[n+1];
         return helper(n,dp);
    }

    public int helper(int n,int dp[])
    {
        int min=n;
        if(n==0)
        {
            return 0;
        }

        if(dp[n]>0)
        {
            return dp[n];
        }

        for(int i=1;i*i<=n;i++)
        {
            int result=1+helper(n-i*i,dp);
            min=Math.min(min,result);


        }
        dp[n]=min;
        return min;
    }
}