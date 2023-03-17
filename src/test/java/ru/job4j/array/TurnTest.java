package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = {1, 2, 3, 4};
        int[] result = Turn.back(input);
        int[] excepted = {4, 3, 2, 1};
        assertThat(result).containsExactly(excepted);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] result = Turn.back(input);
        int[] excepted = {5, 4, 3, 2, 1};
        assertThat(result).containsExactly(excepted);
    }
}