/**
 *
 * @author lomana.markel
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import enumak.Demarkazioa;
import model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.List;
import java.util.Scanner;

/*BUKATUA DAGO*/
/**
 * Programa honetan Euskal Selekzioaren datuekin egingo dugu lan. Iturria:
 * https://es.wikipedia.org/wiki/Selecci%C3%B3n_de_f%C3%BAtbol_de_Euskadi#Plantilla
 *
 * Programa hau selekzioko partaideen datuak kargatzen hasiko da. Normalena da,
 * datu hauek fitxategi edo datu-base batetik irakurtzea baina oraindik hori ez
 * dakigunez egiten guk programan bertan, metodo baten barruan idatziko ditugu.
 *
 * Gero, horrelako menu bat agertuko zaigu:
 *
 *  **********************************************************
 *  * EUSKAL SELEKZIOA * ---------------------------------- * 1. Partaideen
 * datuak ikusi (Goiburuko egoki eta laburpen azken lerro batekin (Futbolistak:
 * 23 Entren...) * 2. Partaideen datuak ikusi taldekatuta * 3. Futbolariak
 * alfabetikoki inprimatu * 4. Aldaketa ( Sartu zaitez zu beste partaide baten
 * ordez. Horretarako ArrayList-en set metodoa erabiliz) * 5. Bilatu abizenetik
 * (String-en startsWith() metodoa erabiliz adibidez) * z. Irten
 *
 *  * Aukeratu zenbaki bat:
 *
 *  **************************************************************
 */
public class EuskalSelekzioaMenua {

    public static int azkenId = 0;
    public static ArrayList<IntegranteSeleccion> konbokatuak = new ArrayList<>();

    //konbokatuak sortu
    public static ArrayList<IntegranteSeleccion> selekzioOsoaSortu() {
        //ArrayList<IntegranteSeleccion> konbokatuak = new ArrayList<IntegranteSeleccion>(); Goian Statiko moduan

        konbokatuak.add(new Futbolista(++azkenId, "Aitor", "Fernandez", 30, 1, Demarkazioa.POR));
        konbokatuak.add(new Futbolista(++azkenId, "Unai", "Bustinza", 29, 2, Demarkazioa.DEF));
        konbokatuak.add(new Futbolista(++azkenId, "Mikel", "Balenziaga", 33, 3, Demarkazioa.DEF));
        konbokatuak.add(new Futbolista(++azkenId, "Asier", "Ilarremendi", 31, 4, Demarkazioa.MED));
        konbokatuak.add(new Futbolista(++azkenId, "Iñigo", "Martinez", 30, 5, Demarkazioa.DEF));
        konbokatuak.add(new Futbolista(++azkenId, "Mikel", "San Jose", 32, 6, Demarkazioa.MED));
        konbokatuak.add(new Futbolista(++azkenId, "Gaizka", "Larrazabal", 24, 7, Demarkazioa.DEF));
        konbokatuak.add(new Futbolista(++azkenId, "Manu", "Garcia", 35, 8, Demarkazioa.MED));
        konbokatuak.add(new Futbolista(++azkenId, "Aritz", "Aduriz", 40, 9, Demarkazioa.DEL));
        konbokatuak.add(new Futbolista(++azkenId, "Javier", "Eraso", 31, 10, Demarkazioa.MED));
        konbokatuak.add(new Futbolista(++azkenId, "Asier", "Villalibre", 24, 11, Demarkazioa.DEL));
        konbokatuak.add(new Futbolista(++azkenId, "Aihen", "Muñoz", 24, 12, Demarkazioa.DEF));
        konbokatuak.add(new Futbolista(++azkenId, "Iago", "Herrerin", 34, 13, Demarkazioa.POR));
        konbokatuak.add(new Futbolista(++azkenId, "Aritz", "Elustondo", 27, 14, Demarkazioa.DEF));
        konbokatuak.add(new Futbolista(++azkenId, "Jesus", "Areso", 22, 15, Demarkazioa.DEF));
        konbokatuak.add(new Futbolista(++azkenId, "Iñigo", "Vicente", 24, 16, Demarkazioa.DEL));
        konbokatuak.add(new Futbolista(++azkenId, "Daniel", "Vivian", 22, 17, Demarkazioa.DEF));

        konbokatuak.add(new Entrenador("EH", ++azkenId, "Francisco", "Padalino", 50));
        konbokatuak.add(new Entrenador("EH", ++azkenId, "Joseba", "Nuñez", 45));
        konbokatuak.add(new Entrenador("EH", ++azkenId, "Markel", "Lautahandi", 35));

        konbokatuak.add(new Masajista(++azkenId, "Iñaki", "Sertxiberrieta", 50, "Fisioterapeuta", 20));
        konbokatuak.add(new IntegranteSeleccion(++azkenId, "Ander", "Etxeburu", 30));

        return konbokatuak;
    }

