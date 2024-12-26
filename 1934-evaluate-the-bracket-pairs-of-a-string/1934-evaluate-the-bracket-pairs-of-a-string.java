class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String>map=new HashMap<>();
        StringBuilder res=new StringBuilder();

        for(int i=0;i<knowledge.size();i++)
        {
             List<String>list=knowledge.get(i);
             map.put(list.get(0),list.get(1));
        }

        int i=0;
        int j=0;


        while(i<s.length())
        {
           char ch=s.charAt(i);
           if(ch=='(')
           {
            String str="";
            j=i+1;
            while(s.charAt(j)!=')')
            {
                str+=s.charAt(j);
                j++;
            }

            if(map.containsKey(str))
            {
               res.append(map.get(str));
            }else{

                res.append("?");
            }

            i=j+1;


            
           }else{
            res.append(s.charAt(i));
            i++;
           }

        }

        return res.toString();
        
    }
}