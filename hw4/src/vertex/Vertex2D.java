package vertex;

public class Vertex2D {
    private final double x;
    private final double y;

    public Vertex2D(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "x: " + getX() + ", y: " + getY();
    }
}
