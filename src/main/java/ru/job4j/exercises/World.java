package ru.job4j.exercises;

public class World {
    public static int maxSum(int[] array) {
        int maxSum = 0;
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;

    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(maxSum(array));
    }
}
