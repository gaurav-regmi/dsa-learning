package easyquestions.searching.easy.sqrtOfx_1;

// https://leetcode.com/problems/sqrtx/description/
public class Solution {

    public static void main(String[] args) {

        int x = 4;

        System.out.println(mySqrt(x));
    }

    private static int mySqrt(int x) {

        if (x == 0) {
            return 0;
        }

        return (int) Math.sqrt(x);
    }
}
