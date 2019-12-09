package shape.planeShape.impl;

import shape.planeShape.PlaneShape;
import vertex.Vertex2D;

public class Triangle extends PlaneShape {
    private final Vertex2D A;
    private final Vertex2D B;
    private final Vertex2D C;

    public Triangle(final Vertex2D a, final Vertex2D b, final Vertex2D c) {
        this.A = a;
        this.B = b;
        this.C = c;
    }

    public Vertex2D getA() {
        return A;
    }

    public Vertex2D getB() {
        return B;
    }

    public Vertex2D getC() {
        return C;
    }

    private double calculateSideSize(final Vertex2D a, final Vertex2D b) {
        return Math.sqrt(Math.pow(getA().getX() - getB().getX(), 2) + Math.pow(getA().getY() - getA().getY(), 2));
    }

    @Override
    public double perimeter() {
        double sizeSideAB = calculateSideSize(getA(), getB());
        double sizeSideBC = calculateSideSize(getB(), getC());
        double sizeSideAC = calculateSideSize(getA(), getC());
        return sizeSideAB + sizeSideAC + sizeSideBC;
    }

    @Override
    public double area() {
        double sizeSideAB = calculateSideSize(getA(), getB());
        double sizeSideBC = calculateSideSize(getB(), getC());
        double sizeSideAC = calculateSideSize(getA(), getC());
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - sizeSideAB) * (p - sizeSideAC) * (p - sizeSideBC));
    }

    @Override
    public String toString() {
        return "Triangle: area - " + area() + " cm2; " + "perimeter - " + perimeter() + " cm2; " + "coordinates - " +
                "coordinate A: " + getA().toString() + "; " + " coordinate B: " + getB().toString() + "; " + "coordinate C: " + getC().toString();
    }
}
