package ru.job4j.array;

/**
 * Class   Defragment
 * Created 08/04/2020 - 9:31
 * Project job4j_elementary
 * Author  Sergey Bulygin
 */
public class Defragment {

    /**
     * Method moves the filled cells of the array to the beginning, and empty to the end.
     * @param array array.
     * @return array.
     */
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index + 1;
                while (point < array.length) {
                    if (array[point] != null) {
                        array[index] = array[point];
                        array[point] = null;
                        break;
                    }
                    point++;
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
