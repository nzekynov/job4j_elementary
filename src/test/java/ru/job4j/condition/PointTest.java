package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3Minus7To6Minus3Then5() {
        double expected = 5;
        int x1 = 3;
        int y1 = -7;
        int x2 = 6;
        int y2 = -3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when5Minus2ToMinus3And4Then10() {
        double expected = 10;
        int x1 = 5;
        int y1 = -2;
        int x2 = -3;
        int y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus1And3To4AndMinus9Then13() {
        double expected = 13;
        int x1 = -1;
        int y1 = 3;
        int x2 = 4;
        int y2 = -9;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}