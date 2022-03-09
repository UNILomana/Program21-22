package exec;

import java.util.ArrayList;
import model.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lomana.markel
 */
public class Test41 {

    public static ArrayList<Kutxa> kutxaSorta = new ArrayList<>();

    //konbokatuak sortu
    public static ArrayList<Kutxa> kutxaSortaSortu() {
        kutxaSorta.add(new Kutxa(new Puntua(1, 1), new Puntua(1, 1), 1));
        kutxaSorta.add(new Kutxa(new Puntua(0, 0), new Puntua(2, 2), 2));
        kutxaSorta.add(new Kutxa(new Puntua(0, 3), new Puntua(1, 3), 3));
        kutxaSorta.add(new Kutxa(new Puntua(1, 4), new Puntua(6, 4), 4));
        kutxaSorta.add(new Kutxa(new Puntua(1, 5), new Puntua(1, 5), 5));
        kutxaSorta.add(new Kutxa(new Puntua(0, 6), new Puntua(1, 6), 6));
        kutxaSorta.add(new Kutxa(new Puntua(1, 7), new Puntua(7, 7), 7));
        kutxaSorta.add(new Kutxa(new Puntua(7, 2), new Puntua(10, 4), 3));
        kutxaSorta.add(new Kutxa(new Puntua(0, 9), new Puntua(9, 18), 10));
        kutxaSorta.add(new Kutxa(new Puntua(1, 1), new Puntua(10, 10), 10));
        return kutxaSorta;
    }

    public static void ikusiKutxaSorta() {
        for (int i = 0; i < kutxaSorta.size(); i++) {
            if (kutxaSorta.get(i) != null) {
                System.out.println(kutxaSorta.get(i));
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        kutxaSortaSortu();

        ikusiKutxaSorta();

        System.out.println("Handiena da:");
        System.out.println(Kutxa.handiena(kutxaSorta));
        
        //getErtzenLuzeera metodoa
        System.out.println(kutxaSorta.get(1).getErtzenLuzeera());
    }
}
