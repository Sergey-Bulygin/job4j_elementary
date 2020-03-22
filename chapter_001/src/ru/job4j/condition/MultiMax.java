package ru.job4j.condition;

/**
 * Class MultiMax.
 * @author sbulygin
 * @since 22.03.2020
 * @version 1.0
 */
public class MultiMax {

    /**
     * Maximum of three numbers.
     *
     * @param first  first numbers.
     * @param second second numbers.
     * @param third  third numbers.
     * @return maximum number.
     */
    public int max(int first, int second, int third) {
        int result = first > second ? first : second;
        return result > third ? result : third;
    }


}
