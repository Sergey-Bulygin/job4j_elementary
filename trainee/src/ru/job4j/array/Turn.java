package ru.job4j.array;

/**
 * Class   Turn
 * Created 02/04/2020 - 16:19
 * Project job4j_elementary
 * Author  Sergey Bulygin
 */
public class Turn {
    /**
     * Method flips the array.
     * @param array array.
     * @return inverted array.
     */
    public static int[] back(int[] array) {
        for (int index = array.length / 2 - 1; index >= 0; index--) {
            int temp = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = temp;
        }
        return array;
    }
}
