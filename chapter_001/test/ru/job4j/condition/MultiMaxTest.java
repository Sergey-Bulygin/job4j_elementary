package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Class MultiMaxTest.
 * @author sbulygin
 * @version 1.0
 * @since 22.03.2020
 */
public class MultiMaxTest {

    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(9, 6, 7);
        assertThat(result, is(9));
    }

    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 12);
        assertThat(result, is(12));
    }

    @Test
    public void whenAllMax() {
        MultiMax check = new MultiMax();
        int result = check.max(5, 5, 5);
        assertThat(result, is(5));
    }
}
