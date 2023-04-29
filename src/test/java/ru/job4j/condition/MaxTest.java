package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax4To2Then4() {
        int left = 4;
        int right = 2;
        int result = Max.max(left, right);
        int excepted = 4;
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    public void whenMax1To5Then5() {
        int left = 1;
        int right = 5;
        int result = Max.max(left, right);
        int excepted = 5;
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    public void whenIdentical3To3Then3() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int excepted = 3;
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    public void whenMax4To6To8Then8() {
        int first = 4;
        int second = 6;
        int third = 8;
        int rsl = Max.max(first, second, third);
        int excepted = 8;
        assertThat(rsl).isEqualTo(excepted);
    }

    @Test
    public void whenMax5To7To9To11Then11() {
        int first = 5;
        int second = 7;
        int third = 9;
        int fourth = 11;
        int rsl = Max.max(first, second, third, fourth);
        int excepted = 11;
        assertThat(rsl).isEqualTo(excepted);
    }
}