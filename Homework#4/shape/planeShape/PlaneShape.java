package shape.planeShape;

import interfaces.AreaMeasurable;
import interfaces.PerimeterMeasurable;
import shape.Shape;

public abstract class PlaneShape extends Shape implements AreaMeasurable, PerimeterMeasurable {
    @Override
    public abstract double area();

    @Override
    public abstract double perimeter();

}
