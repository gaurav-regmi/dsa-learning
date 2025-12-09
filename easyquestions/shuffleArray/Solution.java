package easyquestions.shuffleArray;

import easyquestions.PrintArray;

// https://leetcode.com/problems/shuffle-the-array/description/
public class Solution {

    public static void main(String[] args) {

        int[] nums = {2, 5, 1, 3, 4, 7};
        int[] nums2 = {1,2,3,4,4,3,2,1};
        int[] nums3 = {1,1,2,2};
        int n = 2;


        PrintArray.show(shuffleArray(nums3, n));
    }

    private static int[] shuffleArray(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int index = 0;
        for (int i = 0; i < n; i++) {
            ans[index] = nums[i];
            ans[index + 1] = nums[i + n];
            index = index + 2;
        }

        return ans;
    }
}
