package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double excepted = 2;
        int x1 = 0;
        int x2 = 0;
        int y1 = 2;
        int y2 = 0;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(excepted, rsl, 0.01);
    }

    @Test
    public void when21to21then0() {
        double excepted = 1;
        int x1 = 0;
        int x2 = 0;
        int y1 = 1;
        int y2 = 0;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(excepted, rsl, 0.01);
    }

    @Test
    public void when64To54then5() {
        double excepted = 5;
        int x1 = 0;
        int x2 = 0;
        int y1 = 5;
        int y2 = 0;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(excepted, rsl, 0.01);
    }
}