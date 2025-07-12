// link : https://leetcode.com/problems/set-matrix-zeroes/
class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int colm = matrix[0].length;
        boolean[] rowArr = new boolean[row];
        boolean[] colmArr = new boolean[colm];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colm; j++) {
                if (matrix[i][j] == 0) {
                    rowArr[i] = true;
                    colmArr[j] = true;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            if (rowArr[i]) {
                for (int j = 0; j < colm; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < colm; i++) {
            if (colmArr[i]) {
                for (int j = 0; j < row; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
    }
}
time complexity : O(m*n)
space complexity : O(m+n)
