package ru.job4j.array;

/**
 * Class   FindloopTest
 * Created 02/04/2020 - 14:28
 * Project job4j_elementary
 * Author  Sergey Bulygin
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindloopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas12ThenNoElement() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {15, 9, 78};
        int value = 12;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}
