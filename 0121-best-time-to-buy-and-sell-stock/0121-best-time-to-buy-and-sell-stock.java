class Solution {
    public int maxProfit(int[] prices) {

        int minimum_price_to_buy_stock=prices[0];
        int profit=0;


        for(int i=1;i<prices.length;i++)
        {
            minimum_price_to_buy_stock=Math.min(minimum_price_to_buy_stock,prices[i]);
            profit=Math.max(profit,prices[i]-minimum_price_to_buy_stock);
        }

        return profit;
        
    }
}