package figures;

public class Rectangle implements Figure{

    private Point topLeft;

    private Point bottomRight;

    private String name;


    public Rectangle(String name,Point topLeft,Point bottomRight) {
        this.name = name;
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
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
        return "Rectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                ", name='" + name + '\'' +
                '}';
    }
}
