package easyquestions.array.removeDuplicatesSortedArray;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class Solution {

    public static void main(String[] args) {

        int[] nums = {1, 1, 2};
        int[] nums1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println(removeDuplicates(nums1));
    }

    private static int removeDuplicates(int[] nums) {
        int count = 1;
        int temp = nums[0];
        int tempIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            if (temp != nums[i]) {
                temp = nums[i];
                nums[tempIndex] = nums[i];
                count++;
                tempIndex++;
            }
        }

        return count;
    }
}
