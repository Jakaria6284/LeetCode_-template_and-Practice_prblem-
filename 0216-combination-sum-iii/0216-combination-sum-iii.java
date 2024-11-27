class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
         List<List<Integer>>result=new ArrayList<>();
         List<Integer>list=new ArrayList<>();
         dfs(1,k,list,result,n);
         return result;

    }

    public void dfs(int start,int k, List<Integer>list,List<List<Integer>>result,int n)
    {
        // if(list.size() > k) return;
         if(list.size()==k)
        {
            if(n==0)
            {
                result.add(new ArrayList<>(list));
            }
            return ;
        }else{
                for(int i=start;i<=9;i++)
        {
            list.add(i);
            dfs(i+1,k,list,result,n-i);
            list.remove(list.size()-1);
        }
        }

       
    }
}