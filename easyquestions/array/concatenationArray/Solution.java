package easyquestions.array.concatenationArray;

import easyquestions.PrintArray;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int[] nums2 = {1, 3, 2, 1};

        PrintArray.show(concatArr(nums2));
    }

    private static int[] concatArr(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }

        return ans;
    }
}
