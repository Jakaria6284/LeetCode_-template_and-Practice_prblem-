class Solution {
    Integer memo[][];
    public int maxProfit(int[] prices) {
        int n=prices.length;
        memo=new Integer[n][2];
        return dp(prices, 1, 0);
    }

    private int dp(int[] prices, int canBuy, int index) {
        if (index >= prices.length) return 0; 

        if(memo[index][canBuy]!=null)
        {
            return memo[index][canBuy];
        }

        if (canBuy == 1) { 
            int buy = -prices[index] + dp(prices, 0, index + 1);
            int skip = dp(prices, 1, index + 1);
            return memo[index][canBuy]=Math.max(buy, skip);
        } else  { 
            int sell = prices[index] + dp(prices, 1, index + 2);
            int skip = dp(prices, 0, index + 1);
            return memo[index][canBuy]= Math.max(sell, skip);
        } 
    }
}

