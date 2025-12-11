package easyquestions.array.countItemsMatchingRule;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/count-items-matching-a-rule/description/
public class Solution {

    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(List.of("phone", "blue", "pixel"));
        items.add(List.of("computer", "silver", "lenovo"));
        items.add(List.of("phone", "gold", "iphone"));

        String ruleKey = "color";
        String ruleValue = "silver";

        System.out.println(countMatches(items, ruleKey, ruleValue));
    }

    private static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int checkIndex = getCheckIndex(ruleKey);

        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(checkIndex).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }

    private static int getCheckIndex(String ruleKey) {
        if (ruleKey.equals("type")) {
            return 0;
        } else if (ruleKey.equals("color")) {
            return 1;
        }

        return 2;
    }
}
