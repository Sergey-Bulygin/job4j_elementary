package ru.job4j.loop;

/**
 * Class PrimeNumber.
 * @author sbulygin.
 * @since 28.03.2020.
 * @version 1.0.
 */
public class PrimeNumber {

    /**
     * Method counts the number of prime numbers
     * @param finish extreme value.
     * @return number of prime numbers.
     */
    public int calc(int finish) {
        int count = 0;
        for (int number = 2; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count++;
            }
        }
        return count;
    }
}
