class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0, j = 0;  // Pointers for nums1 and nums2
        int idx = 0;  // Pointer for the merged array

        int[] arr = new int[m + n];  // Temporary array to store merged values

        // Merge until one of the arrays is fully traversed
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                arr[idx] = nums1[i];  // Take element from nums1
                i++;
            } else {
                arr[idx] = nums2[j];  // Take element from nums2
                j++;
            }
            idx++;
        }

        // If there are remaining elements in nums1, copy them
        while (i < m) {
            arr[idx] = nums1[i];
            i++;
            idx++;
        }

        // If there are remaining elements in nums2, copy them
        while (j < n) {
            arr[idx] = nums2[j];
            j++;
            idx++;
        }

       for(int k=0;k<m+n;k++)
       {
        nums1[k]=arr[k];
       }
    }
}
