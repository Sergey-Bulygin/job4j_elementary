package ru.job4j.array;

import javax.imageio.metadata.IIOMetadataFormatImpl;

/**
 * Class   MinDiapason
 * Created 08/04/2020 - 7:07
 * Project job4j_elementary
 * Author  Sergey Bulygin
 */
public class MinDiapason {

    /**
     * The method searches for the minimum number in the range array.
     * @param array array of values.
     * @param start start range.
     * @param finish finish range.
     * @return value.
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int index = start; index <= finish; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        return min;
    }
}