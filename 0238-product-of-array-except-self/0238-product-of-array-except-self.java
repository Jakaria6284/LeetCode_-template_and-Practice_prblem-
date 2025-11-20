class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] product = new int[n];   // left product
        int[] product2 = new int[n];  // right product
        int[] finalAns = new int[n];  // final result

        int mul = 1;
        // Left to right
        for (int i = 0; i < n; i++) {
            product[i] = mul;
            mul = mul * nums[i];
        }

        mul = 1;
        // Right to left
        for (int j = n - 1; j >= 0; j--) {
            product2[j] = mul;
            mul = mul * nums[j];
        }

        // Multiply left product and right product
        for (int i = 0; i < n; i++) {
            finalAns[i] = product[i] * product2[i];
        }

        return finalAns;
    }
}
