class Solution {
    public int maxJump(int[] stones) {

        if(stones.length==2)
        {
            return stones[1]-stones[0];
        }

        int res=0;
        
        for(int i=0;i<stones.length-2;i++)
        {
            int dis=stones[i+2]-stones[i];
            res=Math.max(res,dis);
        }

        return res;
        
    }
}