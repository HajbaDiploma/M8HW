package creators;

import figures.*;

public class ConstantFigureCreator implements FigureCreator {

    @Override
    public Figure createFigure() {

        return new Triangle("triangle 1",
                new Point(6,7,"triangle p1"),
                new Point(9,10,"triangle p2"),
                new Point(7,4,"triangle p3")
        );
    }

    @Override
    public Figure[] createFigures() {
        Square square = new Square("square 1", new Point(0, 1, "square p1"), 5);
        Circle circle = new Circle("circle 1", new Point(4,7,"circle centre"), 6);
        Point point = new Point(5,7,"simple point");
        Rectangle rectangle = new Rectangle("rectangle 1",
                new Point(8,6,"rectangle top left point"),
                new Point(10,5,"rectangle bottom rigth"));
        Triangle triangle = new Triangle("triangle 1",
                new Point(6,7,"triangle p1"),
                new Point(9,10,"triangle p2"),
                new Point(7,4,"triangle p3")
        );

        Figure[] fa = {square,circle,point,rectangle,triangle};

        return fa;

    }
}
