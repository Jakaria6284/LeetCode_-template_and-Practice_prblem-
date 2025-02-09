class Solution {
    public String largestMerge(String s1, String s2) {
        StringBuilder str = new StringBuilder();

        while (s1.length() > 0 && s2.length() > 0) {
            if (s1.compareTo(s2) > 0) { // Compare lexicographically
                str.append(s1.charAt(0));
                s1 = s1.substring(1);
            } else {
                str.append(s2.charAt(0));
                s2 = s2.substring(1);
            }
        }

        // Append any remaining characters from either string
        str.append(s1).append(s2);

        return str.toString();
    }
}
