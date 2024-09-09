import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if (s1.length() > s2.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        int window = s1.length();

        // Populate the frequency map for s1
        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }

        // Slide over s2 with the window size of length s1
        for (int i = 0; i <= s2.length() - window; i++) {
            String sub = s2.substring(i, i + window);
            char[] arr = sub.toCharArray();

            Map<Character, Integer> subMap = new HashMap<>();
            int j = 0;
            
            // Build frequency map for the current substring
            while (j < arr.length) {
                subMap.put(arr[j], subMap.getOrDefault(arr[j], 0) + 1);
                j++;
            }

            // Compare the frequency maps
            if (map.equals(subMap)) {
                return true;
            }
        }

        return false;
    }
}
