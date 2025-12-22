package easyquestions.searching.easy.kthMissingPositiveNumber_08;


// https://leetcode.com/problems/kth-missing-positive-number/description/
public class Solution {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;

        System.out.println(findKthPositive(arr, k));
    }

    private static int findKthPositive(int[] arr, int k) {
        int n = 0;
        int count = 0;
        int checkNumber = 1;
        while (count < k) {
            if (n < arr.length) {
                if (checkNumber != arr[n]) {
                    checkNumber++;
                    count++;
                } else {
                    checkNumber++;
                    n++;
                }
            } else {
                checkNumber++;
                count++;
            }
        }

        return checkNumber - 1;
    }
}
