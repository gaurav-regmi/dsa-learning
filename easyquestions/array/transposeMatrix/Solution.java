package easyquestions.array.transposeMatrix;


import easyquestions.PrintArray;

// https://leetcode.com/problems/transpose-matrix/description/
public class Solution {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        PrintArray.show(transpose(matrix));
    }

    private static int[][] transpose(int[][] matrix) {
            int matRow = matrix.length;
            int matCol=matrix[0].length;
            int[][] ans = new int[matCol][matRow];

            for (int row = 0; row < matRow; row++) {
                for (int col = 0; col < matCol; col++) {
                    ans[col][row] = matrix[row][col];
                }
            }

            return ans;
    }
}
