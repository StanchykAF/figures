package com.epam.rd.autotasks.figures;

class Triangle extends Figure {

    private final Point A, B, C;

    public Triangle(Point a, Point b, Point c) {
        A = a;
        B = b;
        C = c;
    }

    @Override
    public double area() {
        return 0.5 * Math.abs((A.getX() - C.getX()) * (B.getY() - C.getY()) - (B.getX() - C.getX()) * (A.getY() - C.getY()));
    }

    @Override
    public Point leftmostPoint() {
        double minX = Math.min(Math.min(A.getX(), B.getX()), C.getX());
        if (minX == A.getX()) {
            return A;
        } else  if (minX == B.getX()) {
            return B;
        } else {
            return C;
        }
    }

    @Override
    public String pointsToString() {
        return A.toString() + B.toString() + C.toString();
    }

    @Override
    public String toString() {
        return "Triangle[" +
                pointsToString() +
                ']';
    }
}
