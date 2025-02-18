class Solution {
    public int[] sortArrayByParityII(int[] nums) {

        int even=0;
        int odd=1;

        while(even<nums.length && odd<nums.length)
        {
            if(nums[even]%2!=0)
            {
               swap(nums,even,odd);
                odd=odd+2;
            }else
            {
               even=even+2;
               
            }
        }

        return nums;
        
    }

    public void swap(int nums[],int even ,int odd)
    {
       int temp=nums[even];
       nums[even]=nums[odd];
       nums[odd]=temp;
    }
}