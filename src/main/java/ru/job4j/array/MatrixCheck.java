package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean rsl = true;
        int count = 0;
        for (int index = 0; index < board[row].length; index++) {
                if (board[row][index] != 'X') {
                    rsl = false;
                    break;
                }
            }
        return rsl;
    }
}
