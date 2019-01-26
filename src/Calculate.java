import java.util.Date;

public class Calculate {

    PointScanner pointScanner = new PointScanner ();

    public void calculate() {

        Point point = pointScanner.getPoint ();
        System.out.println ("Punkty point ma współrzędne " + point.getX () + "  " + point.getY ());

        if (point.getX () > 0 && point.getY () > 0) {
            System.out.println ("Punkt leży w 1 czwartce");
        }
        if (point.getX () < 0 && point.getY () > 0) {
            System.out.println ("Punkt leży w 2 czwartce");
        }
        if (point.getX () < 0 && point.getY () < 0) {
            System.out.println ("Punkt leży w 3 czwartce");
        }
        if (point.getX () > 0 && point.getY () < 0) {
            System.out.println ("Punkt leży w 4 czwartce");
        }
        if (point.getX () == 0 || point.getY () == 0) {
            System.out.println ("Punkt leży na osi");

        }
    }
}