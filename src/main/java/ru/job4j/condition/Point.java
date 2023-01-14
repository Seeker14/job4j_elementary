package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result1 = Point.distance(1, 1, 9, 3);
        double result2 = Point.distance(5, 1, 8, 5);
        double result3 = Point.distance(1, 0, 2, 5);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result1 (1, 1) to (9, 3) " + result1);
        System.out.println("result2 (5, 1) to (8, 5) " + result2);
        System.out.println("result3 (1, 0) to (2, 5) " + result3);
    }
}
