package easyquestions.array.matrixRotation;

// https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/description/
public class Solution {

    public static void main(String[] args) {

//        int[][] mat = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
//        int[][] target = {{1, 1, 1}, {0, 1, 0}, {0, 0, 0}};

        int[][] mat = {{0, 1}, {1, 1}};
        int[][] target = {{1, 0}, {0, 1}};

        System.out.println(findRotation(mat, target));
    }

    private static boolean findRotation(int[][] mat, int[][] target) {
        int[][] outputArr = new int[mat.length][mat.length];
        int count = 0;
        return rotateArr(mat, target, outputArr, count);
    }

    private static boolean rotateArr(int[][] mat, int[][] target, int[][] outputArr, int count) {
        int arrIndex = mat.length;
        int tempIndex = arrIndex - 1;
        int notMatchCount = 0;
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                outputArr[col][tempIndex] = mat[row][col];

                if (target[col][tempIndex] != mat[row][col]) {
                    notMatchCount++;
                }
            }
            tempIndex--;
        }

        if (notMatchCount == 0) {
            return true;
        }

        if (count == 3) {
            return false;
        }

        return rotateArr(outputArr, target, new int[mat.length][mat.length], count + 1);
    }
}
