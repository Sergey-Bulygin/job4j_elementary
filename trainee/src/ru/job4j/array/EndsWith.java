package ru.job4j.array;

/**
 * Class   EndsWith
 * Created 02/04/2020 - 17:20
 * Project job4j_elementary
 * Author  Sergey Bulygin
 */
public class EndsWith {
    /**
     * This method checks that the
     * word ends in a specific sequence.
     * @param word array char.
     * @param post array char.
     * @return boolean result.
     */
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = post.length - 1; index >= 0; index--) {
            if (word[index + word.length - post.length] != post[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
