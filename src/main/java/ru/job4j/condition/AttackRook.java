package ru.job4j.condition;

public class AttackRook {
    public static void main(String[] args) {
        System.out.println(check("A8", "E8"));
        System.out.println(check("H4", "H3"));
        System.out.println(check("A1", "B2"));
        System.out.println(check("F5", "C8"));
    }

    public static boolean check(String left, String right) {
        char a1 = left.charAt(0);
        char a2 = left.charAt(1);
        char b1 = right.charAt(0);
        char b2 = right.charAt(1);

        return a1 == b1 || a2 == b2;
    }
}