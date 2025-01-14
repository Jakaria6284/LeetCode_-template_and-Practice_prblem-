import java.util.*;

class Pair {
    int value;
    char key;

    Pair(char key, int value) {
        this.key = key;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public char getKey() {
        return key;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class Solution {
    public String reorganizeString(String s) {
        Map<Character, Integer> mapp = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> Integer.compare(p2.getValue(), p1.getValue()));

        // Count the frequency of each character
        for (int i = 0; i < s.length(); i++) {
            mapp.put(s.charAt(i), mapp.getOrDefault(s.charAt(i), 0) + 1);
        }

        // Check if reorganization is impossible
        int maxFrequency = 0;
        for (int freq : mapp.values()) {
            maxFrequency = Math.max(maxFrequency, freq);
        }
        if (maxFrequency > (s.length() + 1) / 2) {
            return ""; // Impossible to reorganize
        }

        // Add all characters and their counts to the priority queue
        for (Map.Entry<Character, Integer> entry : mapp.entrySet()) {
            pq.add(new Pair(entry.getKey(), entry.getValue()));
        }

        StringBuilder str = new StringBuilder();
        Pair prev = null;

        while (!pq.isEmpty()) {
            Pair current = pq.poll();

            // Append the current character to the result
            str.append(current.getKey());
            current.setValue(current.getValue() - 1);

            // Add the previous pair back to the queue if it still has remaining frequency
            if (prev != null && prev.getValue() > 0) {
                pq.add(prev);
            }

            // Update the previous pair to the current one
            prev = current;
        }

        return str.toString();
    }
}
