class Solution {
    public String strWithout3a3b(int a, int b) {
        

        StringBuilder str = new StringBuilder();

        while (a > 0 || b > 0) {
            if (str.length() >= 2 && str.charAt(str.length() - 1) == str.charAt(str.length() - 2)) {
                if (str.charAt(str.length() - 1) == 'a') {
                    str.append("b");
                    b--;
                } else {
                    str.append("a");
                    a--;
                }
            } else {
                if (a > b && a >= 2) {
                    str.append("aa");
                    a -= 2;
                } else if (b > a && b >= 2) {
                    str.append("bb");
                    b -= 2;
                } else {
                    if (a > 0) {
                        str.append("a");
                        a--;
                    }
                    if (b > 0) {
                        str.append("b");
                        b--;
                    }
                }
            }
        }

        return str.toString();
    }
}
