package shape.spaceShape.impl;

import shape.spaceShape.SpaceShape;
import vertex.Vertex3D;

public class Sphere extends SpaceShape {
    private final Vertex3D A;
    private final double radius;

    public Sphere(final Vertex3D a,final double radius) {
        this.A = a;
        this.radius = radius;
    }

    public Vertex3D getA() {
        return A;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public double volume() {
        return 4 * Math.PI * Math.pow(getRadius(), 3) / 3;
    }

    @Override
    public String toString() {
        return "Sphere: area - " + area() + " cm2; " + "volume - " + volume() + " cm3; " + "coordinates - " +
                getA().toString() + "; " + " radius - " + getRadius() + ";";
    }
}
