package easyquestions.array.addToArrayFormInteger;

import easyquestions.PrintArray;

import java.util.*;

// https://leetcode.com/problems/add-to-array-form-of-integer/description/
public class Solution {

    public static void main(String[] args) {
        int[] num = {2, 7, 4};
        int k = 181;

        PrintArray.show(addToArrayForm(num, k));
    }

    private static List<Integer> addToArrayForm(int[] num, int k) {
        int carry = 0;
        int numIndex = num.length - 1;
        List<Integer> finalArr = new ArrayList<>();

        while (k > 0) {
            int rem = k % 10;
            k = k / 10;

            if (numIndex >= 0) {
                int sum = num[numIndex] + rem + carry;
                if (sum > 9) {
                    int temp = sum % 10;
                    finalArr.add(temp);
                    carry = 1;
                } else {
                    finalArr.add(sum);
                    carry = 0;
                }
            } else {
                int sum = rem + carry;
                if (sum > 9) {
                    int temp = sum % 10;
                    finalArr.add(temp);
                    carry = 1;
                } else {
                    finalArr.add(sum);
                    carry = 0;
                }
            }

            numIndex--;
        }

        while (numIndex >= 0) {
            if (carry > 0) {
                int val = num[numIndex] + carry;

                if (val > 9) {
                    int tempVal = val % 10;
                    finalArr.add(tempVal);
                    carry = 1;
                } else {
                    finalArr.add(val);
                    carry = 0;
                }

            } else {
                finalArr.add(num[numIndex]);
            }

            numIndex--;
        }

        if (carry > 0) {
            finalArr.add(carry);
        }

        Collections.reverse(finalArr);
        return finalArr;
    }
}
