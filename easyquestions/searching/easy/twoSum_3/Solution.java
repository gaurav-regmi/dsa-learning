package easyquestions.searching.easy.twoSum_3;

import easyquestions.PrintArray;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
public class Solution {

    public static void main(String[] args) {

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        PrintArray.show(twoSum(numbers, target));
    }

    private static int[] twoSum(int[] numbers, int target) {

        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int sum = numbers[start] + numbers[end];

            if (sum == target) {
                return new int[]{start + 1, end + 1};
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }

        return new int[]{-1, -1};
    }
}
