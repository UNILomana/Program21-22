/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;
import enumak.Norantza;
/*DENA ONDO EGON BEHARKO ZEN*/
/**
 * @author lomana.markel
 */
public class Puntua implements Marrazkigarria {
    private int x;
    private int y;
    private static int sortutakoPuntuak;
    private Norantza noranzkoa;

    /*Penalizatua zegoen orain ondo, +0.5 8.25*/
    public Puntua() {
        sortutakoPuntuak++;
    }

    public Puntua(int x, int y) {
        this.x = x;
        this.y = y;
        sortutakoPuntuak++;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static int getSortutakoPuntuak() {
        return sortutakoPuntuak;
    }
    
    /*Ez da behar setSortutakoPuntuak*/
    public static void setSortutakoPuntuak() {
        Puntua.sortutakoPuntuak = ++sortutakoPuntuak;
    }

    @Override
    public String toString() {
        return "("  + x + ", " + y + ")";
    }

    /*Ez da behar*/
    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Puntua other = (Puntua) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }

   
    public boolean isEzkerreragoThan(Puntua bestePuntuBat){
        if (this.x < bestePuntuBat.getX()){
            return true;
        } else {
            return false;
        } 
    }

    
    public void marraztu(){
        System.out.println( this + " puntua GUI baten marraztua izan da."); //"(" + x + ", " + y + ")"
    }
    
    /*Test1.java dago testeatua*/
    public void mugitu(int zenbat,Norantza noranzkoa){
        //norantza: gira bera ezker eskuma
        if (noranzkoa == Norantza.GORA){
            System.out.println("Gora doa");
            setX(x + zenbat);
        } else if (noranzkoa == Norantza.BEHERA){
            System.out.println("Behera doa");
            setX(x - zenbat);
        }else if (noranzkoa == Norantza.EZKER){
            System.out.println("Ezker doa");
            setY(y - zenbat);
        }else if (noranzkoa == Norantza.ESKUMA){
            System.out.println("Eskuma doa");
            setY(y + zenbat);
        }
        
        System.out.println(toString() + "-ra mugitu da.");
        
    }
   
}
