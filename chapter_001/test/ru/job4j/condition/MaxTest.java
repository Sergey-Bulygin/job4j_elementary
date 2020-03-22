package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class MaxTest
 *
 * @author sbulygin
 * @version 1.0
 * @since 31.10.18
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


}

