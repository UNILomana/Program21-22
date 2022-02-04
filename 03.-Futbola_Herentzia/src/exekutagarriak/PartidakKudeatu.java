/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import enumak.Demarkazioa;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import model.*;
import java.util.Scanner;

/*LEHENENGO SELEKZIO OSOA SORTZEN DA,
      5 PARTIDA SORTZEN DIRA AUTOMATIKOKI,
      PARTIDA BAT SORTZEN DA ERABILTZAILEAREN DATUEKIN, 
      AZKENIK, PARTIDAK BISTARATU.
 */
/**
 *
 * @author lomana.markel
 */
public class PartidakKudeatu extends Partida {

    public static ArrayList<IntegranteSeleccion> konbokatuak = new ArrayList<>();
    //public static ArrayList<Futbolista> txartelakJarri = new ArrayList<Futbolista>();

    public static int azkenId = 0;
    public static int partidaId = 0;
    public static Partida[] partidak = new Partida[20];

    public static ArrayList<IntegranteSeleccion> selekzioOsoaSortu() {

        //ArrayList<IntegranteSeleccion> konbokatuak = new ArrayList<IntegranteSeleccion>(); Goian Statiko moduan
        konbokatuak.add(
                new Futbolista(++azkenId, "Aitor", "Fernandez", 30, 1, Demarkazioa.POR));
        konbokatuak.add(
                new Futbolista(++azkenId, "Unai", "Bustinza", 29, 2, Demarkazioa.DEF));
        konbokatuak.add(
                new Futbolista(++azkenId, "Mikel", "Balenziaga", 33, 3, Demarkazioa.DEF));
        konbokatuak.add(
                new Futbolista(++azkenId, "Asier", "Ilarremendi", 31, 4, Demarkazioa.MED));
        konbokatuak.add(
                new Futbolista(++azkenId, "Iñigo", "Martinez", 30, 5, Demarkazioa.DEF));
        konbokatuak.add(
                new Futbolista(++azkenId, "Mikel", "San Jose", 32, 6, Demarkazioa.MED));
        konbokatuak.add(
                new Futbolista(++azkenId, "Gaizka", "Larrazabal", 24, 7, Demarkazioa.DEF));
        konbokatuak.add(
                new Futbolista(++azkenId, "Manu", "Garcia", 35, 8, Demarkazioa.MED));
        konbokatuak.add(
                new Futbolista(++azkenId, "Aritz", "Aduriz", 40, 9, Demarkazioa.DEL));
        konbokatuak.add(
                new Futbolista(++azkenId, "Javier", "Eraso", 31, 10, Demarkazioa.MED));
        konbokatuak.add(
                new Futbolista(++azkenId, "Asier", "Villalibre", 24, 11, Demarkazioa.DEL));
        konbokatuak.add(
                new Futbolista(++azkenId, "Aihen", "Muñoz", 24, 12, Demarkazioa.DEF));
        konbokatuak.add(
                new Futbolista(++azkenId, "Iago", "Herrerin", 34, 13, Demarkazioa.POR));
        konbokatuak.add(
                new Futbolista(++azkenId, "Aritz", "Elustondo", 27, 14, Demarkazioa.DEF));
        konbokatuak.add(
                new Futbolista(++azkenId, "Jesus", "Areso", 22, 15, Demarkazioa.DEF));
        konbokatuak.add(
                new Futbolista(++azkenId, "Iñigo", "Vicente", 24, 16, Demarkazioa.DEL));
        konbokatuak.add(
                new Futbolista(++azkenId, "Daniel", "Vivian", 22, 17, Demarkazioa.DEF));

        konbokatuak.add(
                new Entrenador("EH", ++azkenId, "Francisco", "Padalino", 50));
        konbokatuak.add(
                new Entrenador("EH", ++azkenId, "Joseba", "Nuñez", 45));
        konbokatuak.add(
                new Entrenador("EH", ++azkenId, "Markel", "Lautahandi", 35));

        konbokatuak.add(
                new Masajista(++azkenId, "Iñaki", "Sertxiberrieta", 50, "Fisioterapeuta", 20));
        konbokatuak.add(
                new IntegranteSeleccion(++azkenId, "Ander", "Etxeburu", 30));

        return konbokatuak;
    }

    public static ArrayList<IntegranteSeleccion> partidaBalioa() {

        return null;
    }

    public PartidakKudeatu(LocalDate data, String aurkaria, ArrayList txartelakJarri) {
        super(data, aurkaria, txartelakJarri);
    }

