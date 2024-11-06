class Solution {
    public boolean rotateString(String s, String goal) {

        for(int i=1;i<=s.length();i++)
        {
            String extractCharacterFromFirst=s.substring(0,i);
            String restOfString=s.substring(i);
            String res=restOfString+extractCharacterFromFirst;
            if(res.equals(goal))
            {
                return true;
               
            }
        }

        return false;
        
    }
}