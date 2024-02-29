package ru.job4j.condition;

public class RectangleArea {

    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double i = h * k;
        double s = i * h;
        return s;
    }

    public static double square1(double p1, double k1) {
        double h1 = p1 / (2 * (k1 + 1));
        double i1 = h1 * k1;
        double s1 = i1 * h1;
        return s1;
    }

    public static double square2(double p2, double k2) {
        double h2 = p2 / (2 * (k2 + 1));
        double i2 = h2 * k2;
        double s2 = i2 * h2;
        return s2;
    }

        public static void main(String[] args) {
            double result = RectangleArea.square(6, 2);
            System.out.println(" p = 6, k = 2, s = 1, real = " + result);
            double result1 = RectangleArea.square1(10, 5);
            System.out.println(" p = 10, k = 5, real = " + result1);
            double result2 = RectangleArea.square1(99, 11);
            System.out.println(" p = 99, k = 11, real = " + result2);
        }
}
