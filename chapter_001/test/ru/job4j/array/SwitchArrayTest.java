package ru.job4j.array;

/**
 * Class   SwitchArrayTest
 * Created 02/04/2020 - 15:19
 * Project job4j_elementary
 * Author  Sergey Bulygin
 */
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap0to1() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {2, 1, 3, 4};
        int[] rsl = SwitchArray.swap(input, 0, 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwapBorder0to5() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] expect = {6, 2, 3, 4, 5, 1};
        int[] rsl = SwitchArray.swapBorder(input);
        assertThat(rsl, is(expect));
    }
}
