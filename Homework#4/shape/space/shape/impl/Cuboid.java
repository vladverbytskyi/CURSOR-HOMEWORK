package shape.space.shape.impl;

import shape.space.shape.SpaceShape;
import vertex.Vertex3D;

public class Cuboid extends SpaceShape {
    private Vertex3D coordinate;
    private double width;
    private double height;
    private double depth;

    public Cuboid (Vertex3D coordinate, double width, double height, double depth) {
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
    public double calculateArea() {
        return 2 * (getWidth() * getHeight() + getHeight() * getDepth() + getWidth() * getDepth());
    }

    @Override
    public double calculateVolume() {
        return getWidth() * getHeight() * getHeight();
    }

    @Override
    public String toString() {
        return "Cuboid: area - " + calculateArea() + " cm2; " + "volume - " + calculateVolume() + " cm3; " + "coordinates - " +
                getCoordinate().toString() + "; " + "width - " + width + " cm; " + "height - " + height + " cm; " + "depth - " + depth +
                " cm;";
    }
}
