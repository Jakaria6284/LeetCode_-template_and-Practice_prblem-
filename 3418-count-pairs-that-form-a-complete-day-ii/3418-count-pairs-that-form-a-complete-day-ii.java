class Solution {
    public long countCompleteDayPairs(int[] hours) {
        Map<Integer,Integer>map=new HashMap<>();
        long count=0;

        for(int i=0;i<hours.length;i++)
        {
            int rem=hours[i]%24;
            int cal=(24-rem)%24;
            if(map.containsKey(cal))
            {
                 count+=map.get(cal);
                 // map.put(cal,map.get(cal)+1);
            }
            
                map.put(rem,map.getOrDefault(rem,0)+1);
            
        }


        return count;
        
    }
}