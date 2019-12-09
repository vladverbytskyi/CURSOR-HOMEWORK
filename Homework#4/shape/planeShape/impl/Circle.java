package shape.planeShape.impl;

import shape.planeShape.PlaneShape;
import vertex.Vertex2D;

public class Circle extends PlaneShape {
    private final Vertex2D A;
    private final double radius;

    public Circle (final Vertex2D a, final double radius) {
        this.A = a;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public Vertex2D getA() {
        return A;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * getRadius();
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public String toString() {
        return "Circle: area - " + area() + " cm2; " + "perimeter - " + perimeter() + " cm; " +
                "coordinates - " + getA().toString() + "; radius - " + getRadius() + " cm; ";
    }
}