class Solution {
    public int bestClosingTime(String s) {
        int minimumPenalty = Integer.MAX_VALUE;
        int bestIndex = 0; // Store the index of minimum penalty
        int totalY = 0;
        int totalN = 0;
        int leftY = 0;
        int leftN = 0;

        // Count total 'Y' and 'N'
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'Y') {
                totalY++;
            } else {
                totalN++;
            }
        }

        // Handle edge cases
        if (totalY == 0) {
            return 0;
        }
        if (totalN == 0) {
            return s.length();
        }

        // Calculate penalties
        for (int i = 0; i <= s.length(); i++) { // Loop runs till length for last index check
            int penalty = (totalY - leftY) + leftN;

            // Update minimum penalty and its index
            if (penalty < minimumPenalty) {
                minimumPenalty = penalty;
                bestIndex = i; // Store the index
            }

            // Update counts
            if (i < s.length()) { // Avoid index out of bounds
                if (s.charAt(i) == 'Y') {
                    leftY++;
                } else {
                    leftN++;
                }
            }
        }

        return bestIndex; // Return the index of minimum penalty
    }
}
