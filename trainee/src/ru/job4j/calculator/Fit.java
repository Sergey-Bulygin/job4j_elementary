package ru.job4j.calculator;

/**
 * Class   Fit
 * Created 19/08/2020 - 12:18
 * Project job4j_elementary
 * Author  Sergey Bulygin
 */
public class Fit {
    /**
     * CONST_MAN field.
     */
    private static final int CONST_MAN = 100;

    /**
     * CONST_WOMAN field.
     */
    private static final int CONST_WOMAN = 110;

    /**
     * Ideal weight for a man.
     * @param height growth.
     * @return ideal weight.
     */
    public double manWeight(double height) {
        return (height - CONST_MAN) * 1.15;
    }

    /**
     * Ideal weight for a woman.
     * @param height growth.
     * @return ideal weight.
     */
    public double womanWeight(double height) {
        return (height - CONST_WOMAN) * 1.15;
    }
}
