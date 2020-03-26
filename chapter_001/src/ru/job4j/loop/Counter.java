package ru.job4j.loop;

/**
 * Class Counter.
 * @author sbulygin.
 * @since 26.03.2020.
 * @version 1.0.
 */
public class Counter {

    /**
     * The method adds all values in the range.
     * @param start start value.
     * @param finish finish value
     * @return result.
     */
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int index = start; index <= finish; index++) {
            sum = sum + index;
        }
        return sum;
    }
    /**
     * The method adds all even values in the range.
     * @param start start value.
     * @param finish finish value
     * @return result.
     */
    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int index = start; index <= finish; index++) {
            if (index % 2 == 0) {
                sum += index;
            }
        }
        return sum;
    }
}
