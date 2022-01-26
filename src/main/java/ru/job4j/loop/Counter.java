package ru.job4j.loop;

public class Counter {
    public static void main(String[] args) {
        System.out.println((sum(0, 20)));
        System.out.println((sum(33, 50)));
        System.out.println((sum(5, 11)));

    }

    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum += i;
        }
        return sum;
    }
}
