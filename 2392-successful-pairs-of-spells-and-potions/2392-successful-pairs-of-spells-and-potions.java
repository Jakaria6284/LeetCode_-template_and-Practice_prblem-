import java.util.Arrays;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions); // Sort the potions array
        int[] ans = new int[spells.length];

        for (int i = 0; i < spells.length; i++) {
            int start = 0; // Reset start for each spell
            int end = potions.length - 1; // Reset end for each spell

            while (start <= end) {
                int mid = start + (end - start) / 2;

                // Use long to prevent integer overflow during multiplication
                if ((long)spells[i] * potions[mid] >= success) {
                    end = mid - 1; // Move left
                } else {
                    start = mid + 1; // Move right
                }
            }
            // The number of successful pairs for spells[i]
            ans[i] = potions.length - start; // All potions from start to end are successful
        }

        return ans;
    }
}
