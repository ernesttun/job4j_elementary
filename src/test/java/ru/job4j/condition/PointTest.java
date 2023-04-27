package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PointTest {

    @Test
    public void when00to20then2() {
        double excepted = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double rsl = a.distance(b);
        assertThat(rsl).isEqualTo(excepted);
    }

    @Test
    public void when21to21then0() {
        double excepted = 0;
        Point a = new Point(2, 1);
        Point b = new Point(2, 1);
        double rsl = a.distance(b);
        assertThat(rsl).isEqualTo(excepted);
    }

    @Test
    public void when64To54then1() {
        double excepted = 1;
        Point a = new Point(6, 4);
        Point b = new Point(5, 4);
        double rsl = a.distance(b);
        assertThat(rsl).isEqualTo(excepted);
    }

}