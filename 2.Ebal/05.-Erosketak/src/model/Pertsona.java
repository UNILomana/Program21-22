/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author lomana.markel
 */
public class Pertsona implements Bezeroa {

    private int kodea;
    private String izena;
    private String abizena;
    private String helbidea;
    private String emaila;

    public Pertsona(int kodea, String izena, String abizena, String helbidea, String emaila) {
        this.kodea = kodea;
        this.izena = izena;
        this.abizena = abizena;
        this.helbidea = helbidea;
        this.emaila = emaila;
    }

    
    public int getKodea() {
        return this.kodea = kodea;
    }

    public String getIzena() {
       return this.izena = izena;  
    }
    public String getAbizena() {
       return this.abizena = abizena;  
    }

    public String getHelbidea() {
        return this.helbidea=helbidea;
    }

   
    public String getEmaila() {
        return this.emaila=emaila;

    }

    @Override
    public String toString() {
        return "Pertsona{" + kodea + ", " + izena +" "+ abizena + ", " + helbidea + ", " + emaila + '}';
    }
    
}
