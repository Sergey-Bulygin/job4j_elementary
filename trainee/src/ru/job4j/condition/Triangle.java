package ru.job4j.condition;

/**
 * Class Triangle.
 * @author sbulygin.
 * @since 22.03.2020.
 * @version 1.0.
 */
public class Triangle {

    /**
     * The method checks whether it is possible to construct a triangle with such side lengths.
     * @param ab distance between points a b.
     * @param ac distance between points a c.
     * @param bc distance between points b c.
     * @return boolean result.
     */
    public static boolean exist(double ab, double ac, double bc) {
        return (ab > 0 && ac > 0 && bc > 0 && ((ab + ac) != bc) && ((ac + bc) != ab) && ((ab + bc) != ac));
    }
}
