package ru.job4j.loop;

/**
 * Class Factorial.
 * @author sbulygin.
 * @since 27.03.2020.
 * @version 1.0.
 */
public class Factorial {
    /**
     * Method calculate the factorial of the number.
     * @param n the number.
     * @return factorial.
     */
    public static int calc(int n) {
        int result = 1;
        if (n == 0) {
            return result;
        }
        for (int i = n; i > 0; i--) {
            result *= i;
        }
        return result;
    }
    public static int calcRecursion(int n) {
        if (n == 0) {
            return 1;
        }
        return n * calc(n - 1);
    }
}
