package shape.planeShape.impl;

import shape.planeShape.PlaneShape;
import vertex.Vertex2D;

public class Rectangle extends PlaneShape {
    private final Vertex2D A;
    private final double width;
    private final double hight;

    public Rectangle (final Vertex2D a, final double width, final double hight) {
        this.A = a;
        this.width = width;
        this.hight = hight;
    }

    public Vertex2D getA() {
        return A;
    }

    public double getHight() {
        return hight;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double perimeter() {
        return (getHight() + getWidth()) * 2;
    }

    @Override
    public double area() {
        return getHight() * getWidth();
    }

    @Override
    public String toString() {
        return "Rectangle: area - " + area() + " cm2; " + "perimeter - " + perimeter() + " cm; " + "coordinates - "
                + getA().toString() + "; width - " + getWidth() + " cm; " + "height - " + getHight() + " cm;";
    }
}

