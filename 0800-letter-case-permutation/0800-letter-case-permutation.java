class Solution {
     
    public List<String> letterCasePermutation(String S) {
       List<String> ans = new ArrayList<>();
        dfs(S,S.length(),0,new String(""),ans);
        return ans;
    }

    public void dfs(String s,int n,int i,String p,List<String>ans)
    {
        if(i==n)
        {
            ans.add(new String(p));
            return ;
        }
        char ch=s.charAt(i);
        if(!Character.isDigit(ch))
        {
            if(Character.isUpperCase(ch))
            {
                dfs(s,n,i+1,p+Character.toLowerCase(ch),ans);
            }else
            {
                 dfs(s,n,i+1,p+Character.toUpperCase(ch),ans);
            }
        }
        dfs(s,n,i+1,p+ch,ans);
    }
    
   
    }
