package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        StringBuilder result = new StringBuilder();
        char symbol = input.charAt(0);
        int counter = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
            } else {
                result.append(getEncode(symbol, counter));
                symbol = input.charAt(i);
                counter = 1;
            }
        }
        result.append(getEncode(symbol, counter));

        return String.valueOf(result);
    }

    public static String getEncode(char symbol, int counter) {
        return counter > 1 ? symbol + String.valueOf(counter) : String.valueOf(symbol);
    }
}
