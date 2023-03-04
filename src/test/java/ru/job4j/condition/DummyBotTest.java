package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        String in = "Hi, Bot.";
        String result = DummyBot.answer(in);
        String excepted = "Hi, SmartAss.";
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    public void whenByeBot() {
        String in = "Bye.";
        String result = DummyBot.answer(in);
        String excepted = "See you later.";
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    public void whenUnknownBot() {
        String in = "Can you swim ?";
        String result = DummyBot.answer(in);
        String excepted = "I don't know. Please, ask another question.";
        assertThat(result).isEqualTo(excepted);
    }
}