package ru.job4j.array;

/**
 * Class   Matrix
 * Created 08/04/2020 - 8:26
 * Project job4j_elementary
 * Author  Sergey Bulygin
 */
public class Matrix {

    /**
     * Multiplication table.
     * @param size size matrix.
     * @return table.
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table[0].length; column++) {
                table[row][column] = (column + 1) * (row + 1);
            }
        }
        return table;
    }
}
