package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00To20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13To23Then1() {
        Point a = new Point(1, 3);
        Point b = new Point(2, 3);
        double expected = 1;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when32To22Then1() {
        Point a = new Point(3, 2);
        Point b = new Point(2, 2);
        double expected = 1;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when20To22To22Then2() {
        Point a = new Point(2, 2, 2);
        Point b = new Point(0, 2, 2);
        double expected = 2;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when31To20To23then3() {
        Point a = new Point(3, 2, 2);
        Point b = new Point(1, 0, 3);
        double expected = 3;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}