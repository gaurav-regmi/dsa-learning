package easyquestions.array.runningSumOf1DArr;

import easyquestions.array.PrintArray;

// https://leetcode.com/problems/running-sum-of-1d-array/description/
public class Solution {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        int[] nums2 = {1, 1, 1, 1, 1};

        PrintArray.show(runningSum(nums2));

    }

    private static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] + nums[i];
        }

        return ans;
    }
}
