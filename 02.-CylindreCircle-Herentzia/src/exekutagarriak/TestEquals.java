package exekutagarriak;

import model.Circle;

/**
 *
 * @author lomana.markel
 */
public class TestEquals {

    public static void main(String[] args) {
        Circle p1 = new Circle(7);
        Circle p2 = new Circle(8);
        
        /*Zihurtatzen du*/
        
        if (p1.equals(p2)) {
            System.out.println("Zirukulu bera dira.");
        } else{
            System.out.println("Ez dira zirkulu berdinak");
        }
    }

}
