package exec;

import model.Kutxa;
import model.Puntua;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lomana.markel
 */
public class Test4 {
    public static void main(String[] args) {
        
        Kutxa k1 = new Kutxa(new Puntua(2,17),new Puntua(6,25),4); //Haritzen puntua
        System.out.println(k1.getBolumena());
        Kutxa k2 = new Kutxa(new Puntua(20,20),new Puntua(26,24),6);
        
        System.out.println("Kutxa handiena marraztuko dugu, hau da bolumen handiena daukana:");
        if (k1.isHandiagoa(k2)){
            k1.marraztu();      
        } else
            k2.marraztu();      //sout  ipini detzat
    }
}

