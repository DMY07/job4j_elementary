package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board[row].length; cell++) {
                if (board[row][cell] == 0) {
                    board[row][cell] = 1;
                    result = false;
                    break;
                }
            }
            }
        return result;
    }
}
