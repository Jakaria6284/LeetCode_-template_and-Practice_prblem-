class Solution {
    public int numRescueBoats(int[] nums, int limit) {

        Arrays.sort(nums);
        int count=0;

        int i=0;
        int j=nums.length-1;

        while(i<=j)
        {
            if(i!=j)
            {
                int sum=nums[i]+nums[j];

                if(sum>limit)
                {
                    j--;
                    count++;

                }else if(sum<limit)
                {
                    i++;
                    j--;
                    count++;
                }else
                {
                    i++;
                    j--;
                    count++;
                }
            }else
            {
                if(nums[i]<=limit)
                {
                    count++;
                    i++;
                    j--;
                }
            }
        }

        return count;
        
    }
}