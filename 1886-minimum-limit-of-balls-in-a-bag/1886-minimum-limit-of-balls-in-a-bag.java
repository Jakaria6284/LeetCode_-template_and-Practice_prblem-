class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        // The lower bound for penalty is 1, the upper bound is the maximum number in nums.
        int start = 1;
        int end = getMax(nums);
        int result = end;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (canAchievePenalty(nums, mid, maxOperations)) {
                result = mid; // If we can achieve this penalty, try a smaller one
                end = mid - 1;
            } else {
                start = mid + 1; // If we can't achieve it, try a larger penalty
            }
        }
        
        return result;
    }
    
    // Helper function to determine if a given penalty can be achieved
    private boolean canAchievePenalty(int[] nums, int penalty, int maxOperations) {
        int operations = 0;
        
        for (int balls : nums) {
            // If a bag has more balls than the penalty, we need to split it
            if (balls > penalty) {
                // We calculate how many splits are required to reduce this bag's size
                // We want to reduce the size to less than or equal to penalty.
                // For example, if we have a bag with 'balls', and want to reduce its size
                // to be at most 'penalty', the number of operations required is:
                operations += (balls - 1) / penalty;
            }
            
            // If the operations exceed maxOperations, we can't achieve this penalty
            if (operations > maxOperations) {
                return false;
            }
        }
        
        return true;
    }
    
    // Helper function to get the maximum number of balls in any bag
    private int getMax(int[] nums) {
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }
}
