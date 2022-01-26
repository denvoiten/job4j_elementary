package ru.job4j.array;

public class Sorted {
    public static boolean isSorted(int[] array) {
        boolean rsl = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}

