import java.util.HashMap;
import java.util.Map;

class Solution {
    public String customSortString(String order, String s) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder str = new StringBuilder();

        // Count the occurrences of each character in s
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Append characters from order according to their counts in s
        for (int i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
            while (map.containsKey(c) && map.get(c) > 0) {
                str.append(c);
                map.put(c, map.get(c) - 1);
            }
            // Remove the character from the map if its count is zero
            if (map.containsKey(c) && map.get(c) == 0) {
                map.remove(c);
            }
        }

        // Append remaining characters not in order
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char ch = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) { // Append each character count times
                str.append(ch);
            }
        }

        return str.toString();
    }
}
