package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        boolean result;
        result = LogicNot.isEven(4);
        System.out.println(result);
        result = LogicNot.isPositive(9);
        System.out.println(result);
        result = LogicNot.notEven(5);
        System.out.println(result);
        result = LogicNot.notPositive(-2);
        System.out.println(result);
        result = LogicNot.notEvenAndPositive(7);
        System.out.println(result);
        result = LogicNot.evenOrNotPositive(3);
        System.out.println(result);
    }
}
