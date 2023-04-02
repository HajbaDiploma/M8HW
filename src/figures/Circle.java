package figures;

public class Circle implements Figure {

    private Point centre;

    private double radius;

    private String name;

    public Circle(String name,Point centre,double radius) {
        this.name = name;
        this.centre = centre;
        this.radius = radius;
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
        return "Circle{" +
                "centre=" + centre +
                ", radius=" + radius +
                ", name='" + name + '\'' +
                '}';
    }
}
