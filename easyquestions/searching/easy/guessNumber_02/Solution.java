package easyquestions.searching.easy.guessNumber_02;

// https://leetcode.com/problems/guess-number-higher-or-lower/
public class Solution {

    // Note guess function is provided in leetcode which we can use to guess first then we have to calculate
    public static void main(String[] args) {

        int n = 2;

        System.out.println(guessNumber(n));
    }

    private static int guessNumber(int n) {
        int start = 1;
        int end = n;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            int tempGuess = GuessAPI.guess(middle);

            if (tempGuess == 0) {
                return middle;
            } else if (tempGuess > 0) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        return -1;

    }
}
