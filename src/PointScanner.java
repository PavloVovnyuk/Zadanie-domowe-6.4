import java.util.Scanner;

public class PointScanner {

    public Point getPoint() {
        java.util.Scanner scanner = new java.util.Scanner (System.in);
        System.out.println ("Wprowadz x");
        double x = scanner.nextDouble ();
        System.out.println ("Wprowadz y");
        double y = scanner.nextDouble ();
        Point point = new Point (x, y);
        return point;
    }

}