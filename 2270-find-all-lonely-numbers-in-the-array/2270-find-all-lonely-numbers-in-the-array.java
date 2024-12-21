class Solution {
    public List<Integer> findLonely(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        List<Integer>list=new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
            if(entry.getValue()==1)
            {
                int leftN=entry.getKey()-1;
                int rightN=entry.getKey()+1;
                if(map.containsKey(leftN) || map.containsKey(rightN))
                {
                    continue;
                }else
                {
                  list.add(entry.getKey());
                }
            }
        }
        return list;
    }
}