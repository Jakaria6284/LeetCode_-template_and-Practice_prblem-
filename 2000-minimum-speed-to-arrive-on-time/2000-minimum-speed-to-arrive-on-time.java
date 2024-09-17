class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int start=1;
        int end=10000000;
        int ans=-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(isMinimumSpeedValid(dist,mid,hour))
            {
                ans=mid;
                end=mid-1;

            }else
            {
                start=mid+1;
            }
        }
        return ans;


        
    }

    boolean isMinimumSpeedValid(int []dist,int mid,double hour)
    {
        double totalHour=0.0;

        for(int i=0;i<dist.length;i++)
        {
            double time=(double)dist[i]/mid;
            if(i!=dist.length-1)
            {
                totalHour += Math.ceil(time);
            }else
            {
                totalHour += time;
            }

            if(totalHour>hour)
            {
                return false;
            }
        }
        return true;

    }
}