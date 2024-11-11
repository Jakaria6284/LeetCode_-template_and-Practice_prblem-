class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subset=new ArrayList<>();
        subset.add(new ArrayList<>());

        for(int num:nums)
        {
            int size=subset.size();
            for(int i=0;i<size;i++)
            {
                List<Integer>list=new ArrayList<>(subset.get(i));
                list.add(num);
                subset.add(list);
            }
        }
        return subset;
    }
}