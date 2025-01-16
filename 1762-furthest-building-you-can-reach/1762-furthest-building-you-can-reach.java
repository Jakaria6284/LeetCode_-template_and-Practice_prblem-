class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); 
        int count = 0;

        for (int i = 0; i < heights.length - 1; i++) {
           int diff=heights[i+1]-heights[i];
           if(diff>0)
           {
            pq.offer(diff);
            if(pq.size()>ladders)
            {
                bricks-=pq.poll();

                if(bricks<0)
                {
                    return i;
                }
            }
           }
           count++;
        }

        return count; // Return the total number of buildings we can reach
    }
}
