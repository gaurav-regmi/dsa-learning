package easyquestions.array.plusone;

import java.util.Scanner;

public class PlusOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        printArray(plus(arr));
    }

    private static void printArray(int[] plus) {
        for (int i : plus) {
            System.out.print(i + " ");
        }
    }

    private static int[] plus(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                return digits;
            }

            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;

    }
}
