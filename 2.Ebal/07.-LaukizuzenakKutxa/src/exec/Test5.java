/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;

import java.util.ArrayList;
import java.util.Scanner;
import model.*;

/**
 *
 * @author lomana.markel
 */
public class Test5 {

    private static ArrayList<Kutxa> kutxaSorta = new ArrayList<>();

    //
    // Test5 programan, eskatu erabiltzaileari 10 kutxaren datuak eta taula batean erakutsi eurei buruzko informazioa.
    //5 eskatuko zaizkio 10 gehiegi da
    //
    public static ArrayList<Kutxa> hamarKutxaSortu() {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1 + ".go KUTXA:");

            System.out.print("Sartu Kutxaren erpin bat: ");
            Puntua puntua1 = new Puntua(in.nextInt(), in.nextInt());

            System.out.print("Sartu Kutxaren kontrako erpina: ");
            Puntua puntua2 = new Puntua(in.nextInt(), in.nextInt());

            System.out.print("Sartu Kutxaren altuera: ");
            int altuera3 = in.nextInt();

            Kutxa kutxa1 = new Kutxa(puntua1, puntua2, altuera3);
            kutxaSorta.add(kutxa1);
        }

        return kutxaSorta;
    }

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
        System.out.println("KUTXEN LISTA");
        System.out.println("========================");
        System.out.println("Lau Erpinak\t\t\t\tAltuera");

        for (int i = 0; i < kutxaSorta.size(); i++) {
            if (kutxaSorta.get(i) != null) {

                System.out.println(kutxaSorta.get(i).getLauErpinenArrayLista().toString() + "\t " + kutxaSorta.get(i).getAltuera());
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        //hamarKutxaSortu(); //zuk sortzeko
        kutxaSortaSortu();   //kutxa ya sortuak
        ikusiKutxaSorta();
    }
}
