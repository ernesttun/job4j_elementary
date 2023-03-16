package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[]{5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int excepted = 0;
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    public void whenArrayHas8Then3() {
        int[] data = new int[]{6, 9, 3, 8};
        int el = 8;
        int result = FindLoop.indexOf(data, el);
        int excepted = 3;
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    public void whenArrayHasNot4ThenMinus1() {
        int[] data = new int[]{2, 7, 9};
        int el = 4;
        int result = FindLoop.indexOf(data, el);
        int excepted = -1;
        assertThat(result).isEqualTo(excepted);
    }
}