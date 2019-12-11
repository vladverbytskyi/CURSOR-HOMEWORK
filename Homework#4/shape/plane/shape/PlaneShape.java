package shape.plane.shape;

import interfaces.AreaMeasurable;
import interfaces.PerimeterMeasurable;
import shape.Shape;

public abstract class PlaneShape extends Shape implements AreaMeasurable, PerimeterMeasurable {
    protected double radius;
    protected double width;
    protected double hight;
}
