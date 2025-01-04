class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;

        int ans[]=new int[nums.length];
        int totalSum=0;

        for(int i=0;i<nums.length;i++)
        {
           totalSum+=nums[i];
        }
         int prefixSum=0;
        for(int i=0;i<nums.length;i++)
        {
           int left= i*nums[i]-prefixSum;
           int right=(totalSum-prefixSum-nums[i])-(n-i-1)*nums[i];
           ans[i]=left+right;
           prefixSum+=nums[i];
        }
        return ans;
    }
}