package easyquestions.array.smallerThanCurrentNumber;

import easyquestions.PrintArray;

// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
public class Solution {

    public static void main(String[] args) {

        int[] nums = {8, 1, 2, 2, 3};

        PrintArray.show(smallerNumber(nums));
    }

    private static int[] smallerNumber(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] > nums[j]) {
                        count++;
                    }
                }
            }
            ans[i] = count;
        }

        return ans;
    }
}
