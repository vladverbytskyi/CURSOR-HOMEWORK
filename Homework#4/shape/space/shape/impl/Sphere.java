package shape.space.shape.impl;

import shape.space.shape.SpaceShape;
import vertex.Vertex3D;

public class Sphere extends SpaceShape {
    private Vertex3D coordinate_A;
    private double radius;

    public Sphere(Vertex3D coordinateA, double radius) {
        this.coordinate_A = coordinateA;
        this.radius = radius;
    }

    public Vertex3D getCoordinate_A() {
        return coordinate_A;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return 4 * Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public double calculateVolume() {
        return 4 * Math.PI * Math.pow(getRadius(), 3) / 3;
    }

    @Override
    public String toString() {
        return "Sphere: area - " + calculateArea() + " cm2; " + "volume - " + calculateVolume() + " cm3; " + "coordinates - " +
                getCoordinate_A().toString() + "; " + " radius - " + getRadius() + ";";
    }
}
