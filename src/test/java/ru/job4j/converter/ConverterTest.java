package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in1 = 140;
        float expected1 = 2;
        float out1 = Converter.rubleToEuro(in1);
        float eps1 = 0.0001F;
        Assert.assertEquals(expected1, out1, eps1);
    }

    @Test
    public void whenConvert420RblThen7Dollar() {
        float in2 = 420;
        float expected2 = 7;
        float out2 = Converter.rubleToDollar(in2);
        float eps2 = 0.0001F;
        Assert.assertEquals(expected2, out2, eps2);
    }
}