class Solution {
    public int minOperations(int[] nums) {
        int [] arr=new int [nums.length];
        int n=nums.length;
          for(int i=0;i<n;i++)
        {
             arr[i]=nums[i];
        }
           

        for(int i=0;i<n-1;i++)
        {
            if(arr[i+1]<=arr[i])
            {
                arr[i+1]=arr[i]+1;
            }
        }
        int count=0;

        for(int i=0;i<nums.length;i++)
        {
            count+=arr[i]-nums[i];
        }

         return count;
    }
}