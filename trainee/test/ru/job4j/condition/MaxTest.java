package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class MaxTest.
 * @author sbulygin
 * @version 1.0
 * @since 22.03.2020
 */
public class MaxTest {

    @Test
    public void whenFirstMoreSecondThenFirstMaximum() {
        int result = Max.findMaximum(4, 1);
        assertThat(result, is(4));
    }

    @Test
    public void whenSecondMoreFirstThenSecondMaximum() {
        int result = Max.findMaximum(10, 12);
        assertThat(result, is(12));
    }

    @Test
    public void whenSecondEqualsFirstThenAny() {
        int result = Max.findMaximum(7, 7);
        assertThat(result, is(7));
    }

    @Test
    public void whenThreeValueMoreFirst() {
        int result = Max.findMaximum(20, 8, 5);
        assertThat(result, is(20));
    }

    @Test
    public void whenThreeValueAndFirstEqualSecondMoreAny() {
        int result = Max.findMaximum(12, 12, 9);
        assertThat(result, is(12));
    }

    @Test
    public void whenFourValueAndFirstEqualSecondMoreAny() {
        int result = Max.findMaximum(12, 12, 9, 5);
        assertThat(result, is(12));
    }
}

