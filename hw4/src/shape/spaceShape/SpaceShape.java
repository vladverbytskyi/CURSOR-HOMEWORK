package shape.spaceShape;

import interfaces.AreaMeasurable;
import interfaces.VolumeMeasurable;
import shape.Shape;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {
    @Override
    public double area() {
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }
}
