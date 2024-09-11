class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int l = 0, maxFruits = 0;

        for (int r = 0; r < fruits.length; r++) {
            // Add the fruit at position r to the map
            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);

            // If we have more than 2 types of fruits, shrink the window
            while (map.size() > 2) {
                map.put(fruits[l], map.get(fruits[l]) - 1);
                if (map.get(fruits[l]) == 0) {
                    map.remove(fruits[l]); // Remove the fruit type when its count is zero
                }
                l++; // Move the left pointer
            }

            // Update the maximum number of fruits we can pick
            maxFruits = Math.max(maxFruits, r - l + 1);
        }

        return maxFruits;
    }
}
