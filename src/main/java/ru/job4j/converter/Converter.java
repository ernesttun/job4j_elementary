package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float ruble) {
        float result = ruble / 70;
        return result;
    }

    public static float rubleToDollar(float ruble) {
        float result = ruble / 60;
        return result;
    }

    public static void main(String[] args) {
        float in1 = 140;
        float expected1 = 2;
        float out1 = Converter.rubleToEuro(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are 2 euro. Test result : " + passed1);

        float in2 = 420;
        float expected2 = 7;
        float out2 = Converter.rubleToDollar(in2);
        boolean passed2 = out2 == expected2;
        System.out.println("420 rubles are 7 dollar. Test result : " + passed2);
    }
}
