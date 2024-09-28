import java.util.Arrays;

class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int res = 0, n = nums.length, left = 0, right = n - 1;
        int mod = (int)1e9 + 7;
        int []pow=new int[n];
        pow[0]=1;

        for(int i=1;i<n;i++)
        {
            pow[i]=pow[i-1]*2%mod;
        }

        while (left <= right) {
            if (nums[left] + nums[right] > target) {
                right--;
            } else {
                // Use Math.pow to calculate the number of subsequences
                res = (res + pow[right-left]) % mod;
                left++;
            }
        }
        return res;
    }
}
