package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean rsl = true;
        for (int i = row; i < board.length; i++) {
            for (int j = 0; j < board[row].length; j++) {
                if (board[row][0] != board[row][j]) {
                    rsl = false;
                    break;
                }
            }
        }
        return rsl;
    }
}
