package ru.job4j.converter;

/**
 * Class   Converter
 * Created 19/08/2020 - 12:05
 * Project job4j_elementary
 * Author  Sergey Bulygin
 */
public class Converter {

    private static final int EVRORATE = 70;

    private static final int DOLLARRATE = 60;

    /**
     * Convert rubles into euros.
     *
     * @param value rubles.
     * @return Euro.
     */
    public int rubleToEuro(int value) {
        return  value / EVRORATE;
    }

    /**
     * Convert rubles into dollars.
     *
     * @param value rubles.
     * @return Dollars.
     */
    public int rubleToDollar(int value) {
        return  value / DOLLARRATE;
    }

    /**
     * Convert euros into rubles.
     *
     * @param value rubles.
     * @return Euro.
     */
    public int euroToRubles(int value) {
        return value * EVRORATE;
    }

    /**
     * Convert dollars into rubles.
     *
     * @param value rubles.
     * @return Euro.
     */
    public int dollarToRubles(int value) {
        return value * DOLLARRATE;
    }
}