package easyquestions.twoSum;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(checkTwoSum()));
    }

    private static int[] checkTwoSum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target element:");
        int target = sc.nextInt();

        int index=0;
        int checkIndex=0;
        int[] finalArray = new  int[2];

        while(index < nums.length){
            if(index != checkIndex){
                int a = nums[index];
                int b = nums[checkIndex];
                int sum = a+b;

                if(sum == target){
                    finalArray[0]= index;
                    finalArray[1]= checkIndex;
                    return finalArray;
                }
            }

            checkIndex++;

            if(checkIndex == nums.length){
                checkIndex = 0;
                index++;
            }
        }

        return finalArray;
    }
}
