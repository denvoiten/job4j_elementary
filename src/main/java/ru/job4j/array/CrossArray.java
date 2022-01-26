package ru.job4j.array;

public class CrossArray {

    public static void printCrossEl(int[] left, int[] right) {
        for (int x : left) {
            for (int t : right) {
                if (x == t) {
                    System.out.println(t);
                }
            }
        }
    }
}

