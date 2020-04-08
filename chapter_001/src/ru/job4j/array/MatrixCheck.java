package ru.job4j.array;

/**
 * Class   MatrixCheck
 * Created 08/04/2020 - 8:59
 * Project job4j_elementary
 * Author  Sergey Bulygin
 */
public class MatrixCheck {

    /**
     * Method check row matrix.
     * @param board matrix.
     * @param row row.
     * @return boolean result.
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int index = 0; index < board.length; index++) {
            if (board[row][index] == (' ')) {
                result = false;
                break;
            }
        }
        return result;
    }
}
