/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herentzia.abstraktoak;



/**
 *
 * @author lomana.markel
 */
public class FilthyWaterMonster extends WaterMonster  {
   /** Constructs a StoneMonster instance with the given name */
   public FilthyWaterMonster(String name) {
      super(name);
   }
   /** Subclass provides actual implementation for attack() */
   @Override
   public String attack() {
      return "Attack with Filthy Water!";
   }
}