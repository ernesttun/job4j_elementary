package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int excepted = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(excepted, out, 0.01);
    }

    @Test
    public void whenP5K4Square1() {
        int excepted = 1;
        int p = 5;
        double k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(excepted, out, 0.01);
    }

    @Test
    public void whenP8K3Square3() {
        int excepted = 3;
        int p = 8;
        double k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(excepted, out, 0.01);
    }
}