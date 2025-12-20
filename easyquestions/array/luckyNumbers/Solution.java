package easyquestions.array.luckyNumbers;

import easyquestions.PrintArray;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/
public class Solution {

    public static void main(String[] args) {

        int[][] matrix = {{7, 8}, {1, 2}};

        PrintArray.show(luckyNumbers(matrix));
    }

    private static List<Integer> luckyNumbers(int[][] matrix) {

        List<Integer> finalArr = new ArrayList<>();
        for (int row = 0; row < matrix.length; row++) {
            int minIndex = 0;
            boolean lucky = true;
            int minValue = matrix[row][0];
            for (int col = 0; col < matrix[row].length; col++) {
                if (col != 0) {
                    if (matrix[row][col] < minValue) {
                        minValue = matrix[row][col];
                        minIndex = col;
                    }
                }
            }

            for (int highRow = 0; highRow < matrix.length; highRow++) {
                if (minValue < matrix[highRow][minIndex]) {
                    lucky = false;
                    break;
                }
            }

            if (lucky) {
                finalArr.add(minValue);
            }
        }

        return finalArr;
    }
}
