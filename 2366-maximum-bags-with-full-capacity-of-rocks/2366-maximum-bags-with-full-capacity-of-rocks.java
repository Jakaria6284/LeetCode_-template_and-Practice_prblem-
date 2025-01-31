import java.util.Arrays;

class Solution {
    public int maximumBags(int[] capacity, int[] rock, int additionalRocks) {
        int n = capacity.length;
        int[] remainingCapacity = new int[n];

        // Compute how many rocks are needed to fill each bag
        for (int i = 0; i < n; i++) {
            remainingCapacity[i] = capacity[i] - rock[i];
        }

        // Sort by remaining capacity (smallest first)
        Arrays.sort(remainingCapacity);

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (remainingCapacity[i] <= additionalRocks) { // Can fill this bag?
                additionalRocks -= remainingCapacity[i]; // Use rocks
                count++; // Increase count
            } else {
                break; // No more rocks left to use
            }
        }

        return count;
    }
}
