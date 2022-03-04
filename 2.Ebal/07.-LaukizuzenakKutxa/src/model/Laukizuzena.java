/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author lomana.markel
 */
public class Laukizuzena implements Marrazkigarria {

    /*JASJAJJA PROTECTED :)*/
    private Puntua erpinBat;
    private Puntua kontrakoErpina;

    public Laukizuzena(Puntua erpinBat, Puntua kontrakoErpina) {
        this.erpinBat = erpinBat;
        this.kontrakoErpina = kontrakoErpina;
    }

    public Laukizuzena(int x1, int y1, int x2, int y2) {
        this.erpinBat = new Puntua(x1, y1);
        this.kontrakoErpina = new Puntua(x2, y2);
    }

    public Puntua getErpinBat() {
        return erpinBat;
    }

    public Puntua getKontrakoErpina() {
        return kontrakoErpina;
    }

    /*HEMEN SORTU BEHAR ZEN PUNTU BERRIAK?*/
    public Puntua[] getLauErpinenArraya() {
        Puntua behekoErpinBat = new Puntua(kontrakoErpina.getX(), erpinBat.getY());
        Puntua behekoKontrakoErpina = new Puntua(erpinBat.getX(), kontrakoErpina.getY());
        Puntua[] erpinenArraya = {erpinBat, behekoErpinBat, kontrakoErpina, behekoKontrakoErpina};

        return erpinenArraya;
    }

    /*HEMEN SORTU BEHAR ZEN PUNTU BERRIAK? 2 alDIZ */
    public ArrayList<Puntua> getLauErpinenArrayLista() {
        Puntua behekoErpinBat = new Puntua(kontrakoErpina.getX(), erpinBat.getY());
        Puntua behekoKontrakoErpina = new Puntua(erpinBat.getX(), kontrakoErpina.getY());
        ArrayList<Puntua> arrayListErpinak = new ArrayList<>();
        arrayListErpinak.add(erpinBat);
        arrayListErpinak.add(behekoErpinBat);
        arrayListErpinak.add(kontrakoErpina);
        arrayListErpinak.add(behekoKontrakoErpina);
        return arrayListErpinak;
    }

    public String toString() {
        return Arrays.toString(getLauErpinenArraya());
    }

    public void marraztu() {
        System.out.println(this + "laukia GUI baten marraztua izan da.");
    }

    //test2.java dago testeatua
    public boolean isInside(Puntua puntu1) {

        int xPuntua = puntu1.getX();
        int yPuntua = puntu1.getY();

        if ((xPuntua > erpinBat.getX() && xPuntua < kontrakoErpina.getX()) && (yPuntua > erpinBat.getY() && yPuntua < kontrakoErpina.getY())) {
            return true;
        } else {
            return false;
        }
    }

    /*
    public void jiratu(){
        
    }*/
    @Override
    public void marraztu(Graphics g) {
        g.setColor(Color.blue);
        g.drawRect(50, 50, 500, 500);
    }

}
