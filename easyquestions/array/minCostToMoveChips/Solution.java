package easyquestions.array.minCostToMoveChips;

// https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/description/
public class Solution {

    public static void main(String[] args) {

        int[] position = {2,2,2,3,3};

        System.out.println(minCostToMoveChips(position));
    }

    private static int minCostToMoveChips(int[] position) {

        int oddCount = 0;
        int evenCount = 0;

        for (int num : position) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        if (evenCount > oddCount) {
            return oddCount;
        } else {
            return evenCount;
        }
    }
}
