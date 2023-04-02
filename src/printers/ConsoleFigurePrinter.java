package printers;

import figures.Figure;

public class ConsoleFigurePrinter implements FigurePrinter {

    @Override
    public void printFigure(Figure f) {
        System.out.println(f.getName());
    }

    @Override
    public void printFigures(Figure[] f) {
        for (Figure d : f) {
            printFigure(d);
        }
    }

}
