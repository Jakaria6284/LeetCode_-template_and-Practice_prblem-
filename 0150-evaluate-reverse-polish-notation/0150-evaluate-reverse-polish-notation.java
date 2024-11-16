import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];

            // Check if the token is a valid number (including negative numbers)
            if (token.matches("-?\\d+")) {
                // Push the number (converted to integer) onto the stack
                stack.push(Integer.parseInt(token));
            } else {
                // Ensure there are at least two operands in the stack
                if (stack.size() < 2) {
                    // Return a default value to indicate invalid operation
                    return 0;  // You can choose another value if needed
                }

                // Pop two operands from the stack
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                // Perform the operation
                if (token.equals("+")) {
                    stack.push(operand1 + operand2);
                } else if (token.equals("-")) {
                    stack.push(operand1 - operand2);
                } else if (token.equals("*")) {
                    stack.push(operand1 * operand2);
                } else if (token.equals("/")) {
                    if (operand2 != 0) {
                        stack.push(operand1 / operand2);
                    } else {
                        // Handle division by zero by returning a default value
                        return 0;  // You can return another default value if needed
                    }
                }
            }
        }

        // If the stack doesn't have exactly one element, return a default value
        if (stack.size() != 1) {
            return 0;  // Invalid expression
        }

        // The final result is the only item left on the stack
        return stack.pop();
    }
}
