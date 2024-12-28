class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String>set=new HashSet<>();
        int cmp=(int)Math.pow(2,k);

        for(int i=0;i<s.length()-k+1;i++)
        {
           set.add(s.substring(i,i+k));
        }

        if(cmp==set.size())
        {
            return true;
        }


        return false;

        
        
    }
}