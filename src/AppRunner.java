import creators.ConstantFigureCreator;
import creators.FigureCreator;
import figures.Figure;
import figures.Square;
import figures.Triangle;
import printers.ConsoleFigurePrinter;
import printers.FigurePrinter;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class AppRunner {

    public static void main(String[] args) {

        FigurePrinter fp = new ConsoleFigurePrinter();
        FigureCreator fc = new ConstantFigureCreator();

        fp.printFigures(fc.createFigures());


    }

}

