class Solution {
    public int countNicePairs(int[] nums) {
        long goodPair=0;
        Map<Long,Integer>map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            long diff=nums[i]-rev(nums[i]);
            goodPair=(goodPair+map.getOrDefault(diff,0))%1000000007;
            map.put(diff,map.getOrDefault(diff,0)+1);
        }

        return (int)goodPair;
        
    }

    public long rev(int nums)
    {
        long reverse=0;
        while(nums!=0)
        {
            reverse=reverse*10+nums%10;
            nums/=10;
        }
        return reverse;
    }
}