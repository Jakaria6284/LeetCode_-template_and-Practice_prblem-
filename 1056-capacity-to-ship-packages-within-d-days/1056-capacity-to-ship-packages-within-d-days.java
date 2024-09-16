class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int start=getMaxWeight(weights);
        int end=getTotalWeight(weights);
        int ans=-1;

        while(start<=end)
        {
             int mid=start+(end-start)/2;

             if(canValid(weights,mid,days))
             {
                   end=mid-1;
                   ans=mid;
             }else
             {
                start=mid+1;
             }

        }
        return ans;
        
    }

    public boolean canValid(int[]weights,int mid,int D)
    {

        int days=1;
        int currentCapacity=0;

        for(int i=0;i<weights.length;i++)
        {
            if( currentCapacity+weights[i]>mid)
            {
                days++;
                 currentCapacity=0;
            }
             currentCapacity +=weights[i];

             if(days>D)
             {
                return false;
             }
        }
        return true;

    }

    public int getMaxWeight(int []weight)
    {
        int max=Integer.MIN_VALUE;

        for(int i=0;i<weight.length;i++)
        {
            if(weight[i]>max)
            {
                max=weight[i];
            }
        }
        return max;

    }

    public int getTotalWeight(int[]weight)
    {
        int toatalWeight=0;
        for(int i=0;i<weight.length;i++)
        {
           toatalWeight += weight[i];
        }

        return toatalWeight;
    }
}