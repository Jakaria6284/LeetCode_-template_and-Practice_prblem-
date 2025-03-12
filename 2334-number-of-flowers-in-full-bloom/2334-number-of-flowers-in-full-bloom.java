import java.util.*;

class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int[] flower : flowers) {
            map.put(flower[0], map.getOrDefault(flower[0], 0) + 1); // Bloom start
            map.put(flower[1] + 1, map.getOrDefault(flower[1] + 1, 0) - 1); // Bloom end
        }

        // Compute prefix sum
        int count = 0;
        for (int key : map.keySet()) {
            count += map.get(key);
            map.put(key, count);
        }

        int[] result = new int[people.length];
        for (int i = 0; i < people.length; i++) {
            Integer key = map.floorKey(people[i]); // Find the closest time <= people[i]
            result[i] = (key == null) ? 0 : map.get(key);
        }

        return result;
    }
}
