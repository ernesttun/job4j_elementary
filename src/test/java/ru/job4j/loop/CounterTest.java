package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int rsl = Counter.sumByEven(start, finish);
        int excepted = 30;
        assertThat(rsl).isEqualTo(excepted);
    }

    @Test
    public void whenSumEvenNumbersFromNineToTwentyThenNinety() {
        int start = 9;
        int finish = 20;
        int rsl = Counter.sumByEven(start, finish);
        int excepted = 90;
        assertThat(rsl).isEqualTo(excepted);
    }
}