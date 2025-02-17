import java.util.*;

class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        Integer[][] dp = new Integer[coins.length][amount + 1];
        int result = recur(coins, coins.length - 1, amount, dp);
        return result == Integer.MAX_VALUE - 1 ? -1 : result;
    }

    private int recur(int[] coins, int index, int amount, Integer[][] dp) {
        if (amount == 0) {
            return 0;
        }
        if (index < 0 || amount < 0) {
            return Integer.MAX_VALUE - 1;
        }

        if (dp[index][amount] != null) {
            return dp[index][amount];
        }

        int take = Integer.MAX_VALUE - 1;
        if (amount >= coins[index]) {
            take = 1 + recur(coins, index, amount - coins[index], dp);
        }
        int skip = recur(coins, index - 1, amount, dp);

        return dp[index][amount] = Math.min(take, skip);
    }
}
