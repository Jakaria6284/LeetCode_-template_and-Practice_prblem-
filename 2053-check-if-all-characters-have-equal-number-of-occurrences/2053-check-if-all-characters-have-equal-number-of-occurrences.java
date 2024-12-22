class Solution {
    public boolean areOccurrencesEqual(String s) {

        Map<Character,Integer>map=new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        int cmp=map.get(s.charAt(0));

        for(Map.Entry<Character,Integer>entry:map.entrySet())
        {
              if(cmp==entry.getValue())
              {
                cmp=entry.getValue();
              }else
              {
                return false;
              }
        }

        return true;
        
    }
}