class Solution {
    public long findMaximumScore(List<Integer> nums) {

        long res = 0;
        int i = 0;
        for(int j=1; j<nums.size(); j++){
            if(nums.get(j)>nums.get(i)){
                res+=((long)nums.get(i)*(j-i));
                i=j;
            }
        }
        res+=(nums.get(i)*((long)nums.size()-1-i));
        return res;
    }
}