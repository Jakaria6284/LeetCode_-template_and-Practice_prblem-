class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
         map.put(0, -1);
        int sum=0;


        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            int rem=sum%k;
             if (rem < 0) rem += k; 
           
            if (map.containsKey(rem)) {
                // Check if subarray length >= 2
                if (i - map.get(rem) >= 2) {
                    return true;
                }
            } else {
                // Store first occurrence of this remainder
                map.put(rem, i);
            }
        }

        return false;
        
    }
}