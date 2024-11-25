class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer>list=new ArrayList<>();

        function(1,n,k,result,list);
        return result;
        
    }
    public void function(int start,int n,int k,List<List<Integer>>result,  List<Integer>list)
    {
        if(list.size()==k)
        {
            result.add(new ArrayList<>(list));
            return ;
        }

        for(int i=start;i<=n;i++)
        {
            if(list.contains(i))
            {
                continue;
            }
            list.add(i);
            function(i+1,n,k,result,list);
            list.remove(list.size()-1);
        }
    }
}