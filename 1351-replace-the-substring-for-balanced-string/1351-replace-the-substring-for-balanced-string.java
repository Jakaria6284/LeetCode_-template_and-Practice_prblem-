class Solution {
    public int balancedString(String s) {

        // Step 1: Count frequencies of each character in the string
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        // Step 2: Target for each character to have equal frequency
        int n = s.length();
        int target = n / 4;
        
        // Step 3: If all characters already meet the target, return 0
        if (map.getOrDefault('Q', 0) <= target &&
            map.getOrDefault('W', 0) <= target &&
            map.getOrDefault('E', 0) <= target &&
            map.getOrDefault('R', 0) <= target) {
            return 0;
        }

        // Step 4: Sliding window logic (optimized)
        int l = 0;
        int minLength = n;

        for (int r = 0; r < n; r++) {
            // Decrease the count of the right character as it's part of the window
            map.put(s.charAt(r), map.get(s.charAt(r)) - 1);

            // Check if the current window [l, r] can make the remaining string balanced
            while (l <= r &&
                   map.getOrDefault('Q', 0) <= target &&
                   map.getOrDefault('W', 0) <= target &&
                   map.getOrDefault('E', 0) <= target &&
                   map.getOrDefault('R', 0) <= target) {

                // Update the minimum length of the window that can be removed
                minLength = Math.min(minLength, r - l + 1);

                // Shrink the window from the left
                map.put(s.charAt(l), map.get(s.charAt(l)) + 1);
                l++;
            }
        }

        return minLength;
    }
}
