/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Arrays;

/*PROTECTED ZEUDEN KONTRAKOeRPINA ETA ERPINbAT ALDATU DIRA PRIBATURA */

/**
 *
 * @author lomana.markel
 */
public class Kutxa extends Laukizuzena{
   private int altuera;
   

    public Kutxa(Puntua erpina, Puntua kontrakoErpina, int altuera){
        super(erpina, kontrakoErpina);
        this.altuera = altuera;
        
    }
    public int getAltuera(){
        return altuera;
    }
    
    
    public  double getBolumena(){
        int a,b;
        a = this.getKontrakoErpina().getX()- this.getErpinBat().getX(); //protected erabili dot ez this.
        b = this.getKontrakoErpina().getY() - this.getErpinBat().getY();
       
        double bolumena1 = a * b * this.altuera;
        return bolumena1;
    }
    /*ONDO DAGO BOLUMEN KALKULUAK*/
    public boolean isHandiagoa(Kutxa besteKutxaBat){
        /*ONDO NUEKAN BERAK EZ DU ERABILTZEN PRIVATE ORDUAN ONDO*/
        int a,b;
        a = this.getKontrakoErpina().getX()- this.getErpinBat().getX(); //protected erabili dot ez this.
        b = this.getKontrakoErpina().getY() - this.getErpinBat().getY();
        
        
        double bolumena1 = a * b * this.altuera;
        
        int c,d;
        c = besteKutxaBat.getKontrakoErpina().getX() - besteKutxaBat.getErpinBat().getX();
        d = besteKutxaBat.getKontrakoErpina().getY() - besteKutxaBat.getErpinBat().getY(); 
        
        double bolumena2 = c * d * besteKutxaBat.altuera;
        
        if (bolumena1 > bolumena2){
            return true;
        } else{
            return false;
        }
        
        
    }

    @Override
    public String toString() {
      return "Oinarria: " + super.toString() + "eta altuera " + altuera + " dituen kutxa GUI batean marraztua izan da";
    }
    @Override
    public void marraztu(){
        System.out.println("Oinarria: " + Arrays.toString(getLauErpinenArraya()) + " eta altuera " + altuera + " dituen kutxa GUI batean marraztua izan da");
    }
    
    //Test41.java dago testeatua
    public String getErtzenLuzeera(){
        int a,b;
        a = this.getKontrakoErpina().getX()- this.getErpinBat().getX(); //protected erabili dot ez this.
        b = this.getKontrakoErpina().getY() - this.getErpinBat().getY();
       
        return "Lehenengo ertza: " + a + ", bigarren ertza: " + b;
    }
    
    //Test41.java dago testeatua
    public static Kutxa handiena(ArrayList<Kutxa> kutxaSorta){
        
        double handiena = kutxaSorta.get(0).getBolumena();
        int posizioa = 0;
        
        for (int i=0; i < kutxaSorta.size(); i++){
            if (handiena < kutxaSorta.get(i).getBolumena()){
                handiena = kutxaSorta.get(i).getBolumena();
                
                posizioa = i;
            }
        }
        
        return kutxaSorta.get(posizioa);
    }
}
