class Solution {
    public int maximumPopulation(int[][] logs) {

        int prefixSum[] = new int[2051];

        for (int i = 0; i < logs.length; i++) {
            int birth = logs[i][0];
            int dead = logs[i][1];
            prefixSum[birth] += 1;
            prefixSum[dead] -= 1;

        }

        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + prefixSum[i];
        }
        int max = 0;
        int maxYear = 1950; // We need the **earliest** max year, so start at 1950

        for (int year = 1950; year < 2051; year++) {
            if (prefixSum[year] > max) {
                max = prefixSum[year];
                maxYear = year; // Store the **earliest** year with max population
            }
        }

        return maxYear;

    }
}