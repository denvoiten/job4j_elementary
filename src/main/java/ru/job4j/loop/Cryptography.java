package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        if (s.isEmpty()) {
            return "empty";
        }
        if (s.length() < 4) {
            return s;
        }
        StringBuilder value = new StringBuilder(s);
        for (int i = 0; i < value.length() - 4; i++) {
            value.setCharAt(i, '#');
        }
        return value.toString();
    }
}
