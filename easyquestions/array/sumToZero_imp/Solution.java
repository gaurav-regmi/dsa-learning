package easyquestions.array.sumToZero_imp;

import easyquestions.array.PrintArray;

// https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/description/
public class Solution {

    public static void main(String[] args) {

        int n = 4;

        PrintArray.show(sumZero(n));
    }

    private static int[] sumZero(int n) {
        int[] output = new int[n];
        int arrVal = 1;
        int middle = n / 2;

        if (n % 2 == 0) {
            for (int i = 0; i < n; i++) {
                if (i == middle) {
                    break;
                }

                output[i] = -1 * arrVal;
                output[i + middle] = arrVal;
                arrVal++;
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (i == middle) {
                    output[i] = 0;
                    break;
                } else {
                    output[i] = -1 * arrVal;
                    output[i + middle + 1] = arrVal;
                }
                arrVal++;
            }
        }

        return output;
    }
}
