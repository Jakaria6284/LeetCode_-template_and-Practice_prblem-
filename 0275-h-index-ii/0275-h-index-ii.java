class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int l = 0, r = n - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            
            // We calculate how many papers have citations >= citations[mid]
            if (citations[mid] >= n - mid) {
                r = mid - 1;  // Move left to find a larger h-index
            } else {
                l = mid + 1;  // Move right as current mid can't be h-index
            }
        }

        return n - l;  // h-index is the number of papers with at least h citations
    }
}
