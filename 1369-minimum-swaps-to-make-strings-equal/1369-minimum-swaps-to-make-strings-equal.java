class Solution {
    public int minimumSwap(String s1, String s2) {
        // First, we count the number of 'xy' and 'yx' pairs
        int xy = 0, yx = 0;
        
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'x' && s2.charAt(i) == 'y') {
                xy++;
            } else if (s1.charAt(i) == 'y' && s2.charAt(i) == 'x') {
                yx++;
            }
        }
        
        // Now, we can calculate the minimum swaps
        // Since each swap resolves two mismatches (one 'xy' and one 'yx'),
        // we need to check if both counts are even. If they are not,
        // it's impossible to resolve all the mismatches
        if ((xy + yx) % 2 != 0) {
            return -1;  // If the total count of mismatches is odd, it's impossible to swap
        }
        
        // The minimum number of swaps is (xy + 1) / 2 + (yx + 1) / 2
        return (xy + 1) / 2 + (yx + 1) / 2;
    }
}
