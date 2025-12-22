package easyquestions.searching.easy.insertionOfTwoArraysII_13;


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
        List<Integer> arrList = new ArrayList<>();

        for (int num : nums1) {
            arrList.add(num);
        }

        List<Integer> tempList = new ArrayList<>();
        int count = 0;

        while (count < nums2.length) {
            if (arrList.contains(nums2[count])) {
                arrList.remove((Integer) nums2[count]);
                tempList.add(nums2[count]);
            }
            count++;
        }


        int[] finalArr = new int[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            finalArr[i] = tempList.get(i);
        }

        return finalArr;
    }
}
