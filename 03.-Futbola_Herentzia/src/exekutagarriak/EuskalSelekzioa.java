/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lomana.markel
 */
package exekutagarriak;

import enumak.Demarkazioa;
import java.util.ArrayList;
import model.*;

/**
 * Programa honetan Euskal Selekzioko datuekin egingo dugu lan. Iturria:
 * https://es.wikipedia.org/wiki/Selecci%C3%B3n_de_f%C3%BAtbol_de_Euskadi#Plantilla
 *
 *
 *
 */
public class EuskalSelekzioa {

    public static int azkenId = 0;

    /**
     * Programa honek metodo desberdinei deituko die banan banan. Beharbada ez
     * diozu koherentzia handirik topatuko programa osoari. Ariketaren helburua
     * da beste pakete bateko klase hierarkia erabiltzen trebatzea.
     *
     */
    public static void main(String[] args) {

        futbolariBat();
        bestePartaideBatzukSortu();
        selekzioOsoaSortu();
        int ezabatzekoIda = 4;
        if (partaideaEzabatu(ezabatzekoIda)) {
            System.out.println(ezabatzekoIda + " id-a duen partaidea ezabatu da.");
        }
        futbolariBat();
    }

    /**
     * Metodo honek "Asier Villalibre"ri dagokion Futbolista objektua sortu eta
     * formatu honetan inprimatzen du: "Futbolista{id=1, nombre=Asier,
     * apellidos=Villalibre, edad=23, dorsal=11, demarcacion=DEL}" Hori lortzeko
     * Futbolista klasean toString() metodoa birdefinitu beharko duzu. Gainera,
     * Web orrian id-rik ez dagoenez, automatikoki kalkulatzea erabaki dugu.
     * Horretarako, kontadore bat (Adibidez, azkenIda izeneko klase atributu
     * bat) erabili dezakezu partaide bat sortzen den bakoitzean handituko dena.
     * Amaitzeko, Villalibre entrenatzen hasiko da.
     */
    public static void futbolariBat() {
        Futbolista f1 = new Futbolista(++azkenId, "Asier", "Villalibre", 23, 11, Demarkazioa.DEL);
        System.out.println(f1.toString());
        f1.entrenar();
    }

    /**
     * Metodo honek hiru objektu berri sortuko ditu. Pertsona hauei dagokienak:
     * - Javier Clemente - Iñaki Sertxiberrieta - Ander Etxeburu Zein klaseko
     * objektua izan behar du bakoitzak?
     *
     * Objektu bakoitza sortu ondoren, bere datuak inprimatu eta kontzentratu
     * eta bidaiatuko dute
     */
    public static void bestePartaideBatzukSortu() {
        Entrenador e1 = new Entrenador("EH", 100, "Javier", "Clemente", 65);
        System.out.println(e1.toString());
        Entrenador e2 = new Entrenador("EH", 101, "Iñaki", "Sertxiberrieta", 60);
        System.out.println(e1.toString());
        Entrenador e3 = new Entrenador("EH", 102, "Ander", "Etxaburu", 30);

        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());

        e1.concentrarse();
        e1.viajar();
    }

    /**
     * Selekzio osoaren datuak gorde "selekzioa" deitutako IntegranteSeleccion
     * klaseko ArrayList estatiko baten.
     *
     */
    public static void selekzioOsoaSortu() {
        ArrayList<IntegranteSeleccion> konbokatuak = new ArrayList<IntegranteSeleccion>();
        konbokatuak.add(new Futbolista(++azkenId, "Aitor", "Fernandez", 30, 1, Demarkazioa.POR));
        konbokatuak.add(new Futbolista(++azkenId,"Unai","Bustinza", 29, 2, Demarkazioa.DEF));
        konbokatuak.add(new Futbolista(++azkenId,"Mikel","Balenziaga", 33, 3, Demarkazioa.DEF));
        konbokatuak.add(new Futbolista(++azkenId,"Asier","Ilarremendi", 31, 4, Demarkazioa.MED));
        konbokatuak.add(new Futbolista(++azkenId,"Iñigo","Martinez", 30, 5, Demarkazioa.DEF));
        konbokatuak.add(new Futbolista(++azkenId,"Mikel","San Jose", 32, 6, Demarkazioa.MED));
        konbokatuak.add(new Futbolista(++azkenId,"Gaizka","Larrazabal", 24, 7, Demarkazioa.DEF));
        konbokatuak.add(new Futbolista(++azkenId,"Manu","Garcia", 35, 8, Demarkazioa.MED));
        konbokatuak.add(new Futbolista(++azkenId,"Aritz","Aduriz", 40, 9, Demarkazioa.DEL));
        konbokatuak.add(new Futbolista(++azkenId,"Javier","Eraso", 31, 10, Demarkazioa.MED));
        konbokatuak.add(new Futbolista(++azkenId,"Asier","Villalibre", 24, 11, Demarkazioa.DEL));
        konbokatuak.add(new Futbolista(++azkenId,"Aihen","Muñoz", 24, 12, Demarkazioa.DEF));
        konbokatuak.add(new Futbolista(++azkenId,"Iago","Herrerin", 34, 13, Demarkazioa.POR));
        konbokatuak.add(new Futbolista(++azkenId,"Aritz","Elustondo", 27, 14, Demarkazioa.DEF));
        konbokatuak.add(new Futbolista(++azkenId,"Jesus","Areso", 22, 15, Demarkazioa.DEF));
        konbokatuak.add(new Futbolista(++azkenId,"Iñigo","Vicente", 24, 16, Demarkazioa.DEL));
        konbokatuak.add(new Futbolista(++azkenId,"Daniel","Vivian", 22, 17, Demarkazioa.DEF));
        
        konbokatuak.add(new Entrenador("EH", ++azkenId,"Francisco","Padalino", 50));
        konbokatuak.add(new Entrenador("EH", ++azkenId,"Joseba","Nuñez", 45));
        konbokatuak.add(new Entrenador("EH", ++azkenId,"Markel","Lautahandi", 35));
        
        konbokatuak.add(new Masajista("EH", ++azkenId,"Markel","Lautahandi", 35));
        konbokatuak.add(new Masajista("EH", ++azkenId,"Markel","Lautahandi", 35));
    }

    /**
     * ArrayListetik objektu bat ezabatzen du. Aurkitzen ez badu false itzuliko
     * du
     *
     * @param id Ezabatu nahi den partaidearen id-a
     * @return
     */
    public static boolean partaideaEzabatu(int id) {

        return false;
    }
}
