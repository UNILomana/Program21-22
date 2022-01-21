package exekutagarriak;

import model.MyPoint;

/**
 *
 * @author lomana.markel
 */
public class TestEquals {

    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(7, 8);
        MyPoint p2 = new MyPoint(7, 8);
        
        /*Zihurtatzen du ea puntu berdina den*/
        
        if (p1.equals(p2)) {
            System.out.println("Espazioko puntu bera adierazten dute.");
        } else{
            System.out.println("Ez daude espazioko puntu berdinean");
        }
    }

}
