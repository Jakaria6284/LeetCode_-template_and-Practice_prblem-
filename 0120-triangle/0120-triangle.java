class Solution {
    private Integer[][] memo;

    public int minimumTotal(List<List<Integer>> triangle) {

        int n = triangle.size(); // total number of levels in the triangle
        memo = new Integer[n][n]; // initialize memo table
        return dfs(0, 0, triangle);

    }

    private int dfs(int level, int i, List<List<Integer>> triangle) {
        // If the result is already computed, return it from memo
        if (memo[level][i] != null) {
            return memo[level][i];
        }

        // Get the current value at triangle[level][i]
        int currentVal = triangle.get(level).get(i);

        // Base case: If we are at the last level, just return the current value
        if (level == triangle.size() - 1) {
            return memo[level][i] = currentVal;
        }

        // Recursive step: choose the minimum path between the two adjacent numbers below
        int leftPath = dfs(level + 1, i, triangle); // go down to the same index
        int rightPath = dfs(level + 1, i + 1, triangle); // go down to the next index

        // Store the computed result in memo and return it
        memo[level][i] = currentVal + Math.min(leftPath, rightPath);
        return memo[level][i];
    }
}