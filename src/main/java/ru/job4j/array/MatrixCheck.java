package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board[row].length; cell++) {
                for (int index = 0; index <= board[row][cell]; index++) {
                    if (board[row][cell] == index) {
                        result = false;
                        break;
                    }
                }
            }

        }
        return result;
    }
}
