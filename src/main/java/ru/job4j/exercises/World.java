package ru.job4j.exercises;

public class World {
    public static void loop(int a, int b) {
        System.out.println("Старт");
        for (int i = a; i < b; i++) {
            if (i >= 10) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nФиниш");
    }

    public static void main(String[] args) {
        loop(-16, 15);
    }
}




