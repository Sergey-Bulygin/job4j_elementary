package ru.job4j.array;

/**
 * @author sergt
 * @created 02/04/2020 - 13:57
 * @project job4j_elementary
 */
public class Square {
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int index = 0; index < bound; index++) {
            rst[index] = (int) Math.pow(index, 2);
        }
        return rst;
    }
}
