package com.epam.rd.autotasks.figures;

class Quadrilateral extends Figure {

    private final Point A, B, C, D;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        A = a;
        B = b;
        C = c;
        D = d;
    }

    @Override
    public double area() {
        return new Triangle(A, B, C).area() + new Triangle(A, C, D).area();
    }

    @Override
    public Point leftmostPoint() {
        double minX = Math.min(Math.min(A.getX(), B.getX()), Math.min(C.getX(), D.getX()));
        if (minX == A.getX()) {
            return A;
        } else if (minX == B.getX()) {
            return B;
        } else if (minX == C.getX()) {
            return C;
        } else {
            return D;
        }
    }

    @Override
    public String pointsToString() {
        return A.toString() + B.toString() + C.toString() + D.toString();
    }

    @Override
    public String toString() {
        return "Quadrilateral[" +
                pointsToString() +
                ']';
    }
}
