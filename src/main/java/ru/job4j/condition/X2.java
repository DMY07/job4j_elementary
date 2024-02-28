package ru.job4j.condition;

public class X2 {
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static int calc1(int a1, int b1, int c1, int x1) {
        return a1 * x1 * x1 + b1 * x1 + c1;
    }

    public static int calc2(int a2, int b2, int c2, int x2) {
        return a2 * x2 * x2 + b2 * x2 + c2;
    }

    public static int calc3(int a3, int b3, int c3, int x3) {
        return a3 * x3 * x3 + b3 * x3 + c3;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int a1 = 0;
        int b1 = 1;
        int c1 = 1;
        int x1 = 1;
        int a2 = 1;
        int b2 = 1;
        int c2 = 0;
        int x2 = 1;
        int a3 = 1;
        int b3 = 1;
        int c3 = 1;
        int x3 = 0;
        int result = X2.calc(a, b, c, x);
        int result1 = X2.calc1(a1, b1, c1, x1);
        int result2 = X2.calc2(a2, b2, c2, x2);
        int result3 = X2.calc3(a3, b3, c3, x3);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
