class Solution {
    public long minimumTime(int[] time, int totalTrips) {

        long start = 1; // We should start from 1 since time can't be 0
        long end = (long) 1e14; // Use a very large value as the upper bound
        long ans = -1;

        while (start <= end) {
            long mid = start + (end - start) / 2;

            if (isPossible(time, mid, totalTrips)) {
                ans = mid;
                end = mid - 1; // Try to minimize the time
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    boolean isPossible(int[] time, long mid, int totalTrips) {
        long total = 0;

        for (int i = 0; i < time.length; i++) {
            total += (mid / time[i]);

            // If we reach or exceed totalTrips early, no need to continue
            if (total >= totalTrips) {
                return true;
            }
        }

        return total >= totalTrips;
    }
}
