package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        if (n > 0) {
            for (int i = n; i > 0; i--) {
                result *= i;
            }
        }
        return result;
    }
}
