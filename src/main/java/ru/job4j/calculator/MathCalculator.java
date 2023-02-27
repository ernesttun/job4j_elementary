package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double diffAndDiv(double first, double second) {
        return diff(first, second)
                + div(first, second);
    }

    public static double sumAndDiffAndMultiplyAndDiv(double first, double second) {
        return sum(first, second)
                + diff(first, second)
                + multiply(first, second)
                + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + diffAndDiv(40, 20));
        System.out.println("Результат расчета равен: " + sumAndDiffAndMultiplyAndDiv(20, 10));
    }
}
