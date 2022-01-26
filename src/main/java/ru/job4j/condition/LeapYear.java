package ru.job4j.condition;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(checkYear(2100));
    }

    public static boolean checkYear(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }
}
