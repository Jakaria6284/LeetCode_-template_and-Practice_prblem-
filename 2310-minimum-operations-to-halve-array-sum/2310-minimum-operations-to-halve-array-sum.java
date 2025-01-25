class Solution {
    public int halveArray(int[] nums) {
        double totalSum=0;
        PriorityQueue<Double>pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<nums.length;i++)
        {
              pq.offer((double)nums[i]);
              totalSum+=nums[i];
        }

        int count=0;
        double temSum=0;

        while(temSum< totalSum/2)
        {
             double max=pq.poll()/2.0;
             temSum+=max;
             pq.offer(max);
             count++;
        }

        return count;
        
    }
}