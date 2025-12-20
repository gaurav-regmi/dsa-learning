package easyquestions.searching.easy.validPerfectSquare_5;


// https://leetcode.com/problems/valid-perfect-square/description/
public class Solution {

    public static void main(String[] args) {
        int num = 100;

        System.out.println(isPerfectSquare(num));
    }

    private static boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;

        while (start <= end) {

            int middle = start + (end - start) / 2;
            int sqrt = middle * middle;

            if (sqrt == num) {
                return true;
            } else if (sqrt > num) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }

        return false;
    }
}
