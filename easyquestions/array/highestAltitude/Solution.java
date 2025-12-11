package easyquestions.array.highestAltitude;

// https://leetcode.com/problems/find-the-highest-altitude/description/
public class Solution {
    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};

        System.out.println(calculate(gain));
    }

    private static int calculate(int[] gain) {
        int altitude = 0;
        int highestAltitude = 0;
        for (int num : gain) {
            altitude += num;

            if (altitude > highestAltitude) {
                highestAltitude = altitude;
            }
        }

        return highestAltitude;
    }
}
