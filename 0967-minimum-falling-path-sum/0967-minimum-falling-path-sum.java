class Solution {

    public int minFallingPathSum(int[][] matrix) {
        int len = matrix.length;
        int ans = Integer.MAX_VALUE;
        Integer[][]dp=new Integer[len][len];
        for (int i = 0; i < len; i++) {
            int sum = helper(matrix, 0, i,dp);
            ans = Math.min(ans, sum);

        }
        return ans;

    }

    public int helper(int[][] matrix, int row, int col,Integer[][]dp) {

        if (col < 0 || col >= matrix.length) {
            return Integer.MAX_VALUE;
        }

        if (row == matrix.length - 1) {
            return matrix[row][col];
        }

        if(dp[row][col]!=null)
        {
            return dp[row][col];
        }

        int down = helper(matrix, row + 1, col,dp);
        int left = helper(matrix, row + 1, col - 1,dp);
        int right = helper(matrix, row + 1, col + 1,dp);

        dp[row][col]=matrix[row][col] + Math.min(down, Math.min(left, right));
        return dp[row][col];

    }
}