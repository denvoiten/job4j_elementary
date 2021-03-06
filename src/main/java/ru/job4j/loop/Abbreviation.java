package ru.job4j.loop;

public class Abbreviation {
    public static String collect(String s) {
        StringBuilder firstLetters = new StringBuilder();
        for (String str : s.split(" ")) {
            firstLetters.append(str.substring(0, 1).toUpperCase());
        }
        return firstLetters.toString();
    }
}
