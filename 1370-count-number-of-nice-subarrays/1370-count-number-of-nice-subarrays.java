class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return nice(nums,k)-nice(nums,k-1);
    }

    private int nice(int[]arr,int k)
    {
        int r=0,l=0,sum=0,result=0;

        int n=arr.length;

        while(r<n)
        {
            if(arr[r]%2!=0)
            {
                sum=sum+1;
            }

            while(sum>k )
            {
                sum=sum-arr[l]%2;
                l++;
            }
            result=result+(r-l+1);
            r++;

        }

        return result;
    }
}