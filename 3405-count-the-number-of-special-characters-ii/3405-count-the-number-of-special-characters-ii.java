class Solution {
    public int numberOfSpecialChars(String word) {
        Map<Character,Integer>map = new HashMap<>();
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(ch>=97 && ch<=122) map.put(ch,i);
            else continue;
        }
        int res = 0;
        for(char ch:map.keySet()){
            char upp = (char)(ch-32);
            if(word.indexOf(upp) > map.get(ch)) res++;
        }
        return res;
    }
}