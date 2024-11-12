import java.util.Arrays;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len = s1.length();
        int n = s2.length();

        // Sort s1 once to use as the reference for permutation comparison
        char[] s1Arr = s1.toCharArray();
        Arrays.sort(s1Arr);
        String sortedS1 = new String(s1Arr);

        for (int i = 0; i <= n - len; i++) {
            // Take the substring of s2 of length 'len'
            String temp = s2.substring(i, i + len);
            char[] tempArr = temp.toCharArray();
            Arrays.sort(tempArr);
            String compareString = new String(tempArr);

            // Check if the sorted substring matches sorted s1
            if (sortedS1.equals(compareString)) {
                return true;
            }
        }

        return false;
    }
}
