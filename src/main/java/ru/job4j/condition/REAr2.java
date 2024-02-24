package ru.job4j.condition;

public class REAr2 {

    public static double square(double p, double k) {
        return p;
    }

    public static double h(double p, double k) {
        double h = p / (2 * (k + 1));
        return h;
    }

    public static double i(double h, double k) {
        double i = h * k;
        return i;
    }

    public static double s(double h, double i) {
        double s = i * h;
        return s;
    }

    public static void main(String[] args) {
        double result = RectangleArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 1, real = " + result);
    }
}

