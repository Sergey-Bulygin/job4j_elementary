package ru.job4j.array;

/**
 * Class   ArrayChar
 * Created 02/04/2020 - 16:53
 * Project job4j_elementary
 * Author  Sergey Bulygin
 */
public class ArrayChar {
    /**
     * This method checks that the word
     * begins with a specific sequence.
     * @param word array char.
     * @param pref array char.
     * @return boolean result.
     */
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < pref.length; index++) {
            if (word[index] != pref[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
