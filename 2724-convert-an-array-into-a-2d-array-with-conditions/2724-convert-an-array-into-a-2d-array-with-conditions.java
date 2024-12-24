class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        while(!map.isEmpty())
        {
            List<Integer>list=new ArrayList<>();
            for(int i=0;i<nums.length;i++)
            {
                if(map.containsKey(nums[i]))
                {
                    if(!list.contains(nums[i]))
                    {
                       list.add(nums[i]);
                        map.put(nums[i],map.get(nums[i])-1);
                        if(map.get(nums[i])==0)
                        {
                            map.remove(nums[i]);
                        }
                    }
                    
                   
                }
            }
            result.add(list);
        }

        return result;
        
    }
}