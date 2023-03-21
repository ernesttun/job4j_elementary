package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean rsl = true;
        for (boolean array : data) {
            if (array != data[0]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
