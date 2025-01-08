class Solution {
    public int minimumRefill(int[] nums, int capacityA, int capacityB) {

        int i = 0;
        int j = nums.length - 1;
        int cnt = 0;

        int ca = capacityA;
        int cb = capacityB;

        while (i < j) {
            // Alice's turn
            if (nums[i] > ca) { // Need refill
                cnt++;
                ca = capacityA;
            }
            ca -= nums[i]; // Water the plant
            i++;

            // Bob's turn
            if (nums[j] > cb) { // Need refill
                cnt++;
                cb = capacityB;
            }
            cb -= nums[j]; // Water the plant
            j--;
        }

        // Handle the middle plant when odd-length
        if (i == j && Math.max(ca, cb) < nums[i]) {
            cnt++;
        }

        return cnt;
    }
}
