class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums); // Sort the array

        int start = 0;
        int end = nums[nums.length - 1] - nums[0]; // Maximum possible pair distance
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isSmallPair(nums, mid, k)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    // Optimized isSmallPair using two-pointer technique
    boolean isSmallPair(int[] nums, int mid, int k) {
       int pairCount=0;
       int j=1;

       for(int i=0;i<nums.length;i++)
       {

        while(j<nums.length && nums[j]-nums[i]<=mid)
        {
           j++;
        }

        pairCount+=j-i-1;
       }

       return pairCount>=k;
    }
}
