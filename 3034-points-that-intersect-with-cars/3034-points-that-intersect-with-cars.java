class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        Collections.sort(nums, (a, b) -> Integer.compare(a.get(0), b.get(0)));
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.size(); i++) {
            List<Integer> list = nums.get(i);
            int start = list.get(0);
            int end = list.get(1);

            for (int j = start; j <= end; j++) {
                set.add(j);
            }

        }

        return set.size();

    }
}