package ru.job4j.condition;

public class PairsCharString {
    public static void main(String[] args) {
        System.out.println(check("", ""));
        System.out.println(check("sparkling", "groups"));
        System.out.println(check("booking", "grabber"));
    }

    public static boolean check(String l, String r) {
        boolean rsl = false;
        if (l.equals(r)) {
            rsl = true;
        } else if (l.charAt(0) == r.charAt(r.length() - 1) && r.charAt(0) == l.charAt(l.length() - 1)) {
            rsl = true;
        }
        return rsl;
    }
}
