import java.math.BigInteger;

class Solution {
    public String multiply(String num1, String num2) {
        // Use BigInteger to avoid overflow
        BigInteger result1 = BigInteger.ZERO;
        BigInteger result2 = BigInteger.ZERO;

        // Convert num1 to a BigInteger
        for (int i = 0; i < num1.length(); i++) {
            int digit = num1.charAt(i) - '0';
            result1 = result1.multiply(BigInteger.TEN).add(BigInteger.valueOf(digit));
        }

        // Convert num2 to a BigInteger
        for (int i = 0; i < num2.length(); i++) {
            int digit = num2.charAt(i) - '0';
            result2 = result2.multiply(BigInteger.TEN).add(BigInteger.valueOf(digit));
        }

        // Multiply the two BigIntegers
        BigInteger res = result1.multiply(result2);

        // Convert result to a string
        return res.toString();
    }
}
