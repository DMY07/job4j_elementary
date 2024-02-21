package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = x2 - x1;
        double two = y2 - y1;
        double free = Math.pow(first, 2);
        double four = Math.pow(two, 2);
        double five = free + four;
        double six = Math.sqrt(five);
        return six;
    }

    public static void main(String[] args) {
        double result = Point.distance(30, 60, 50, 20);
        System.out.println("result (30, 60) to (50, 20) " + result);
    }
}
