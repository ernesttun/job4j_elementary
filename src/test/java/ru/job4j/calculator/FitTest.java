package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenMan172Then82dot8() {
        short height = 172;
        double expected = 82.8;
        double rsl = Fit.manWeight(height);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenWoman172Then71dot3() {
        short height = 172;
        double expected = 71.3;
        double rsl = Fit.womanWeight(height);
        Assert.assertEquals(expected, rsl, 0.01);
    }
}