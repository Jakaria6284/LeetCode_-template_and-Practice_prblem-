class Solution {
    Map<Integer, Integer> map;
    Boolean dp[][];

    public boolean canCross(int[] stones) {
        map = new HashMap<>();
         dp=new Boolean[2001][2001];
        for (int i = 0; i < stones.length; i++) {
            map.put(stones[i], i);
        }
        return helper(stones, 0, 0);

    }

    boolean result = false;

    public boolean helper(int[]stones,int cPosition,int previousJump)
    {
       
        if(cPosition==stones.length-1)
        {
            return true;
        }

        if(dp[cPosition][previousJump]!=null)
        {
            return dp[cPosition][previousJump];
        }

        for(int i=previousJump-1;i<=previousJump+1;i++)
        {
            if(i>0)
            {
               int  nextStep=stones[cPosition]+i;

               if(map.containsKey(nextStep))
               {
                  result=result|| helper(stones,map.get(nextStep),i);
               }
            }
        }
        dp[cPosition][previousJump]=result;

        return  result;

    }
}