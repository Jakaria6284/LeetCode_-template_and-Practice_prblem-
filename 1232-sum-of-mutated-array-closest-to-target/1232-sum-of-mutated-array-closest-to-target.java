public class Solution {
    public int findBestValue(int[] arr, int target) {
        Arrays.sort(arr);  // Sort the array

        int left = 0;  // Minimum possible value
        int right = arr[arr.length - 1];  // Maximum possible value
        int bestValue = right;  // To store the best result
        int minDifference = Integer.MAX_VALUE;  // To keep track of the smallest difference

        while (left <= right) {
            int mid = (left + right) / 2;  // Middle value to test
            int sum = getSumWithCap(arr, mid);  // Sum after capping values

            // Update the best value if current sum is closer to target
            if (Math.abs(sum - target) < minDifference) {
                minDifference = Math.abs(sum - target);
                bestValue = mid;
            } else if (Math.abs(sum - target) == minDifference && mid < bestValue) {
                bestValue = mid;
            }

            // Adjust the search range based on sum comparison
            if (sum > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return bestValue;
    }

    // Calculate sum with values capped at 'value'
    private int getSumWithCap(int[] arr, int cap) {
        int sum = 0;
        for (int num : arr) {
            sum += Math.min(num, cap);  // Add capped value to sum
        }
        return sum;
    }
}
