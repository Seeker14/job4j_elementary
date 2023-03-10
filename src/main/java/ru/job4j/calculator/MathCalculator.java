package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiple(double first, double second) {
        return sum(first, second)
                + multiple(first, second);
    }

    public static double minusAndDivision(double first, double second) {
        return minus(first, second)
                + division(first, second);
    }

    public static double sumAndMultAndMinAndDiv(double first, double second) {
        return sum(first, second)
                + multiple(first, second)
                + minus(first, second)
                + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiple(10, 20));
    }
}
