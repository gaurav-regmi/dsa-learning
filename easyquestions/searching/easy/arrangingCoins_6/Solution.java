package easyquestions.searching.easy.arrangingCoins_6;

// https://leetcode.com/problems/arranging-coins/description/
public class Solution {

    public static void main(String[] args) {


        int n = 8;

        System.out.println(arrangeCoins(n));
    }

    private static int arrangeCoins(int n) {
        int coins = 1;
        int completeRows = 0;
        while (n > 0) {
            if ((n - coins) >= 0) {
                completeRows++;
            }
            n = n - coins;
            coins++;
        }

        return completeRows;
    }
}
