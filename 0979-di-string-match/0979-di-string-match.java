class Solution {
    public int[] diStringMatch(String s) {
        int start=0;
        int result[]=new int[s.length()+1];

        
        int end=result.length-1;
        int index=0;

        while(index<s.length())
        {
            if(s.charAt(index)=='I')
            {
                result[index]=start;
                start++;
            }else
            {
                result[index]=end;
                end--;
            }
            index++;
        }

        result[index]=end;
        return result;
        
    }
}