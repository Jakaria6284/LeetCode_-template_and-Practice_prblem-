class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int []arr=new int[n*(n+1)/2];
         int idx = 0;
       

        for(int i=0;i<nums.length;i++)
        {
            int sum=0;

            for(int j=i;j<nums.length;j++)
            {
              sum+=nums[j];
              arr[idx++]=sum;
            }
        }

        Arrays.sort(arr);
        int res=0;
         final int m=(int)1e9+7;

        for(int i=left-1;i<right;i++)
        {
              res=(res+arr[i])%m;
        }

        return res;
        
    }
}