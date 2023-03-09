package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n = 5;
        int rsl = Factorial.calc(n);
        int excepted = 120;
        assertThat(rsl).isEqualTo(excepted);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int n = 0;
        int rsl = Factorial.calc(n);
        int excepted = 1;
        assertThat(rsl).isEqualTo(excepted);
    }
}