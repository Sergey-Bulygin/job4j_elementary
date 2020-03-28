package ru.job4j.loop;

/**
 * Class Fitness.
 * @author sbulygin.
 * @since 28.03.2020.
 * @version 1.0.
 */
public class Fitness {

    /**
     * Culculate protein diet.
     * @param ivan traction force Ivan.
     * @param nik traction force Nikolai.
     * @return month.
     */
    public int calc(int ivan, int nik) {
        int month = 0;
        while (ivan < nik) {
            ivan *= 3;
            nik *= 2;
            month++;
        }
        return month;
    }
}
