package ru.job4j.array;

/**
 * Class   FindLoop
 * Created 02/04/2020 - 14:27
 * Project job4j_elementary
 * Author  Sergey Bulygin
 */
public class FindLoop {

    /**
     * The method looks up the index of the element
     * in the array; otherwise, it returns -1.
     * @param data array.
     * @param el desired item.
     * @return index.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
