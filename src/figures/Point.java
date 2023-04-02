package figures;

public final class Point implements Figure {

    private final String name;
    private final double x;
    private final double y;

    public Point(Point p){
        this(p.getX(), p.getY(), p.getName());
    }

    public Point(double x, double y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getFigureDescription() {
        return null;
    }

    @Override
    public String toString() {
        return "Point{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
