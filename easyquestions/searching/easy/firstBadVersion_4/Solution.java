package easyquestions.searching.easy.firstBadVersion_4;

// https://leetcode.com/problems/first-bad-version/
public class Solution {

    public static void main(String[] args) {
        int n = 5;

        System.out.println(firstBadVersion(n));
    }

    private static int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int tempBadVersion = 0;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (BadVersion.isBadVersion(middle)) {
                end = middle - 1;
                tempBadVersion = middle;
            } else {
                start = middle + 1;
            }
        }

        return tempBadVersion;
    }
}
