package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class DummyBotTest.
 * @author sbulygin.
 * @since 22.03.2020.
 * @version 1.0.
 */
public class DummyBotTest {

    /**
     * Test greet answer.
     */
    @Test
    public void whenGreetBot() {
        assertThat(
                DummyBot.answer("Привет, Бот."),
                is("Привет, умник.")
        );
    }

    /**
     * Test byu answer.
     */
    @Test
    public void whenByuBot() {
        assertThat(
                DummyBot.answer("Пока."),
                is("До скорой встречи.")
        );
    }

    /**
     * Test unknown answer.
     */
    @Test
    public void whenUnknownBot() {
        assertThat(
                DummyBot.answer("Сколько будет 2 + 2?"),
                is("Это ставит меня в тупик. Спросите другой вопрос.")
        );
    }
}
