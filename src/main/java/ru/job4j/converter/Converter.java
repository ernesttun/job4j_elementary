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
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(420);
        System.out.println("140 ruble are " + euro + " euro");
        System.out.println("420 ruble are " + dollar + " dollar");
    }
}
