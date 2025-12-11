package easyquestions.array.evenNoOfDigits;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class Solution {

    public static void main(String[] args) {

        int[] nums = {12, 345, 2, 6, 7896};

        System.out.println(checkEvenDigitsNumber(nums));
    }

    private static int checkEvenDigitsNumber(int[] nums) {
        int evenCount = 0;
        for (int num : nums) {
            int count = 0;
            while (num > 0) {
                num = num / 10;
                count++;
            }

            if (count % 2 == 0) {
                evenCount++;
            }
        }

        return evenCount;
    }
}
