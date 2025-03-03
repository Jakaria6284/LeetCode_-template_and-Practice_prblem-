class Solution {
    public int[] productExceptSelf(int[] nums) {
          int []product=new int[nums.length];
          int n=nums.length;
        int mul=1;
        for(int i=0;i<n;i++)
        {
            product[i]=mul;
            mul=mul*nums[i];
        }

        mul=1;

        for(int j=n-1;j>=0;j--)
        {
            product[j]=product[j]*mul;
            mul=mul*nums[j];
        }

        return product;
        
    }
}