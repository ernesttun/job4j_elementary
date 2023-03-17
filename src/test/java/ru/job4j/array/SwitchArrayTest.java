package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap3To2() {
        int[] input = {10, 16, 9, 7, 2, 4};
        int source = 3;
        int dest = 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] excepted = {10, 16, 7, 9, 2, 4};
        assertThat(result).containsExactly(excepted);
    }

    @Test
    public void whenSwap4To1() {
        int[] input = {4, 19, 54, 23, 10, 3};
        int source = 4;
        int dest = 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] excepted = {4, 10, 54, 23, 19, 3};
        assertThat(result).containsExactly(excepted);
    }
}