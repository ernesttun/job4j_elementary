package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 'X') {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean rsl = true;
        for (int i = column; i < board.length; i++) {
            for (int j = 0; j < board[column].length; j++) {
                if (board[j][column] != 'X') {
                    rsl = false;
                    break;
                }
            }
        }
        return rsl;
    }
}
