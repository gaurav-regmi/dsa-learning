package easyquestions.searching.easy.searchInsertPosition_09;


// https://leetcode.com/problems/search-insert-position/description/
public class Solution {

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 6};
        int target = 4;

        System.out.println(searchInsert(nums, target));
    }

    private static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }
}
