package ru.job4j.condition;

public class Point {

    private int x;
    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double distance = a.distance(b);
        System.out.println(distance);
        Point q = new Point(11, 22);
        Point w = new Point(33, 44);
        double distance1 = q.distance(w);
        System.out.println(distance1);
        Point r = new Point(0, 1);
        Point t = new Point(8, 0);
        double distance2 = r.distance(t);
        System.out.println(distance2);
    }
}
