class Solution {
    public int maximum69Number(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '6') {
                arr[i] = '9'; // Replace the first '6' with '9'
                break; // Stop after the first replacement
            }
        }
        return Integer.parseInt(new String(arr)); // Convert back to int
    }
}
