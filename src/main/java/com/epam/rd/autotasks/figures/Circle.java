package com.epam.rd.autotasks.figures;

class Circle extends Figure {

    private final Point CENTER;
    private final double RADIUS;

    public Circle (Point o, double radius) {
        CENTER = o;
        RADIUS = radius;
    }

    @Override
    public double area() {
        return Math.PI * RADIUS * RADIUS;
    }

    @Override
    public Point leftmostPoint() {
        return new Point(CENTER.getX() - RADIUS, CENTER.getY());
    }

    @Override
    public String pointsToString() {
        return CENTER.toString();
    }

    @Override
    public String toString() {
        return "Circle[" + CENTER.toString() + RADIUS + ']';
    }
}
