class Solution {
    public int numberOfSubstrings(String s, int k) {
        
        int res=0;
        for (int i = 0; i < s.length(); i++) {
            Map<Character, Integer> map = new HashMap<>();
            int max=0;
            for (int j = i; j < s.length(); j++) {
                
                    map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
                     max=Math.max(max,map.get(s.charAt(j)));

                    if(max>=k)
                    {
                          res++;
                    }
                    
                
            }
        }

        return res;

    }
}