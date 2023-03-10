package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int num = 1; num <= number; num++) {
            if (num % 5 == 0) {
                prime = true;
            } else {
                prime = false;
            }
        }
        return prime;
    }
}
