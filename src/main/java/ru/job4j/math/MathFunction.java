package ru.job4j.math;

public class MathFunction {
    public static double sum(double first, double second) {
        return first + second;
    }

    public static double multiply(double first, double second) {
        return first * second;
    }

    public static double minus(double first, double second) {
        return first - second;
    }

    public static double division(double first, double second) {
        return first - second;
    }

    public static double sumAndMultiply(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second);
    }

    public static double minusAndDivision(double first, double second) {
        return ru.job4j.math.MathFunction.minus(first, second)
                + ru.job4j.math.MathFunction.division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат второго расчета равен: " + minusAndDivision(210, 7));
    }
}
