package exekutagarriak;

import java.util.Arrays;
import java.util.Random;
import model.MyPoint;
import model.MyRectangle;

/**
 *
 * @author lomana.markel
 */
public class TestMyRectangle {

    public static void main(String[] args) {
        /*NIK EGINDAKOA*/
        /*p0,p1 puntuak egokiak izan behar dira, bestela ez du funtzionatuko.
          ez dago puntuak topLeft edo bottomRight ziurtatzen duenik*/

        MyPoint p0 = new MyPoint(7, 3); //topLeft
        MyPoint p1 = new MyPoint(1, 5); //bottomRight
        MyRectangle p2 = new MyRectangle(p0, p1);

        System.out.println(p2.toString());

        System.out.println("    Azalera: " + p2.getAzalera());
        System.out.println("    Perimetroa: " + p2.getPerimetroa());

        /*IDOIAREN TESTA*/
        MyRectangle rec1 = new MyRectangle(new MyPoint(7,3), new MyPoint(1, 5));
        System.out.println(rec1);
        System.out.println("  Perimetroa: " + rec1.getPerimetroa());
        System.out.println("  Azalera: " + rec1.getAzalera());
        System.out.println("");
    }

}
