package ru.job4j.array;

/**
 * @author sergt
 * @created 02/04/2020 - 13:57
 * @project job4j_elementary
 */
public class Square {

    /**
     * The method fills the array with values ​​from 1
     * to the input parameter raised to a power.
     * @param bound last value in range from 1.
     * @return array of values.
     */
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int index = 0; index < bound; index++) {
            rst[index] = (int) Math.pow(index, 2);
        }
        return rst;
    }
}
