import java.util.*;

class Solution {
    public long maximumTotalDamage(int[] power) {
        // Count occurrences of each power level
        Map<Integer, Long> freqMap = new HashMap<>();
        for (int p : power) {
            freqMap.put(p, freqMap.getOrDefault(p, 0L) + p);
        }

        // Convert to sorted unique power values
        List<Integer> uniquePowers = new ArrayList<>(freqMap.keySet());
        Collections.sort(uniquePowers);

        int n = uniquePowers.size();
        Map<Integer, Long> dp = new HashMap<>();
        
        return maxDamage(uniquePowers, freqMap, dp, 0);
    }

    private long maxDamage(List<Integer> uniquePowers, Map<Integer, Long> freqMap, Map<Integer, Long> dp, int index) {
        if (index >= uniquePowers.size()) return 0; // Base case

        if (dp.containsKey(index)) return dp.get(index);

        int curPower = uniquePowers.get(index);
        long pick = freqMap.get(curPower); // Damage sum for the current power level

        // Find the next index where the power difference is greater than 2
        int nextIndex = index + 1;
        while (nextIndex < uniquePowers.size() && uniquePowers.get(nextIndex) <= curPower + 2) {
            nextIndex++;
        }

        // Option 1: Pick current power and skip overlapping values
        pick += maxDamage(uniquePowers, freqMap, dp, nextIndex);

        // Option 2: Skip current power
        long notPick = maxDamage(uniquePowers, freqMap, dp, index + 1);

        // Memoize and return the max damage possible
        long result = Math.max(pick, notPick);
        dp.put(index, result);
        return result;
    }
}
