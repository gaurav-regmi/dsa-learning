package easyquestions.array.flippingImage;

import easyquestions.PrintArray;

// https://leetcode.com/problems/flipping-an-image/description/
public class Solution {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};

        PrintArray.show(flipImage(image));
    }

    private static int[][] flipImage(int[][] image) {
        int[][] flipArr = new int[image.length][];

        for (int row = 0; row < image.length; row++) {

            int flipArrRowIndex = 0;
            int[] flipImage = new int[image[row].length];

            for (int col = image[row].length - 1; col >= 0; col--) {
                if (image[row][col] == 1) {
                    flipImage[flipArrRowIndex] = 0;
                } else {
                    flipImage[flipArrRowIndex] = 1;
                }
                flipArrRowIndex++;
            }

            flipArr[row] = flipImage;
        }

        return flipArr;
    }
}
