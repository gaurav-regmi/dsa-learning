package easyquestions.array.kidsWithGreatesNumbersOfCandies;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
public class Solution {

    public static void main(String[] args) {

        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        System.out.println(greatestCandies(candies, extraCandies));
    }

    private static List<Boolean> greatestCandies(int[] candies, int extraCandies) {
        int maxCandy = candies[0];

        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > maxCandy) {
                maxCandy = candies[i];
            }
        }

        List<Boolean> maxCandiesArr = new ArrayList<>(candies.length);

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= maxCandy) {
                maxCandiesArr.add(true);
            }
        }

        return maxCandiesArr;
    }
}
