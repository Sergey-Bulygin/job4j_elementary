package ru.job4j.array;

/**
 * Class   Min
 * Created 08/04/2020 - 6:59
 * Project job4j_elementary
 * Author  Sergey Bulygin
 */
public class Min {

    /**
     * The method searches for the minimum number in the array.
     * @param array array of values.
     * @return minimum value.
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (min > index) {
                min = array[index];
            }
        }
        return min;
    }
}
