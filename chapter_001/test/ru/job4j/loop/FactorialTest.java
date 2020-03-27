package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class FactorialTest.
 * @author sbulygin.
 * @since 27.03.2020.
 * @version 1.0.
 */
public class FactorialTest {
    /**
     * Test method calc, n = 5;
     */
    @Test
    public void whenNumberFiveThenResultOneHundredAndTwenty() {
        int result = Factorial.calc(5);
        int expect = 120;
        assertThat(result, is(expect));
    }

    /**
     * Test method calc, n = 0;
     */
    @Test
    public void whenNumberZeroThenResultOne() {
        int result = Factorial.calc(0);
        int expect = 1;
        assertThat(result, is(expect));
    }

    /**
     * Test recursion method calcRecursion, n = 5;
     */
    @Test
    public void whenNumberFiveRecursionMethodThenResultOneHundredAndTwenty() {
        int result = Factorial.calcRecursion(5);
        int expect = 120;
        assertThat(result, is(expect));
    }
    /**
     * Test method calc, n = 0;
     */
    @Test
    public void whenNumberZeroRecursionMethodThenResultOne() {
        int result = Factorial.calcRecursion(0);
        int expect = 1;
        assertThat(result, is(expect));
    }
}
