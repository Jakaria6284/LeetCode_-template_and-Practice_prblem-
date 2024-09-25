class Solution {
    public double myPow(double x, int n) {
        // Use a long type to handle potential overflow when negating n
        long N = n; // Use long to avoid overflow
        if (N == 0) return 1; // Any number to the power of 0 is 1

        if (N < 0) {
            x = 1 / x; // Invert x for negative exponent
            N = -N; // Make N positive
        }

        double ans = 1.0; // Initialize result

        // Iteratively calculate x^N
        while (N > 0) {
            // If N is odd, multiply ans by x
            if (N % 2 == 1) {
                ans *= x;
            }
            // Square x and halve N
            x *= x;
            N /= 2;
        }

        return ans; // Return the final result
    }
}
