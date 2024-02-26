package ru.job4j.condition;

public class X5 {
    public static int calc2(int a2, int b2, int c2, int x2) {
        return a2 * x2 * x2 + b2 * x2 + c2;
    }

    public static void main(String[] args) {
        int a2 = 1;
        int b2 = 1;
        int c2 = 0;
        int x2 = 1;
        int result2 = X5.calc2(a2, b2, c2, x2);
        System.out.println(result2);
        }
}
