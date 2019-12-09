package shape.spaceShape.impl;

import shape.spaceShape.SpaceShape;
import vertex.Vertex3D;

public class Cuboid extends SpaceShape {
    private final Vertex3D coordinate;
    private final double width;
    private final double height;
    private final double depth;

    public Cuboid (final Vertex3D coordinate, final double width, final double height, final double depth) {
        this.coordinate = coordinate;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }

    public double getHeight() {
        return height;
    }

    public Vertex3D getCoordinate() {
        return coordinate;
    }

    @Override
    public double area() {
        return 2 * (getWidth() * getHeight() + getHeight() * getDepth() + getWidth() * getDepth());
    }

    @Override
    public double volume() {
        return getWidth() * getHeight() * getHeight();
    }

    @Override
    public String toString() {
        return "Cuboid: area - " + area() + " cm2; " + "volume - " + volume() + " cm3; " + "coordinates - " +
                getCoordinate().toString() + "; " + "width - " + width + " cm; " + "height - " + height + " cm; " + "depth - " + depth +
                " cm;";
    }
}
