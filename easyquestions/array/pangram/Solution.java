package easyquestions.array.pangram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/check-if-the-sentence-is-pangram/
public class Solution {

    public static void main(String[] args) {

        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        System.out.println(checkPangram(sentence));
    }

    private static boolean checkPangram(String sentence) {

        String check = "abcdefghijklmnopqrstuvwxyz";

        for(char c: sentence.toCharArray()){
            if(check.indexOf(c) == -1){
                return false;
            }
        }

        return true;
    }
}
