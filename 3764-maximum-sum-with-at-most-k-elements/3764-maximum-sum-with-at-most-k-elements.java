class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {

        int n = grid.length; // Number of rows
        int m = grid[0].length; // Number of columns

        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Long> temp = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                temp.add((long)grid[i][j]);
            }
            int l=limits[i];
            while(l>0)
            {
                pq.add(temp.poll());
                l--;
            }
            temp.clear();
        }

        long ans = 0;
        while(k>0 && !pq.isEmpty())
        {
            ans=ans+pq.poll();
            k--;
        }

        return ans;

    }
}