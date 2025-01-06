class Solution {
    public boolean canChange(String start, String target) {
        // Pointers for both strings
        int i = 0, j = 0;
        int n = start.length();

        while (i < n || j < n) {
            // Skip underscores in start
            while (i < n && start.charAt(i) == '_') i++;
            // Skip underscores in target
            while (j < n && target.charAt(j) == '_') j++;

            // If one pointer reached the end but the other didn't
            if (i == n || j == n) {
                return i == n && j == n; // Both should end together
            }

            // Mismatch between characters
            if (start.charAt(i) != target.charAt(j)) {
                return false;
            }

            // Rule for 'L' - it can only move left
            if (start.charAt(i) == 'L' && i < j) {
                return false; // 'L' must appear later in start than in target
            }

            // Rule for 'R' - it can only move right
            if (start.charAt(i) == 'R' && i > j) {
                return false; // 'R' must appear earlier in start than in target
            }

            // Move both pointers
            i++;
            j++;
        }

        return true;
    }
}
