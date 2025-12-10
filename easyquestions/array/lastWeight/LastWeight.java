package easyquestions.array.lastWeight;

import java.util.Scanner;

public class LastWeight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(lastWeight(arr));
    }


    private static int lastWeight(int[] stones) {

        int[] tempArr = stones;

        while (tempArr.length != 1) {
            tempArr = sortAndSmashArr(tempArr);
        }

        return tempArr[0];
    }

    private static int[] sortAndSmashArr(int[] tempArr) {
        int[] sortArr = new int[tempArr.length - 1];
        int max1 = tempArr[0];
        int max2 = tempArr[1];
        int max1Index = 0;
        int max2Index = 1;
        for (int i = 2; i < tempArr.length; i++) {
            int temp = tempArr[i];
            if (max1 > max2) {
                if (temp > max1) {
                    max2 = temp;
                    max2Index = i;
                } else if (temp > max2) {
                    max2 = temp;
                    max2Index = i;
                }
            } else if (max2 > max1) {
                if (temp > max2) {
                    max1 = temp;
                    max1Index = i;
                } else if (temp > max1) {
                    max1 = temp;
                    max1Index = i;
                }
            }
        }

        int newMax = 0;
        if (max1 > max2) {
            newMax = max1 - max2;
        } else {
            newMax = max2 - max1;
        }

        sortArr[0] = newMax;
        int index = 1;
        for (int j = 0; j < tempArr.length; j++) {
            if (j != max1Index) {
                if (j != max2Index) {
                    sortArr[index] = tempArr[j];
                    index++;
                }
            }
        }

        return sortArr;
    }
}
