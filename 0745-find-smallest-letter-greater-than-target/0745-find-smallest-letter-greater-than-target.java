class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        int l = 0, r = letters.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (letters[mid] <= target) {
                l = mid + 1;  // Move the left boundary forward
            } else {
                r = mid - 1;  // Move the right boundary back
            }
        }

        // After the loop, if l is out of bounds, we need to wrap around to the first element
        if (l >= letters.length) {
            return letters[0];
        }

        return letters[l];
    }
}
