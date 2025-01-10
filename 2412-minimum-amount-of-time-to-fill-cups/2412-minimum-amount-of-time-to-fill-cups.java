class Solution {
    public int fillCups(int[] amount) {
        int total = 0;
        for (int num : amount) {
            total += num;
        }
        if (total == 0) {
            return 0;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < amount.length; i++) {
            pq.offer(amount[i]);
        }

        int count = 0;
        while (pq.size() > 1) {
            int max1 = pq.poll() - 1;
            int max2 = pq.poll() - 1;
            count++;
            if (max1 > 0)
                pq.offer(max1);
            if (max2 > 0)
                pq.offer(max2);
        }
        int remain=0;
             while(!pq.isEmpty())
             {

              remain+=pq.poll();
             }
        int ans = remain + count;

        return ans;
    }
}