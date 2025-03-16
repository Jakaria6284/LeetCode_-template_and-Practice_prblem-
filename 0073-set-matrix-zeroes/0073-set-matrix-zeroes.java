class Solution {
    public void setZeroes(int[][] matrix) {
        int rowlen = matrix.length;
        int columnlen = matrix[0].length;

        boolean[] row = new boolean[rowlen];
        boolean[] column = new boolean[columnlen];

        // Step 1: Mark rows and columns that should be set to zero
        for (int i = 0; i < rowlen; i++) {
            for (int j = 0; j < columnlen; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        // Step 2: Set elements to zero based on the marked rows and columns
        for (int i = 0; i < rowlen; i++) {
            for (int j = 0; j < columnlen; j++) {
                if (row[i] || column[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
