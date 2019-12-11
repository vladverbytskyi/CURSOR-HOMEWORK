package shape.space.shape.impl;

import shape.space.shape.SpaceShape;
import vertex.Vertex3D;

public class SquarePyramid extends SpaceShape {
    private Vertex3D coordinate;
    private double width;
    private double height;

    public SquarePyramid (Vertex3D coordinate, double width, double height) {
        this.coordinate = coordinate;
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public Vertex3D getCoordinate() {
        return coordinate;
    }

    @Override
    public double calculateArea() {
        return 2 * getWidth() * (getWidth()/ (2 + Math.sqrt(Math.pow(getHeight(), 2) + Math.pow(getWidth() / 2, 2))));
    }

    @Override
    public double calculateVolume() {
        return Math.pow(getWidth(), 2) * getHeight() / 3;
    }

    @Override
    public String toString() {
        return "Square pyramid: area - " + calculateArea() + " cm2; " + "volume - " + calculateVolume() + " cm3; " +
                "coordinates - " + getCoordinate().toString() + "; " + "width - " + getWidth() + " cm; " + "height - " + getHeight() + " cm;";
    }
}
