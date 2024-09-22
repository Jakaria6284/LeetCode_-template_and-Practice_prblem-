class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int start=1;
        int end=(int)1e9;
        int ans=-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(isPossible(quantities,mid,n))
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

    boolean isPossible(int []quantities,int mid,int n)
    {
       

        int currentShop=0;

        for(int i=0;i<quantities.length;i++)
        {
            
             currentShop=currentShop+(quantities[i]/mid);
             if(quantities[i]%mid!=0)
             {
                currentShop+=1;
             }

             if(currentShop>n)
             {
                return false;
             }
        }
        return true;
    }
}