class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        Arrays.sort(nums);
        int start=1;
        int end=nums[nums.length-1];
        int ans=Integer.MAX_VALUE;

        while(start<=end)
        {
            int mid=start+(end-start)/2;
            int sum=isPossible(nums,mid);


            if(sum<=threshold)
            {
                ans=Math.min(ans,mid);
                end=mid-1;
            }else
            {
                start=mid+1;
            }
        }

        return ans;
        
    }

    int isPossible(int []nums,int divisor)
    {
       int total = 0;
        for (int num : nums) {
            total += (int) Math.ceil((double) num / divisor);
        }
        return total;
    }
}