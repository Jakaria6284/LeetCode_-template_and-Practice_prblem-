class Solution {
    public int findKthPositive(int[] nums, int k) {

        int num=1;
        int i=0;

        while(i<nums.length && k>0)
        {
            if(nums[i]==num)
            {
                i++;
                num++;
            }else
            {
                k--;
                num++;
            }
        }

        while(k>0)
        {
            num++;
            k--;
        }

        return num-1;
        
    }
}