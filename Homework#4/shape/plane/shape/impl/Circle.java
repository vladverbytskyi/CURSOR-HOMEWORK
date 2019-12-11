package shape.plane.shape.impl;

import shape.plane.shape.PlaneShape;
import vertex.Vertex2D;

public class Circle extends PlaneShape {
    private Vertex2D A;
    private double radius;

    public Circle (Vertex2D a, double radius) {
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
    public double calculatePerimeter() {
        return 2 * Math.PI * getRadius();
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public String toString() {
        return "Circle: area - " + calculateArea() + " cm2; " + "perimeter - " + calculatePerimeter() + " cm; " +
                "coordinates - " + getA().toString() + "; radius - " + getRadius() + " cm; ";
    }
}