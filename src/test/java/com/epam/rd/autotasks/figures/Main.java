package com.epam.rd.autotasks.figures;

public class Main {
    public static void main(String[] args) {
        double area;
        Point leftmost;

        area = new Triangle(new Point(0, 0), new Point(3, 0), new Point(0, 4)).area();
        System.out.println(area);

        area = new Quadrilateral(new Point(1, 0), new Point(2, 1), new Point(1, 2), new Point(0, 1)).area();
        System.out.println(area);

        area = new Circle(new Point(1, 1), 3).area();
        System.out.println(area);

        leftmost = new Quadrilateral(new Point(1, 1), new Point(3, -4), new Point(-2, -2), new Point(-1, 1)).leftmostPoint();
        System.out.println(leftmost.toString());

    }
}
