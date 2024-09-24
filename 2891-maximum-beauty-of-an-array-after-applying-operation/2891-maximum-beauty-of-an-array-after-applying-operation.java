class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);

        int i=0;
        int ans=0;

        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]-nums[i]<=k*2)
            {
                ans=Math.max(ans,j-i+1);
            }else
            {
                while(nums[j]-nums[i]>k*2)
                {
                    i++;
                }
                ans=Math.max(ans,j-i+1);
            }
        }

        return ans;
        
    }
}