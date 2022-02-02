/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import model.*;

import enumak.Demarkazioa;
import java.util.ArrayList;

/**
 *
 * @author lomana.markel
 */
public class TestJokalariak {
    public static void main(String[] args) {
        Futbolista f1 = new Futbolista(1,"Aritz", "Aduriz", 40, 17, Demarkazioa.DEL);
        System.out.println(f1.toString());
        
        ArrayList<Futbolista> konbokatuak = new ArrayList<Futbolista>();

        
        //konbokatuak.add(super,super.nombre,super.apellidos,super.edad);
    }
}
