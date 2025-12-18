package easyquestions.array.maxPoplnYear;

// https://leetcode.com/problems/maximum-population-year/description/
public class Solution {

    public static void main(String[] args) {
        int[][] logs = {{1950, 1961}, {1960, 1971}, {1970, 1981}};

        System.out.println(maxPopultaion(logs));
    }

    private static int maxPopultaion(int[][] logs) {

        int count = 0;
        int prevHighestCount = 0;
        int earliestYear = logs[0][0];

        while (count < logs.length) {
            int temp = 1;
            for (int row = 0; row < logs.length; row++) {
                if (row != count) {
                    if (validRange(logs[count][0], logs[row])) {
                        temp++;
                    }
                }

            }

            if (temp > prevHighestCount) {
                prevHighestCount = temp;
                earliestYear = logs[count][0];
            } else if (temp == prevHighestCount) {
                if (logs[count][0] < earliestYear) {
                    earliestYear = logs[count][0];
                }
            }

            count++;
        }

        return earliestYear;
    }

    private static boolean validRange(int startYear, int[] logRow) {

        if (startYear >= logRow[0] && startYear <= logRow[1]) {
            return true;
        }

        return false;
    }
}
