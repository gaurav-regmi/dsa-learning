package easyquestions.searching.easy.fairCandySwap_14;


import easyquestions.PrintArray;

// https://leetcode.com/problems/fair-candy-swap/description/
public class Solution {

    public static void main(String[] args) {

        int[] aliceSizes = {1, 1};
        int[] bobSizes = {2, 2};

        PrintArray.show(fairCandySwap(aliceSizes, bobSizes));
    }

    private static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int[] shareArr = new int[2];
        shareArr[0] = aliceSizes[0];
        shareArr[1] = bobSizes[0];

        return shareArr;
    }
}
