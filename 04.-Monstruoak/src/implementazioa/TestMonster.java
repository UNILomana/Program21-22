/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementazioa;

/**
 *
 * @author lomana.markel
 */
public class TestMonster {

    public static void main(String[] args) {
        // Program at the specification defined in the superclass/interface.
        // Declare instances of the superclass, substituted by subclasses.
        Monstruosoa m1 = new FireMonster("r2u2");   // upcast
        Monstruosoa m2 = new WaterMonster("u2r2");  // upcast
        Monstruosoa m3 = new StoneMonster("r2r2");  // upcast
        Monstruosoa m4 = new FilthyWaterMonster("r2r2");  // upcast

        // Invoke the actual implementation
        System.out.println(m1.attack());  // Run FireMonster's attack()
        //Attack with fire!
        System.out.println(m2.attack());  // Run WaterMonster's attack()
        //Attack with water!
        System.out.println(m3.attack());  // Run StoneMonster's attack()
        //Attack with stones!
        System.out.println(m4.attack());

        // m1 dies, generate a new instance and re-assign to m1.
        m1 = new StoneMonster("a2b2");  // upcast
        System.out.println(m1.attack());  // Run StoneMonster's attack()
        //Attack with stones!

        // We have a problem here!!!
        //Monster m5 = new Monster("u2u2");
        // System.out.println(m5.attack());  // garbage!!!
        //!^_&^$@+%$* I don't know how to attack!
    }
}
