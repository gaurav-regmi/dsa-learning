package easyquestions.array.numberOfGoodPairs;

import easyquestions.array.PrintArray;

// https://leetcode.com/problems/number-of-good-pairs/description/
public class Solution {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1, 1, 3};

        PrintArray.show(goodPairs(nums));
    }

    private static int goodPairs(int[] nums) {
        int pairs = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    pairs++;
                }
            }
        }

        return pairs;
    }
}
