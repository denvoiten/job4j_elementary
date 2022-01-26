package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class MortgageTest {
    @Test
    public void when1Year() {
        double amount = 1000;
        double salary = 1200;
        double percent = 1;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when2Year() {
        int amount = 100;
        int salary = 120;
        double percent = 50;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when5Year() {
        int amount = 1_000_000;
        int salary = 300_000;
        double percent = 8;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }
}