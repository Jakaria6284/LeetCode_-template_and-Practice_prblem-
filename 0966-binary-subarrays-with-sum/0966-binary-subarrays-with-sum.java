class Solution {
    public int numSubarraysWithSum(int[] nums, int k) {
        
       
      return subarray(nums,k)-subarray(nums,k-1);      

    }

    private int subarray(int []arr,int k){
         int n = arr.length;
        int l = 0, r = 0, count = 0;
        int sum = 0;

        while (r < n) {
            sum += arr[r];  // Add nums[r] to the current sum
            
            // Shrink the window if the sum exceeds the target k
            while (sum > k && l <= r) {
                sum -= arr[l];
                l++;
            }

            count=count+(r-l+1);
            r++;

           
    }
     return count;
 }

 
}

