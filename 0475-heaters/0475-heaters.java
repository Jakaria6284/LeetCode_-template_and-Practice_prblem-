import java.util.Arrays;

class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        // Sort the houses and heaters arrays
        Arrays.sort(houses);
        Arrays.sort(heaters);
        
        // Binary search to find the minimum radius
        int left = 0; int right = Math.max(
            Math.abs(houses[houses.length - 1] - heaters[0]),  // Farthest house from the first heater
            Math.abs(houses[0] - heaters[heaters.length - 1])   // Closest house from the last heater
        );
        int ans=-1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canCoverAllHouses(houses, heaters, mid)) {
                ans=mid;
                right = mid-1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    // Helper method to check if the given radius can cover all houses
    private boolean canCoverAllHouses(int[] houses, int[] heaters, int radius) {
        int heaterIndex = 0;
        for (int house : houses) {
            // Move to the next heater if the current heater can't cover this house
            while (heaterIndex < heaters.length && heaters[heaterIndex] + radius < house) {
                heaterIndex++;
            }

            // If no heater can cover this house
            if (heaterIndex >= heaters.length || heaters[heaterIndex] - radius > house) {
                return false;
            }
        }
        return true;
    }
}
