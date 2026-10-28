class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length - 1;
        int col = 0;
        int n = matrix[0].length;

        while (row >= 0 && col < n) {
            if (matrix[row][col] == target) {
                return true;
            }

            if (matrix[row][col] > target) {
                row--;
            } else {
                col++;
            }
        }
        return false;
    }
}