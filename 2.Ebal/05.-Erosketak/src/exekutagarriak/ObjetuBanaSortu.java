/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.ArrayList;
import model.*;

/**
 *
 * @author lomana.markel
 */
public class ObjetuBanaSortu {

    public static void main(String[] args) {
        /*Pertsona sortu eta bistaratu*/
        Bezeroa karlos = new Pertsona(1, "Karlos", "Argiñano", "Hondartza Pasialekua z/g ZARAUTZ", "kargi@uni.eus");
        System.out.println("karlos => " + karlos);
        
        /*Produktua sortu eta bistaratu*/
        Produktua toshiba = new Produktua("C01", "Toshiba Satellite Pro", 450);
        System.out.println("toshiba => " + toshiba);

        /*ArrayList berrietan gorde produktua eta sortu unitateak*/
        ArrayList<Produktua> erositakoProduktuak = new ArrayList<>();
        erositakoProduktuak.add(toshiba);
        ArrayList<Integer> erosketaHonetakounitateak = new ArrayList<>();
        erosketaHonetakounitateak.add(15);
        
        /*Erosketa berria egin, goiko informazioarekin*/
        
        Erosketa gaurkoErosketa = new Erosketa("E18-02", "2018-10-30", karlos, erositakoProduktuak, erosketaHonetakounitateak, 6750);
        System.out.println("Egindako Erosketa =>" + gaurkoErosketa);
        System.out.println("toString Luzea:");
        System.out.println(gaurkoErosketa.toStringLuzea());
        
        /*Balidatu guztira kalkulatutako prezioa ondo dagoen*/
        if (gaurkoErosketa.guztiraEgiaztatu()) {
            System.out.println("Datu zuzenak.");
        } else {
            System.out.println("'guztira' atributua ez dator bat produktuen zerrendak dioenarekin.");
        }
    }
}
