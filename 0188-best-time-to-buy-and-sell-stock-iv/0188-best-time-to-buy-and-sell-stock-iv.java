class Solution {
     private Integer[][][] memo; 
    public int maxProfit(int k, int[] prices) {
         int n = prices.length;
        memo = new Integer[n][2][k+1]; 
        return dp(prices, 0, 1, k);
        
    }

     private int dp(int[] prices, int index, int canBuy, int transactionsLeft) {
        if (index >= prices.length || transactionsLeft == 0) return 0; // Base case
        if (memo[index][canBuy][transactionsLeft] != null) return memo[index][canBuy][transactionsLeft];
        
     
        int result;
        
        if (canBuy == 1) {
            int buy = -prices[index] + dp(prices, index + 1, 0, transactionsLeft);
            int idle = dp(prices, index + 1, 1, transactionsLeft);
            result = Math.max(idle, buy);
        } else {
            int sell = prices[index] + dp(prices, index + 1, 1, transactionsLeft - 1);
            int idle = dp(prices, index + 1, 0, transactionsLeft);
            result = Math.max(idle, sell);
        }
        
        memo[index][canBuy][transactionsLeft] = result;
        return result;
    }
}