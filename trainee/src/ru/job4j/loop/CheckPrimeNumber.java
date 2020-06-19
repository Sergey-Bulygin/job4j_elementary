package ru.job4j.loop;

/**
 * Class CheckPrimeNumber.
 * @author sbulygin.
 * @since 28.03.2020.
 * @version 1.0.
 */
public class CheckPrimeNumber {

    /**
     * The method checks whether the number is prime or not.
     * @param number number.
     * @return boolean result/
     */
    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1) {
            prime = false;
        }
        for (int index = 2; index < number; index++) {
            if (number % index == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
