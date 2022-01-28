/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import enumak.Demarkazioa;
import java.time.LocalDate;
import java.util.ArrayList;
import model.*;

/**
 *
 * @author lomana.markel
 */
public class PartidakKudeatu extends Partida{

    public static ArrayList<IntegranteSeleccion> konbokatuak = new ArrayList<>();
    public static ArrayList<IntegranteSeleccion> partidaBalioa = new ArrayList<>(20);
    public static int azkenId = 0;

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
                new Masajista(++azkenId, "Ander", "Etxeburu", 30, "Medico", 5));

        return konbokatuak;
    }
    
    public static ArrayList<IntegranteSeleccion> partidaBalioa(){
        
        return null; 
    }
            
    public static void main(String[] args) {
        selekzioOsoaSortu();
        
        
    }

    public PartidakKudeatu(LocalDate data, String aurkaria) {
        super(data, aurkaria);
    }
}
