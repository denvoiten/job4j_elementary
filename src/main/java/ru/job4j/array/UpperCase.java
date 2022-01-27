package ru.job4j.array;

import java.util.Arrays;

public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        char[] str = new char[string.length];
        int count = 0;
        for (int i = 0; i < string.length; i++) {
            if (Character.isUpperCase(string[i])) {
                str[i] = string[i];
                count++;
            } else if (Character.isLowerCase(string[i])) {
                str[i] = Character.toUpperCase(string[i]);
                count++;
            } else {
                str[i] = string[i];
                count++;
            }
        }
        System.arraycopy(string, count, str, count, string.length - count);
        return str;
    }
}
