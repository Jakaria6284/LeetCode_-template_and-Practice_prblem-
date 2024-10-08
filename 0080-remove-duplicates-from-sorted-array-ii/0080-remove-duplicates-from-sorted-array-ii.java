class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] newNums = new int[nums.length];
        int k=0;
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            if(map.get(nums[i])<=2){
                newNums[k] = nums[i];
                k++;
            }
        }
        for(int i=0; i<k; i++){
            nums[i] = newNums[i];
        }
        return k;
    }
}