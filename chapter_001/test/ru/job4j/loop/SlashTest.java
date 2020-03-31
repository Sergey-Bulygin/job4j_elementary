package ru.job4j.loop;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class SlashTest.
 *
 * @author anonymous.
 * @version 1.0.
 * @since 31.03.2020.
 */
public class SlashTest {

    private String line;

    @Before
    public void setupTest() {
        line = System.getProperty("line.separator");
    }
    /**
     * Test method paint 3X3.
     */
    @Test
    public void whenPaintCrossWithWidthThreeAndHeightThreeThenStringWithThreeColsAndThreeRows() {
        String result = Slash.draw(3);
        String expected = String.format("0 0%s 0 %s0 0%s", line, line, line);
        assertThat(result, is(expected));
    }
    /**
     * Test method paint 5X5.
     */
    @Test
    public void whenPainCrossWithWidthFiveAndHeightFiveThenStringWithFiveColsAndFiveRows() {
        String result = Slash.draw(5);
        String expected = String.format("0   0%s 0 0 %s  0  %s 0 0 %s0   0%s", line, line, line, line, line);
        assertThat(result, is(expected));
    }
}
