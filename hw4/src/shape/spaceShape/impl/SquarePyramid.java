package shape.spaceShape.impl;

import shape.spaceShape.SpaceShape;
import vertex.Vertex3D;

public class SquarePyramid extends SpaceShape {
    private final Vertex3D center;
    private final double width;
    private final double height;

    public SquarePyramid (final Vertex3D center, final double width, final double height) {
        this.center = center;
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public Vertex3D getCenter() {
        return center;
    }

    @Override
    public double area() {
        return 2 * getWidth() * (getWidth()/ (2 + Math.sqrt(Math.pow(getHeight(), 2) + Math.pow(getWidth() / 2, 2))));
    }

    @Override
    public double volume() {
        return Math.pow(getWidth(), 2) * getHeight() / 3;
    }

    @Override
    public String toString() {
        return "Square pyramid: area - " + area() + " cm2; " + "volume - " + volume() + " cm3; " +
                "coordinates - " + getCenter().toString() + "; " + "width - " + getWidth() + " cm; " + "height - " + getHeight() + " cm;";
    }
}
