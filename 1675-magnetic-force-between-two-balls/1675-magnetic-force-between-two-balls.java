class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);

        int start=1;
        int end=position[position.length-1]-position[0];
        int ans=-1;

        while(start<=end)
        {

            int mid=start+(end-start)/2;

            if(isDistributionPossible(position,mid,m))
            {
                ans=mid;
                start=mid+1;
                
            }else
            {
                end=mid-1;
            }
        }

        return ans;
        
    }

    boolean isDistributionPossible(int []position,int midDistance,int m)
    {
        int lastBallPosition=position[0];

        int  ballCount=1;

        for(int i=1;i<position.length;i++)
        {
            if(position[i]-lastBallPosition>= midDistance)
            {
                ballCount++;
                lastBallPosition=position[i];
            }

            if(ballCount>=m)
            {
                return true;
            }
        }

        return false;
    }
}