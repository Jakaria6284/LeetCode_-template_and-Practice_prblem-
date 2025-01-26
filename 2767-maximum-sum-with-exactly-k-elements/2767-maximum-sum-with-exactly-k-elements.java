class Solution {
    public int maximizeSum(int[] nums, int k) {
        
PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

    for(int i=0;i<nums.length;i++)
    {
        pq.offer(nums[i]);
    }
    int ans=0;

    for(int i=0;i<k;i++)
    {
        int val=pq.poll();
        ans+=val;
        pq.offer(val+1);

    }

    return ans;
        
    }
}