class Solution {
    public int leastInterval(char[] task, int n) {

        Map<Character, Integer> map = new HashMap<>();
        int time = 0;

        for (int i = 0; i < task.length; i++) {
            map.put(task[i], map.getOrDefault(task[i], 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(map.values());

        while (!pq.isEmpty()) {
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < n + 1; i++) {
                if (!pq.isEmpty()) {
                    int count = pq.poll();
                    count--;
                    if (count > 0)
                        list.add(count);
                }
                time++;
                if (pq.isEmpty() && list.isEmpty()) {
                    break;
                }

            }

            pq.addAll(list);

        }

        return time;

    }
}