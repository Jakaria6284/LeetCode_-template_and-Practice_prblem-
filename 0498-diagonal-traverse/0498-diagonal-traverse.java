class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        Map<Integer, List<Integer>> map = new HashMap<>();
        int m = mat.length;
        int n = mat[0].length;
        int[] ans = new int[m * n];

        // Step 1: Store diagonals in the map
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (!map.containsKey(i + j)) {
                    map.put(i + j, new ArrayList<>());
                }
                map.get(i + j).add(mat[i][j]);
            }
        }

        // Step 2: Traverse the map and reverse alternative diagonals
        int index = 0;
        // boolean reverse = false; // \U0001f448 Moved outside the loop

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> list = entry.getValue();

            if (entry.getKey() % 2 == 0) {
                Collections.reverse(list);
            }
            for (int i = 0; i < list.size(); i++) {
                ans[index++] = list.get(i);
            }

            // reverse = !reverse; // \U0001f448 Toggle the flag
        }

        return ans;

    }
}
