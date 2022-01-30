package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax3To1Then3() {
        int first = 3;
        int second = 1;
        int result = Max.max(first, second);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To7Then7() {
        int first = 3;
        int second = 7;
        int result = Max.max(first, second);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax8To8Then8() {
        int first = 8;
        int second = 8;
        int result = Max.max(first, second);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To5To7Then7() {
        int first = 2;
        int second = 5;
        int third = 7;
        int result = Max.max(first, Max.max(second, third));
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To17To8To3Then17() {
        int first = 1;
        int second = 17;
        int third = 8;
        int forth = 3;
        int result = Max.max(first, Max.max(second, third, forth));
        int expected = 17;
        Assert.assertEquals(result, expected);
    }
}