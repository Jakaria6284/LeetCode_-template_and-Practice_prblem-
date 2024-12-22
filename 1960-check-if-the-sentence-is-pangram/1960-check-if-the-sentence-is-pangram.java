class Solution {
    public boolean checkIfPangram(String sentence) {
        int cnt=0;
         Map<Character, Integer> map = new HashMap<>();

        // Populate the map with English lowercase letters and their positions
       for(int i=0;i<sentence.length();i++)
       {
        map.put(sentence.charAt(i),map.getOrDefault(sentence.charAt(i),0)+1);
       }

       if(map.size()==26)
       {
        return true;
       }


       return false;

      
    }
}