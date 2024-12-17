class Solution {
    public long countBadPairs(int[] nums) {
        long goodPair=0;
        int n=nums.length;
        long tp=(long)n*(n-1)/2;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int diff=i-nums[i];
            goodPair+=map.getOrDefault(diff,0);
            map.put(diff,map.getOrDefault(diff,0)+1);
        }
        
        return  tp-goodPair;
    }
}