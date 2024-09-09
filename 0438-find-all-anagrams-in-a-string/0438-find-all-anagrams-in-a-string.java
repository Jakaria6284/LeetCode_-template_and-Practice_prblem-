import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        char[] sortedP = p.toCharArray();
        Arrays.sort(sortedP);
        int window = p.length();

        for (int i = 0; i <= s.length() - window; i++) {
            char[] currentWindow = s.substring(i, i + window).toCharArray();
            Arrays.sort(currentWindow);
            if (Arrays.equals(currentWindow, sortedP)) {
                list.add(i);
            }
        }
        return list;
    }

}
