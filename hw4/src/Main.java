import shape.Shape;
import shape.planeShape.impl.Circle;
import shape.planeShape.impl.Rectangle;
import shape.planeShape.impl.Triangle;
import shape.spaceShape.impl.Cuboid;
import shape.spaceShape.impl.Sphere;
import shape.spaceShape.impl.SquarePyramid;
import vertex.Vertex2D;
import vertex.Vertex3D;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String [] args) {
        final Triangle triangle = new Triangle(new Vertex2D(1, 2), new Vertex2D(2,3), new Vertex2D(3, 4));
        final Circle circle = new Circle(new Vertex2D(1, 2), 4);
        final Rectangle rectangle = new Rectangle(new Vertex2D(1, 2), 4 , 5);
        final Cuboid cuboid = new Cuboid(new Vertex3D(1,2,3), 4,5,6);
        final Sphere sphere = new Sphere(new Vertex3D(1, 2, 3), 5);
        final SquarePyramid squarePyramid = new SquarePyramid(new Vertex3D(1,2,3), 4, 5);

        final List<Shape> shapes = new ArrayList<>();
        shapes.add(triangle);
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(cuboid);
        shapes.add(sphere);
        shapes.add(squarePyramid);

        for (Shape shape: shapes) {
            System.out.println(shape.toString());
        }

    }
}
