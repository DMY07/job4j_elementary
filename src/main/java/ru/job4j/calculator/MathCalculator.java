package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumMinusAnddivision(double first, double second) {
        return minus(first, second)
                + division(first, second);
    }

    public static double sumALL(double first, double second) {
        return sumAndMultiply(first, second)
        + sumMinusAnddivision(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат (сумма двух операций) 1расчета равен: " + sumMinusAnddivision(210, 7));
        System.out.println("Результат (сумма вычисления всех четырех операций) расчета равен: " + sumALL(230, 406));
    }
}
