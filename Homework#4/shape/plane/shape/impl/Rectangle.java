package shape.plane.shape.impl;

import shape.plane.shape.PlaneShape;
import vertex.Vertex2D;

public class Rectangle extends PlaneShape {
    private  Vertex2D coordinate_A;
    private  double width;
    private  double hight;

    public Rectangle (Vertex2D coordinateA, double width, double hight) {
        this.coordinate_A = coordinateA;
        this.width = width;
        this.hight = hight;
    }

    public Vertex2D getCoordinate_A() {
        return coordinate_A;
    }

    public double getHight() {
        return hight;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double calculatePerimeter() {
        return (getHight() + getWidth()) * 2;
    }

    @Override
    public double calculateArea() {
        return getHight() * getWidth();
    }

    @Override
    public String toString() {
        return "Rectangle: area - " + calculateArea() + " cm2; " + "perimeter - " + calculatePerimeter() + " cm; " + "coordinates - "
                + getCoordinate_A().toString() + "; width - " + getWidth() + " cm; " + "height - " + getHight() + " cm;";
    }
}

