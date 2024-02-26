package ru.job4j.condition;

public class X6 {
    public static int calc3(int a3, int b3, int c3, int x3) {
        return a3 * x3 * x3 + b3 * x3 + c3;
    }

    public static void main(String[] args) {
        int a3 = 1;
        int b3 = 1;
        int c3 = 1;
        int x3 = 0;
        int result3 = X6.calc3(a3, b3, c3, x3);
        System.out.println(result3);
    }
}
