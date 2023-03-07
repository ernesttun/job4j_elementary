package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (second > result) {
            result = second;
        }
        if (third > result) {
            result = third;
        }
        return result;
    }

    public static void main(String[] args) {
        int result = max(1, 1, 1);
        System.out.println(result);
    }
}
