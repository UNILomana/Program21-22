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
public class StoneMonster implements Monstruosoa {
   
     String name;
    /** Constructs a StoneMonster instance with the given name */
   public StoneMonster(String name) {
      this.name=name;
   }
   /** Subclass provides actual implementation for attack() */
   
   public String attack() {
      return "Attack with stones!";
   }
}