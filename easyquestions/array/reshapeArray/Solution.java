package easyquestions.array.reshapeArray;


import easyquestions.array.PrintArray;

// https://leetcode.com/problems/reshape-the-matrix/description/
public class Solution {

    public static void main(String[] args) {

        int[][] mat = {{1, 2}, {3, 4}};
        int r = 2;
        int c = 4;

        PrintArray.show(matrixReshape(mat, r, c));
    }

    private static int[][] matrixReshape(int[][] mat, int r, int c) {
        int totalData = 0;
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                totalData++;
            }
        }

        if (r > totalData) {
            return mat;
        }

        int reArrRowIndex = 0;
        int reArrColIndex = 0;
        int checkValue = totalData / r != 0 ? totalData / r : 1;

        if (r * checkValue > totalData) {
            return mat;
        }

        int[][] reArr = new int[r][checkValue];
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                reArr[reArrRowIndex][reArrColIndex] = mat[row][col];

                if (reArrColIndex < checkValue - 1) {
                    reArrColIndex++;
                } else {
                    reArrRowIndex++;
                    reArrColIndex = 0;
                }
            }
        }

        return reArr;
    }
}