    public static void partidakAsmatu() {
        /*Partida bakoitzean ArrayList bat dago, beraz sortu egin behar dira hainbat,
          nahi beste txatelekin*/
        ArrayList<Futbolista> txartelakJarri1 = new ArrayList<Futbolista>();    //1go partidako txartelak
        txartelakJarri1.add((Futbolista) konbokatuak.get(1));                   //1.jokalariari txartela jarri
        txartelakJarri1.add((Futbolista) konbokatuak.get(5));                   //5.jokalariari txartela jarri
        txartelakJarri1.add((Futbolista) konbokatuak.get(6));                   //6.jokalariari txartela jarri
        txartelakJarri1.add((Futbolista) konbokatuak.get(1));

        ArrayList<Futbolista> txartelakJarri2 = new ArrayList<Futbolista>();    //2go partidako txartelak
        txartelakJarri2.add((Futbolista) konbokatuak.get(2));                   //2.jokalariari txartela jarri
        txartelakJarri2.add((Futbolista) konbokatuak.get(3));                   //3.jokalariari txartela jarri
        txartelakJarri2.add((Futbolista) konbokatuak.get(1));
        txartelakJarri2.add((Futbolista) konbokatuak.get(1));
        txartelakJarri2.add((Futbolista) konbokatuak.get(2));

        ArrayList<Futbolista> txartelakJarri3 = new ArrayList<Futbolista>();    //3go partidako txartelak
        txartelakJarri3.add((Futbolista) konbokatuak.get(10));                   //10.jokalariari txartela jarri
        txartelakJarri3.add((Futbolista) konbokatuak.get(11));                   //11.jokalariari txartela jarri
        txartelakJarri3.add((Futbolista) konbokatuak.get(1));

        partidak[0] = new Partida(LocalDate.parse("2011-02-02"), "Betis", txartelakJarri1);
        partidak[++partidaId] = new Partida(LocalDate.parse("2020-01-12"), "Barcelona", txartelakJarri2);
        /* partidak[++partidaId] = new Partida(LocalDate.parse("2022-06-15"), "fuenla", txartelakJarri3);
        partidak[++partidaId] = new Partida(LocalDate.parse("2021-05-31"), "Huesca", txartelakJarri1);      //Txartel berdinak daude jarrita
        partidak[++partidaId] = new Partida(LocalDate.parse("2019-10-02"), "Tenerife", txartelakJarri3);    ////Txartel berdinak daude jarrita*/

    }

    public static void partidaBatenDatuakEskatu() {
        ArrayList<Futbolista> txartelakJarri4 = new ArrayList<Futbolista>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Noiz jokatu zen partida(Adb: 2020-12-02)? ");
        String data = sc.next();
        System.out.print("Noren aurka jokatu zen?");
        String taldea = sc.next();
        System.out.print("Zenbatgarren jokalariari jarri nahi diozu txartela?");  //Oraingoz bakarrik txartel bat gehitu al da partidan 
        int jokalaria = sc.nextInt();
        txartelakJarri4.add((Futbolista) konbokatuak.get(jokalaria - 1));

        partidak[++partidaId] = new Partida(LocalDate.parse(data), taldea, txartelakJarri4);
    }

    public static void partidakIkusi() {
        for (int i = 0; i < partidak.length; i++) {
            if (partidak[i] != null) {
                //System.out.println(partidak[i].toString());
                System.out.println(partidak[i]);
            }
        }
    }

    public static void estatistikakKalkulatu() {
        System.out.println("Jolastutako partida kopurua: " + (partidaId + 1));

        //Jokalari bakoitzaren txartelak
        /*Lortzen dut jokalari baten partida denetako txartelak bistaratzea,
          orain kontatu egin behar dira*/
        for (int i = 0; i < konbokatuak.size(); i++) {
            int count = 0;
            if (konbokatuak.get(i) != null) {
                for (int j = 0; j <= partidaId; j++) {                                                      //partida denen artean bilatzeko loop-a, partidaId ipini luzeera erreala ez delako partidak[20]
                    if (partidak[j] != null) {
                        for (int k = 0; k < partidak[j].getTxartelakJarri().size(); k++) {                  //partida bakoitzaren barruan loop de txartelak
                            if (konbokatuak.get(i) == (partidak[j].getTxartelakJarri().get(k))) {
                                System.out.println(partidak[j].getTxartelakJarri().get(k));
                                count = count + 1;
                            }

                        }

                    }

                }

            }
            /*SAIATU. Txartel kopurua bakarrik ikustera txartela duten jokalariek*/
            System.out.println("Txartel kopurua: " + count);
        }
    }

    

    public static void main(String[] args) {
        selekzioOsoaSortu();
        partidakAsmatu();
        //partidaBatenDatuakEskatu();
        // partidakIkusi();
        estatistikakKalkulatu();
    }

}
