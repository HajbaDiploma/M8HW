package figures;

public class Square implements Figure {

    private Point topRight;

    private double lineSize;

    private String name;

    public Square(String name,Point topRight,double lineSize) {
        this.name = name;
        this.topRight = topRight;
        this.lineSize = lineSize;
    }

    public Square() {
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
        return "Square{" +
                "topRight=" + topRight +
                ", lineSize=" + lineSize +
                ", name='" + name + '\'' +
                '}';
    }
}
