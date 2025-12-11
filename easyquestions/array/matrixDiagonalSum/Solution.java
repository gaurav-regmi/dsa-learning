package easyquestions.array.matrixDiagonalSum;

// https://leetcode.com/problems/matrix-diagonal-sum/description/
public class Solution {

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        System.out.println(diagonalSum(mat));
    }

    private static int diagonalSum(int[][] mat) {

        int sum = 0;

        int start = 0;
        int end = mat.length - 1;
        for (int row = 0; row < mat.length; row++) {
            if (start == end) {
                sum += mat[row][start];
                start++;
                end--;
            } else if (start < end) {
                sum += mat[row][start] + mat[row][end];
                start++;
                end--;
            } else {
                int temp = start;
                start = end;
                end = temp;
                sum += mat[row][start] + mat[row][end];
            }
        }

        return sum;
    }
}
