package easyquestions.richestCustomer;

import easyquestions.PrintArray;

// https://leetcode.com/problems/richest-customer-wealth/description/
public class Solution {
    public static void main(String[] args) {

        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        int[][] accounts2 = {{1, 5}, {7, 3}, {3, 5}};

        PrintArray.show(richestCustomer(accounts2));
    }

    private static int richestCustomer(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int sum = 0;
            for (int amount : account) {
                sum += amount;
            }

            if (sum > ans) {
                ans = sum;
            }
        }

        return ans;
    }
}
