class Solution {
    public int[] leftRightDifference(int[] nums) {
        int totalSum=0;
        int leftSum=0;
        int rightSum=0;
        int ans[]=new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            totalSum+=nums[i];
        }
      for(int i=0;i<nums.length;i++)
      {
        rightSum=totalSum-nums[i];
        totalSum=rightSum;
        ans[i]=Math.abs(leftSum-rightSum);
        leftSum+=nums[i];
      }

        return ans;
    }
}