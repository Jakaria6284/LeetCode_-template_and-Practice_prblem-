import java.util.Arrays;

class Solution {
    public int numFriendRequests(int[] ages) {
        Arrays.sort(ages);  // Sort the ages array
        int count = 0;

        for (int i = 0; i < ages.length; i++) {
            int ageX = ages[i];  // Current age (sender)

            // Lower bound: Binary search for the first valid age that satisfies ageY > 0.5 * ageX + 7
            int low = binarySearch(ages, 0.5 * ageX + 7);
            
            // Upper bound: Binary search for the first age where ageY > ageX
            int high = binarySearch(ages, ageX);
            
            // If valid range exists, count the number of friend requests
            if (high > low) {
                count += (high - low);
                
                // Exclude self requests (ageX sending to itself)
                if (ages[i] == ageX) {
                    count--; // Decrement for the self-request
                }
            }
        }

        return count;
    }

    private int binarySearch(int[] ages, double target) {
        int left = 0, right = ages.length;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (ages[mid] <= target) {
                left = mid + 1;  // If mid element <= target, look in the right half
            } else {
                right = mid;  // If mid element > target, look in the left half
            }
        }
        
        return left;  // Left will point to the first element greater than target
    }
}
