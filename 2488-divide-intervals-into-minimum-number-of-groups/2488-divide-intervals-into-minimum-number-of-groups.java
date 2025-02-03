class Solution {
    public int minGroups(int[][] mat) {
        int arr[] = new int[1000001]; // Initialize array to track interval events
        int ans = 0;
        
        // Mark start and end of intervals
        for(int i = 0; i < mat.length; i++) {
            arr[mat[i][0]]++;          // Start event at lefti
            if (mat[i][1] + 1 < 1000001) {
                arr[mat[i][1] + 1]--;  // End event at righti + 1 (inclusive)
            }
        }
        
        int temp = 0; // Track number of active intervals
        
        // Sweep through the array to find the maximum overlap
        for(int i = 0; i < 1000001; i++) {
            temp += arr[i];   // Accumulate the number of active intervals at time i
            ans = Math.max(ans, temp); // Track the maximum number of overlapping intervals
        }
        return ans;
    }
}