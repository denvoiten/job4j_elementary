package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = {6, 9, 11, 3, 18};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas18Then5() {
        int[] data = {8, 99, 33, 4, 22, 18};
        int el = 18;
        int result = FindLoop.indexOf(data, el);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind3() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot88ThenMinus1() {
        int[] data = new int[]{88, 21, 100, 89, 131, 4};
        int el = 88;
        int start = 3;
        int finish = 5;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas88Then5() {
        int[] data = new int[]{55, 2, 1, 8, 23, 81, 2, 6, 88};
        int el = 88;
        int start = 3;
        int finish = 8;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 8;
        Assert.assertEquals(expected, result);
    }
}