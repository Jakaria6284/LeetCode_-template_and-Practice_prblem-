class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int k=n-2;
        int l=n-1;

        while(k>=0 && nums[k]>=nums[k+1])
        {
            k--;
        }
        if(k==-1)
        {
           reverse(nums,0,n-1);
           return;
        }

        while(l>k && nums[l]<=nums[k])
        {
            l--;
        }

        swap(nums,k,l);
        reverse(nums,k+1,n-1);
        
    }

    public void reverse(int nums[],int k,int l)
    {
       while(k<l)
       {
           swap(nums,k,l);
           k++;
           l--;

       }
    }

     public void swap(int nums[],int k,int l)
    {
       int temp=nums[k];
       nums[k]=nums[l];
       nums[l]=temp;
    }
}