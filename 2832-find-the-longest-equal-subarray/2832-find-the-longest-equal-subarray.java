class Solution {
    public int longestEqualSubarray(List<Integer> list, int k) {
        int s=0, maxFrequency=0;

        Map<Integer, Integer> map = new HashMap<>();
        
        for(int e=0; e<list.size(); e++){
            int val = list.get(e);
            map.put(val, map.getOrDefault(val,0)+1);
            maxFrequency = Math.max(maxFrequency, map.get(val));
            
            int extraElementCount = (e-s+1) - maxFrequency; 
            
            if(extraElementCount > k){
                int num = list.get(s);
                map.put(num, map.get(num)-1);
                s++;
            }
        }
        
        return maxFrequency;
    }
}