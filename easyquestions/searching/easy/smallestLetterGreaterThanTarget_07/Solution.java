package easyquestions.searching.easy.smallestLetterGreaterThanTarget_07;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class Solution {

    public static void main(String[] args) {

        char[] letters = {'c', 'f', 'j'};
        char target = 'z';

        System.out.println(nextGreatestLetter(letters, target));
    }

    private static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if (start < letters.length && letters[start] > target) {
            return letters[start];
        }

        return letters[0];
    }
}
