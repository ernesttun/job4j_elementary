package ru.job4j.array;

import java.util.Arrays;

public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(back(input)));
    }
}
