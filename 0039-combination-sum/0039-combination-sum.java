import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    private List<List<Integer>> results;

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        results=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        backtrack(nums,list,target,0);
        return results;

        
    }
    public void backtrack(int[]nums,List<Integer>list,int remain,int i)
    {
            if(remain<0){
                return ;
            }else if(remain==0)
            {
                results.add(new ArrayList<>(list));
            }else
            {
                if (i >= nums.length) return;
                list.add(nums[i]);
                backtrack(nums,list,remain-nums[i],i);
                list.remove(list.size()-1);
                backtrack(nums,list,remain,i+1);
            }
    }

   
    
}
