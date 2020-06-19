package ru.job4j.array;

/**
 * Class   SortSelected
 * Created 08/04/2020 - 7:45
 * Project job4j_elementary
 * Author  Sergey Bulygin
 */
public class SortSelected {

    /**
     * Method sort array by selection.
     * @param data array.
     * @return sort array.
     */
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length);
            int temp = data[i];
            data[i] = data[index];
            data[index] = temp;
        }
        return data;
    }
}
