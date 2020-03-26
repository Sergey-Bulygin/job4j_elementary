package ru.job4j.condition;

/**
 * Class ThreeMax.
 * @author sbulygin
 * @since 22.03.2020
 * @version 1.0
 */
public class ThreeMax {
    /**
     * Maximum of tree numbers.
     * @param first first numbers.
     * @param second second numbers.
     * @param third third numbers.
     * @return maximum number.
     */
    public static int max(int first, int second, int third) {
        int result = third;
        if (first >= second && first > third) {
            result = first;
        }
        if (second > first && second > third) {
            result = second;
        }
        return result;
    }
}

