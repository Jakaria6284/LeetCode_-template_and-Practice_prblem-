class Solution {
    public int longestPalindrome(String s, String t) {

        int result = 0;

        int n = s.length();
        int m = t.length();

        for (int i = 0; i <= n; i++) {
            for (int j = i; j <= n; j++) {

                String sPart = s.substring(i, j);

                for (int k = 0; k <= m; k++) {
                    for (int l = k; l <= m; l++) {
                        String tPart = t.substring(k, l);

                        String combine = sPart + tPart;

                        boolean res = isPalindrom(combine);

                        if (res == true) {
                            result = Math.max(result, combine.length());
                        }

                    }
                }
            }
        }

        return result;

    }

    public boolean isPalindrom(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }

        }

        return true;
    }
}