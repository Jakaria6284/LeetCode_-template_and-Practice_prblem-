class Solution {
    List<List<Integer>>result=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        // List<List<Integer>> subset=new ArrayList<>();
        // subset.add(new ArrayList<>());

        // for(int num:nums)
        // {
        //     int size=subset.size();
        //     for(int i=0;i<size;i++)
        //     {
        //         List<Integer>list=new ArrayList<>(subset.get(i));
        //         list.add(num);
        //         subset.add(list);
        //     }
        // }
        // return subset;
        List<Integer>list=new ArrayList<>();
        findsubset(nums,0,list);
        return result;

    }
     public void findsubset(int[]nums,int index,List<Integer>list)
     {
        if(index==nums.length)
        {
            result.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[index]);

         findsubset(nums,index+1,list);
         list.remove(list.size()-1);
         findsubset(nums,index+1,list);

     }
}