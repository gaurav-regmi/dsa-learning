package easyquestions.searching.easy.insertionOfTwoArrays_12;


import easyquestions.PrintArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://leetcode.com/problems/intersection-of-two-arrays/description/
public class Solution {

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        PrintArray.show(intersection(nums1, nums2));
    }

    private static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> uniqueSet = new HashSet<>();

        for (int num : nums1) {
            uniqueSet.add(num);
        }

        List<Integer> tempList = new ArrayList<>();
        for (int val : nums2) {
            if (uniqueSet.contains(val)) {
                tempList.add(val);
                uniqueSet.remove(val);
            }
        }

        int[] finalArr = new int[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            finalArr[i] = tempList.get(i);
        }

        return finalArr;
    }
}
