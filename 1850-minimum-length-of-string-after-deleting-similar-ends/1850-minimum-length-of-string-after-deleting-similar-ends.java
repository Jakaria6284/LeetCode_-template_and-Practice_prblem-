class Solution {
    public int minimumLength(String s) {
        
        int i = 0;
        int j = s.length() - 1;

        while (i < j && s.charAt(i) == s.charAt(j)) // Check i < j to avoid out-of-bound errors
        {
            // Move i forward while it's valid and characters match
            while (i < j && s.charAt(i) == s.charAt(i + 1)) { // Check i < j
                i++;
            }

            // Move j backward while it's valid and characters match
            while (i < j && s.charAt(j) == s.charAt(j - 1)) { // Check i < j
                j--;
            }

            i++;  // Move i one step forward
            j--;  // Move j one step backward
        }

        int ans= j - i + 1; // Return the remaining length
        if(ans<0)
        {
            return 0;
        }
        return ans;
    }
}
