import java.util.*;

class Solution {
    public List<Integer> peopleIndexes(List<List<String>> fc) {
        // Convert each list to a set for quick lookups
        List<Set<String>> sets = new ArrayList<>();
        for (List<String> list : fc) {
            sets.add(new HashSet<>(list)); // Convert to HashSet
        }

        // Result to store indices
        List<Integer> res = new ArrayList<>();

       
        for (int i = 0; i < sets.size(); i++) {
            boolean isSubset = false;
            for (int j = 0; j < sets.size(); j++) {
                if (i != j && sets.get(j).size() >= sets.get(i).size()) { // Avoid unnecessary checks
                    if (sets.get(j).containsAll(sets.get(i))) {
                        isSubset = true;
                        break;
                    }
                }
            }
            if (!isSubset) { // Add index if not a subset
                res.add(i);
            }
        }
        return res;
    }
}
