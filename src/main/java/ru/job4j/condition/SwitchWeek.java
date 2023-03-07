package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfPlay(int day) {
        String name;
        switch (day) {
            case 1:
                name = "Понедельник";
                break;
            case 2:
                name = "Вторник";
                break;
            case 3:
                name = "Среда";
                break;
            case 4:
                name = "Четверг";
                break;
            case 5:
                name = "Пятница";
                break;
            case 6:
                name = "Суббота";
                break;
            case 7:
                name = "Воскресенье";
                break;
            default:
                name = "Ошибка";
                break;

        }
        return name;
    }

    public static void main(String[] args) {
        System.out.println(nameOfPlay(1));
        System.out.println(nameOfPlay(2));
        System.out.println(nameOfPlay(3));
        System.out.println(nameOfPlay(4));
        System.out.println(nameOfPlay(5));
        System.out.println(nameOfPlay(6));
        System.out.println(nameOfPlay(7));
    }
}
