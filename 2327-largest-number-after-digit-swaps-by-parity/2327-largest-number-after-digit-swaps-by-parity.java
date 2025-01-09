class Solution {
    public int largestInteger(int num) {

        PriorityQueue<Integer> pqEven = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pqOdd = new PriorityQueue<>(Collections.reverseOrder());

        String strNum = String.valueOf(num);
        StringBuilder str = new StringBuilder();
        int[] nums = new int[strNum.length()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Character.getNumericValue(strNum.charAt(i));
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                pqEven.offer(nums[i]);
            } else {
                pqOdd.offer(nums[i]);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                str.append(String.valueOf(pqEven.poll()));
            } else {
                str.append(String.valueOf(pqOdd.poll()));
            }
        }
        String ans = str.toString();
        return Integer.parseInt(ans);
    }
}