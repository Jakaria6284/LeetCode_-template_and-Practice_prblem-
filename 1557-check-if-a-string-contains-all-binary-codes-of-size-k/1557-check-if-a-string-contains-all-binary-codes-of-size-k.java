class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String>set=new HashSet<>();
        int cmp=(int)Math.pow(2,k);

        for(int i=0;i<s.length()-k+1;i++)
        {
            int j=i+k-1;
            StringBuilder str=new StringBuilder();
            for(int z=i;z<=j;z++)
            {
                str.append(s.charAt(z));
            }
            set.add(str.toString());
            str.setLength(0);
        }

        if(cmp==set.size())
        {
            return true;
        }


        return false;

        
        
    }
}