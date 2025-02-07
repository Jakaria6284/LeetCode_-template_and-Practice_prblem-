class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()<k)return false;


        HashMap<Character,Integer>map=new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int oddCount=0;

        for(Map.Entry<Character,Integer>entry:map.entrySet())
        {
            int val=entry.getValue();
            if(val%2!=0  )
            {
               oddCount++;
            }
        }

          if(oddCount>k) return false;
        return true;
        
    }
}