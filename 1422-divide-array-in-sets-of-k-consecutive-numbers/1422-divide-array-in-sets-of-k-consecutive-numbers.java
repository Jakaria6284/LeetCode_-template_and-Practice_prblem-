import java.util.*;

class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
       
       PriorityQueue<Integer>pq=new PriorityQueue<>();

       for(int i=0;i<nums.length;i++)
       {
        pq.offer(nums[i]);
       }

       while(!pq.isEmpty())
       {
        int current=pq.poll();

        for(int j=1;j<k;j++)
        {
            int check=current+j;
            if(!pq.remove(check)) return false;
        }

       }

      return true;
    }
}
