class Solution {
    public int maxScore(int[] nums, int k) {

        int leftSum=0;
        int rightSum=0;
        int maxSum=0;


        for(int i=0;i<k;i++)
        {
            leftSum+=nums[i];
        }

        maxSum=leftSum;
        int right=nums.length-1;

        for(int i=k-1;i>=0;i--)
        {
           leftSum-=nums[i];
           rightSum+=nums[right];
           maxSum=Math.max(maxSum,leftSum+rightSum);
           right--;
        }

        return maxSum;
        
    }
}