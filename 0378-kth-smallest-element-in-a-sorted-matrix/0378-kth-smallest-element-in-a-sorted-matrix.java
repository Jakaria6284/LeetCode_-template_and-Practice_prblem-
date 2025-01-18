class Solution {
    public int kthSmallest(int[][] nums, int k) {
        int row=nums.length;
        int col=nums[0].length;
        PriorityQueue<Integer>pq=new PriorityQueue<>();

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                pq.offer(nums[i][j]);
            }
        }
        int ans=0;

        for(int i=0;i<k;i++)
        {
           ans=pq.poll();
        }

        return ans;


        
    }
}