    // bukatua
    public static void partaideakIkusi() {
        System.out.println("Partaideak");
        System.out.println("=================");

        for (int i = 0; i < konbokatuak.size(); ++i) {
            if (konbokatuak.get(i) != null) {
                System.out.println(konbokatuak.get(i));
            }
        }
        System.out.println("");

    }

    //bukatua taldeka 
    public static void partaideTaldekatuakIkusi() {
        System.out.println("Partaide Taldekatuak");
        System.out.println("=================");

        System.out.println("Jokalariak");
        System.out.println("=================");

        for (int i = 0; i < konbokatuak.size(); ++i) {
            if (konbokatuak.get(i).getClass() == Futbolista.class) {
                System.out.println(konbokatuak.get(i));
            }
        }
        System.out.println("");

        System.out.println("Entrenatzaileak");
        System.out.println("=================");

        for (int i = 0; i < konbokatuak.size(); ++i) {
            if (konbokatuak.get(i).getClass() == Entrenador.class) {
                System.out.println(konbokatuak.get(i));
            }
        }
        System.out.println("");

        System.out.println("Masajistak");
        System.out.println("=================");

        for (int i = 0; i < konbokatuak.size(); ++i) {
            if (konbokatuak.get(i).getClass() == Masajista.class) {
                System.out.println(konbokatuak.get(i));
            }
        }
        System.out.println("");
    }

    /*EZ DUT SORT EGITEA LORTZEN*/
    public static void futbolariakAlfabetikoki() {
        System.out.println("Jokalariak Alfabetikoki");
        System.out.println("=================");

        konbokatuak.get(1).getApellidos();
        //Collections.sort((List<T>) konbokatuak.get(1), Collections.reverseOrder())

        /*Bistaratzeko*/
        for (int i = 0; i < konbokatuak.size(); ++i) {
            //  konbokatuak.sort(IntegranteSeleccion);
            if (konbokatuak.get(i) != null) {
                System.out.println(konbokatuak.get(i));
            }
        }
        System.out.println("");

    }

    public static void partaideAldaketak() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Aldaketa");
        System.out.println("=================");
        System.out.print("Zein ID-ren gatik aldatu nahi duzu? ");
        int idViejo = sc.nextInt() - 1;
        String izena = "Markel";
        String abizena = "Lomana";
        int adina = 21;

        konbokatuak.get(idViejo).setNombre(izena);
        konbokatuak.get(idViejo).setApellidos(abizena);
        konbokatuak.get(idViejo).setEdad(adina);

        for (int i = 0; i < konbokatuak.size(); ++i) {

            if (konbokatuak.get(i) != null) {
                System.out.println(konbokatuak.get(i));
            }
        }
        System.out.println("");

    }

    public static void bilatuAbizena() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Aldaketa");
        System.out.println("=================");
        System.out.print("Zein abizen bilatu nahi duzu? ");
        String abizena = sc.next();

        for (int i = 0; i < konbokatuak.size(); ++i) {

            if (konbokatuak.get(i).getApellidos().equals(abizena)) {
                System.out.println(konbokatuak.get(i));
            }
        }
        System.out.println("");

    }

    public static void ezabatuPartaidea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ezabaketa");
        System.out.println("=================");
        System.out.print("Zein Partaide(ID) ezabatu nahi duzu? ");
        int id = sc.nextInt();

        konbokatuak.remove(id-1);

    }

    //main bukatua
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        selekzioOsoaSortu();
        int aukera = 0;
        do {
            System.out.println();
            System.out.println("EUSKAL SLEKZIOA");
            System.out.println("====================================");
            System.out.println("1.- Partaideen datuak ikusi ");
            System.out.println("2.- Partaideen datuak ikusi taldekatuta");
            System.out.println("3.- Futbolariak alfabetikoki inprimatu");
            System.out.println("4.- Aldaketa ( Sartu zaitez zu beste partaide baten ordez. Horretarako ArrayList-en set metodoa erabiliz)");
            System.out.println("5.- Bilatu abizenetik");
            System.out.println("6.- Ezabatu Partaidea");
            System.out.println("7.- Irten");
            System.out.println("");
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = sc.nextInt();
            System.out.println("");

            switch (aukera) {
                case 1:
                    partaideakIkusi();
                    break;
                case 2:
                    partaideTaldekatuakIkusi();
                    break;
                case 3:
                    futbolariakAlfabetikoki();
                    break;
                case 4:
                    partaideAldaketak();
                    break;
                case 5:
                    bilatuAbizena();
                    break;
                case 6:
                    ezabatuPartaidea();
                    break;
                case 7:
                    System.out.println("Eskerrik asko programa hau erabiltzearren.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }
        } while (aukera != 7);
    }

}
