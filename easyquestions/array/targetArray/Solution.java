package easyquestions.array.targetArray;

import easyquestions.PrintArray;

//https://leetcode.com/problems/create-target-array-in-the-given-order/description/
public class Solution {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};

        int[] nums2 = {1, 2, 3, 4, 0};
        int[] index2 = {0, 1, 2, 3, 0};

        int[] nums3 = {1};
        int[] index3 = {0};


        PrintArray.show(targetArray(nums3, index3));
    }

    private static int[] targetArray(int[] nums, int[] index) {
        int[] target = new int[index.length];

        for (int i = 0; i < index.length; i++) {
            if (index[i] < i) {
                for (int j = target.length - 1; j > index[i]; j--) {
                    target[j] = target[j - 1];
                }
                target[index[i]] = nums[i];
            } else {
                target[index[i]] = nums[i];
            }
        }

        return target;
    }
}
