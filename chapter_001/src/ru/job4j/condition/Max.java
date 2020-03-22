package ru.job4j.condition;

/**
 * Class Max.
 * @author sbulygin
 * @since 22.03.2020
 * @version 1.0
 */

public class Max {
    /**
     * Maximum of two numbers.
     *
     * @param fist   first numbers.
     * @param second second numbers.
     * @return maximum number.
     */
    public static int findMaximum(int fist, int second) {
        return fist > second ? fist : second;
    }


}
