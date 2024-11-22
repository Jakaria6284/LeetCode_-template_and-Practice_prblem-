class Solution {
    public String smallestNumber(String pattern) {

        Stack<String> stack = new Stack();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i <= pattern.length(); i++) {
            stack.push(String.valueOf(i + 1));
            if (i < pattern.length()) {
                if (pattern.charAt(i) == 'I') {
                    while (!stack.isEmpty()) {
                        str.append(stack.pop());
                    }
                }
            }

        }

        if (stack.size() != 0) {
            while (!stack.isEmpty()) {
                str.append(stack.pop());
            }
        }

        return str.toString();

    }
}