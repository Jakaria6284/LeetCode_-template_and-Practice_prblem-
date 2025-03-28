import java.util.*;

class Solution {
    public int coinChange(int[] coins, int amount) {
        Integer dp[][]=new Integer[coins.length][amount+1];
        int n=coins.length-1;

        int res=recur(coins,n,amount,dp);
        if(res==Integer.MAX_VALUE-1)
        {
            return -1;
        }
        return res;
       
    }

    private int recur(int[] coins, int index, int amount, Integer[][] dp) {

        if(amount==0)
        {
            return 0;
        }

        if(index<0 || amount<0)
        {
            return Integer.MAX_VALUE-1;
        }
        if(dp[index][amount]!=null)
        {
            return dp[index][amount];
        }
        int pick=Integer.MAX_VALUE-1;

        if(amount>=coins[index])
        {
            pick=1+recur(coins,index,amount-coins[index],dp);
        }

        
        int notpick=recur(coins,index-1,amount,dp);
        int res=Math.min(pick,notpick);
        dp[index][amount]=res;
        return res;
        
    }
}
