package ru.job4j.condition;

public class WeeklySalary {
    public static void main(String[] args) {
        int[] hours = {10, 0, 12, 0, 8, 12, 4};
        System.out.println(calculate(hours));
    }

    public static int calculate(int[] hours) {
        int sum = 0;
        int salary;
        for (int i = 0; i < 7; i++) {
            if (i < 5) {
                if (hours[i] <= 8) {
                    salary = hours[i] * 10;
                } else {
                    salary = ((hours[i] - (hours[i] - 8)) * 10) + (hours[i] - 8) * 15;
                }
            } else {
                if (hours[i] <= 8) {
                    salary = hours[i] * 20;
                } else {
                    salary = ((hours[i] - (hours[i] - 8)) * 20) + (hours[i] - 8) * 30;
                }
            }
            sum += salary;
        }
        return sum;
    }
}
