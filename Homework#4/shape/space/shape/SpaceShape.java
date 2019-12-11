package shape.space.shape;

import interfaces.AreaMeasurable;
import interfaces.VolumeMeasurable;
import shape.Shape;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {
    protected double depth;
    protected double width;
    protected double hight;
    protected double radius;
}
