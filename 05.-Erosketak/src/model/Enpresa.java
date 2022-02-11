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
public class Enpresa implements Bezeroa {

   private int kodea;
   private String izenJuridikoa;
   private String izenKomertziala;
   private String helbidea;
   private String[] kontaktuenEmailak;

    public Enpresa(int kodea, String izenJuridikoa, String izenKomertziala, String helbidea, String[] kontaktuenEmailak) {
        this.kodea = kodea;
        this.izenJuridikoa = izenJuridikoa;
        this.izenKomertziala = izenKomertziala;
        this.helbidea = helbidea;
        this.kontaktuenEmailak = kontaktuenEmailak;
    }

   
    public int getKodea() {
        return this.kodea=kodea;
    }

    public String getIzena() {
        return this.izenJuridikoa=izenJuridikoa;
    }
    public String getAbizena() {
        return this.izenKomertziala=izenKomertziala;
    }

    @Override
    public String getHelbidea() {
        return this.helbidea=helbidea;
    }

    public String getEmaila() {
        return this.kontaktuenEmailak[0]=kontaktuenEmailak[0];

    }

    @Override
    public String toString() {
        return "Enpresa{" + kodea + ", " + izenJuridikoa + ", " + helbidea + ", " + kontaktuenEmailak + '}';
    }
    
}
