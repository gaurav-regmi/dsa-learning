package easyquestions.array.cellsWithOddValuesMatrix;

import easyquestions.array.PrintArray;

// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/description/
public class Solution {

    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = {{0, 1}, {1, 1}};

        System.out.println(checkOddValues(m, n, indices));
    }

    static int checkOddValues(int m, int n, int[][] indices) {
        int[][] mat = new int[m][n];
        int countOdd = 0;
        for (int row = 0; row < indices.length; row++) {

            for (int col = 0; col < indices[row].length; col++) {
                int modificationValue = indices[row][col];
                int changedValue = 0;
                if (col == 0) {
                    //changing row
                    int rowIndex = 0;
                    while (rowIndex < n) {
                        changedValue = mat[modificationValue][rowIndex] + 1;
                        mat[modificationValue][rowIndex] = changedValue;
                        rowIndex++;
                    }
                } else {
                    //changing column
                    int colIndex = 0;
                    while (colIndex < m) {
                        changedValue = mat[colIndex][modificationValue] + 1;
                        mat[colIndex][modificationValue] = changedValue;
                        colIndex++;
                    }
                }
            }
        }

        for (int[] matRow : mat) {
            for (int matCol : matRow) {
                if (matCol % 2 != 0) {
                    countOdd++;
                }
            }
        }

        return countOdd;
    }
}
