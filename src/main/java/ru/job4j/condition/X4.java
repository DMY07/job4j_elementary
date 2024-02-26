package ru.job4j.condition;

public class X4 {
    public static int calc1(int a1, int b1, int c1, int x1) {
        return a1 * x1 * x1 + b1 * x1 + c1;
    }

    public static void main(String[] args) {
        int a1 = 0;
        int b1 = 1;
        int c1 = 1;
        int x1 = 1;
        int result1 = X4.calc1(a1, b1, c1, x1);
        System.out.println(result1);
        }
}
