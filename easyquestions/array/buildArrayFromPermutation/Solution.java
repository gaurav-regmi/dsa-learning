package easyquestions.array.buildArrayFromPermutation;

import easyquestions.array.PrintArray;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] nums2 = {5, 0, 1, 2, 3, 4};

        PrintArray.show(buildFromPermutation(nums2));
    }

    private static int[] buildFromPermutation(int[] nums) {
        int[] permArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            permArr[i] = nums[nums[i]];
        }

        return permArr;

    }
}
