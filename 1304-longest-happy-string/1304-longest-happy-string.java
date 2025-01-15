import java.util.PriorityQueue;

class Pair {
    int value;
    char key;

    Pair(char key, int value) {
        this.key = key;
        this.value = value;
    }
}

class Solution {
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> p2.value - p1.value);

        if (a > 0) pq.add(new Pair('a', a));
        if (b > 0) pq.add(new Pair('b', b));
        if (c > 0) pq.add(new Pair('c', c));

        StringBuilder result = new StringBuilder();

        while (!pq.isEmpty()) {
            Pair first = pq.poll();

        
            if (result.length() >= 2 &&
                result.charAt(result.length() - 1) == first.key &&
                result.charAt(result.length() - 2) == first.key) {
                if (pq.isEmpty()) break; 
                Pair second = pq.poll();
                result.append(second.key);
                if (--second.value > 0) pq.add(second);
                pq.add(first); 
            } else {
                result.append(first.key);
                if (--first.value > 0) pq.add(first);
            }
        }

        return result.toString();
    }
}
