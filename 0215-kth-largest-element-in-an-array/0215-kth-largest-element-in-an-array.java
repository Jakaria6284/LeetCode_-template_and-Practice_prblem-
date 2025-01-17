class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer>pq=new PriorityQueue<>();

        for(int i=0;i<nums.length;i++)
        {
            pq.offer(nums[i]);

        }
        int ans=0;
        int result=0;
        for(int i=0;i<nums.length;i++)
        {
         
         ans=pq.poll();
         if(i==(nums.length-k))
         {
            result=ans;
            System.out.print(result);
         }

        }

        return result;


        
    }
}