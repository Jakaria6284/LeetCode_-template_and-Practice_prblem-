class Solution {
    public int minStoneSum(int[] piles, int k) {
       PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);


        for(int i=0;i<piles.length;i++)
        {
            pq.offer(piles[i]);
        }

        for(int i=0;i<k;i++)
        {
            int firstVal=pq.poll();
           pq.offer((int)Math.ceil(firstVal / 2.0));
        }
        int ans=0;
        while(!pq.isEmpty())
        {
            ans+=pq.poll();
        }

        return ans;
        
    }
}