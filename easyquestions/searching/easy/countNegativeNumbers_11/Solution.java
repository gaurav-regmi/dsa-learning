package easyquestions.searching.easy.countNegativeNumbers_11;

// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/
public class Solution {

    public static void main(String[] args) {

        int[][] grid = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};

        System.out.println(countNegatives(grid));
    }

    private static int countNegatives(int[][] grid) {
        int end = grid[0].length - 1;
        int count = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = grid[row].length - 1; col >= 0; col--) {
                if (grid[end][col] < 0) {
                    count++;
                } else {
                    break;
                }
            }
            end--;
        }

        return count;
    }
}
