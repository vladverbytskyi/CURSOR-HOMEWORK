package shape.plane.shape.impl;

import shape.plane.shape.PlaneShape;
import vertex.Vertex2D;

public class Triangle extends PlaneShape {
    private Vertex2D coordinate_A;
    private Vertex2D coordinate_B;
    private Vertex2D coordinate_C;

    public Triangle(Vertex2D coordinateA, Vertex2D coordinateB, Vertex2D coordinateC) {
        this.coordinate_A = coordinateA;
        this.coordinate_B = coordinateB;
        this.coordinate_C = coordinateC;
    }

    public Vertex2D getCoordinate_A() {
        return coordinate_A;
    }

    public Vertex2D getCoordinate_B() {
        return coordinate_B;
    }

    public Vertex2D getCoordinate_C() {
        return coordinate_C;
    }

    private double calculateSideSize(final Vertex2D a, final Vertex2D b) {
        return Math.sqrt(Math.pow(getCoordinate_A().getX() - getCoordinate_B().getX(), 2) + Math.pow(getCoordinate_A().getY() - getCoordinate_A().getY(), 2));
    }

    @Override
    public double calculatePerimeter() {
        double sizeSideAB = calculateSideSize(getCoordinate_A(), getCoordinate_B());
        double sizeSideBC = calculateSideSize(getCoordinate_B(), getCoordinate_C());
        double sizeSideAC = calculateSideSize(getCoordinate_A(), getCoordinate_C());
        return sizeSideAB + sizeSideAC + sizeSideBC;
    }

    @Override
    public double calculateArea() {
        double sizeSideAB = calculateSideSize(getCoordinate_A(), getCoordinate_B());
        double sizeSideBC = calculateSideSize(getCoordinate_B(), getCoordinate_C());
        double sizeSideAC = calculateSideSize(getCoordinate_A(), getCoordinate_C());
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - sizeSideAB) * (p - sizeSideAC) * (p - sizeSideBC));
    }

    @Override
    public String toString() {
        return "Triangle: area - " + calculateArea() + " cm2; " + "perimeter - " + calculatePerimeter() + " cm2; " + "coordinates - " +
                "coordinate A: " + getCoordinate_A().toString() + "; " + " coordinate B: " + getCoordinate_B().toString() + "; " + "coordinate C: " + getCoordinate_C().toString();
    }
}
