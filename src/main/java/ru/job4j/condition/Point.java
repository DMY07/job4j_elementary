package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double result = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return result;
    }

    public static double distance1(int x3, int y3, int x4, int y4) {
        double result1 = Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2));
        return result1;
    }

    public static double distance2(int x5, int y5, int x6, int y6) {
        double result2 = Math.sqrt(Math.pow((x6 - x5), 2) + Math.pow((y6 - y5), 2));
        return result2;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result1 = Point.distance1(11, 22, 33, 44);
        System.out.println("result (11, 22) to (33, 44) " + result1);
        double result2 = Point.distance2(0, 1, 8, 0);
        System.out.println("result (0, 1) to (8, 0) " + result2);
    }
}
