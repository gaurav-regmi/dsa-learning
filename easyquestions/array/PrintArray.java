package easyquestions.array;

public class PrintArray {

    public static void show(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void show(int[][] arr) {
        for (int[] row : arr) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void show(int num) {
        System.out.println(num);
    }
}
