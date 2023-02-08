package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00To20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        double expected = 2.0;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11To93Then8dot24() {
        Point a = new Point(1, 1);
        Point b = new Point(9, 3);
        double out = a.distance(b);
        double expected = 8.24;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when51To85Then5() {
        Point a = new Point(5, 1);
        Point b = new Point(8, 5);
        double out = a.distance(b);
        double expected = 5;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10To25Then5dot09() {
        Point a = new Point(1, 0);
        Point b = new Point(2, 5);
        double out = a.distance(b);
        double expected = 5.09;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when034To609Then8dot36() {
        Point a = new Point(0, 3, 4);
        Point b = new Point(6, 0, 9);
        double out = a.distance3d(b);
        double expected = 8.36;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when645To464Then3() {
        Point a = new Point(6, 4, 5);
        Point b = new Point(4, 6, 4);
        double out = a.distance3d(b);
        double expected = 3;
        Assert.assertEquals(expected, out, 0.01);
    }
}