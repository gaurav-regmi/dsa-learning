package easyquestions.safesquares;

import java.util.*;

public class safesquares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 8;
        char[][] chessBoard = new char[rows][rows];

        for (int i = 0; i < rows; i++) {
            String line = sc.nextLine();
            chessBoard[i] = line.toCharArray();
        }

        Map<Integer, List<Integer>> rooksMap = new HashMap<>();
        List<Integer> rooksMainList = new ArrayList<>();

        int rookRowIndex = 0;
        for (char[] row : chessBoard) {

            List<Integer> rooksList = new ArrayList<>();
            int index = 0;
            for (char c : row) {
                String rook = String.valueOf(c);

                if (rook.equals("R") && !rooksMainList.contains(index)) {
                    rooksList.add(index);
                    rooksMainList.add(index);
                }
                index++;
            }

            rooksMap.put(rookRowIndex, rooksList);
            rookRowIndex++;
        }

        int pennyMove = 0;

        for (Map.Entry<Integer, List<Integer>> entry : rooksMap.entrySet()) {

            List<Integer> rooksIndexes = entry.getValue();

            if (rooksIndexes.isEmpty()) {

                for (int i = 0; i < chessBoard.length; i++) {

                    if (!rooksMainList.contains(i)) {
                        pennyMove = pennyMove + 1;
                    }
                }
            }
        }

        System.out.println(pennyMove);
    }
}
