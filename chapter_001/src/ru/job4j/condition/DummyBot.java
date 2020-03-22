package ru.job4j.condition;

/**
 * Class DummyBot.
 * @author sbulygin.
 * @since 22.03.2020.
 * @version 1.0.
 */
public class DummyBot {
    /**
     * Answers the questions.
     * @param question Question from the client.
     * @return Answer.
     */
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Спросите другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }


}
