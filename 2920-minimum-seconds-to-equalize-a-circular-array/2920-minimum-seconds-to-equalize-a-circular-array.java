class Solution {
    public int minimumSeconds(List<Integer> nums) {
        int size=nums.size();

        Map<Integer,List<Integer>>map=new HashMap<>();

        for(int i=0;i<size;i++)
        {
            if(map.containsKey(nums.get(i)))
            {
                map.get(nums.get(i)).add(i);
            }else
            {
                map.put(nums.get(i),new ArrayList<>());
                map.get(nums.get(i)).add(i);
            }
        }

        int ans=size;
        for(List<Integer>list:map.values())
        {
             int maxdiff = (size - list.get(list.size()-1) + list.get(0))/2;
            for(int i=1;i<list.size();i++)
            {
                int diff=list.get(i)-list.get(i-1);
                maxdiff=Math.max(maxdiff,diff/2);
            }

            ans=Math.min(ans,maxdiff);


        }

       return ans;
       
    }
}