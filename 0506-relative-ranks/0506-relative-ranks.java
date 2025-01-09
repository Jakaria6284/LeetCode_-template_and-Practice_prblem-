class Solution {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer, Integer> map = new HashMap<>();

        // Map each score to its original index
        for (int i = 0; i < score.length; i++) {
            map.put(score[i], i);
        }

        // Sort the score array in ascending order
        Arrays.sort(score);

        // Reverse the order into scoree for descending
        int[] scoree = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            scoree[i] = score[score.length - 1 - i];
        }

        // Create the result array
        String[] nums = new String[score.length];

        // Assign ranks based on sorted order
        for (int i = 0; i < scoree.length; i++) {
            if (i == 0) {
                nums[map.get(scoree[i])] = "Gold Medal";
            } else if (i == 1) {
                nums[map.get(scoree[i])] = "Silver Medal";
            } else if (i == 2) {
                nums[map.get(scoree[i])] = "Bronze Medal";
            } else {
                nums[map.get(scoree[i])] = String.valueOf(i + 1);
            }
        }

        return nums;
    }
}
