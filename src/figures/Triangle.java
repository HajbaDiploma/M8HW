package figures;

public class Triangle implements Figure {

    private Point point1;

    private Point point2;

    private Point point3;

    private String name;

    public Triangle(String name,Point point1,Point point2,Point point3) {
        this.name = name;
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getFigureDescription() {
        return null;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                ", point3=" + point3 +
                ", name='" + name + '\'' +
                '}';
    }
}
