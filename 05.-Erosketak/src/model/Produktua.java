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
public class Produktua {

    private char[] kodea;
    private String izena;
    private double prezioa;

    public Produktua(String kodea, String izena, double prezioa) {
        this.kodea = new char[kodea.length()];

        for (int i = 0; i < kodea.length(); i++) {
            this.kodea[i] = kodea.charAt(i);
        }
        this.izena = izena;
        this.prezioa = prezioa;
    }

    public Produktua(char[] kodea, String izena, double prezioa) {
        this.kodea = kodea;
        this.izena = izena;
        this.prezioa = prezioa;
    }

    public char[] getKodea() {
        return kodea;
    }

    public void setKodea(char[] kodea) {
        this.kodea = kodea;
    }

    public String getIzena() {
        return izena;
    }

    public String getStrKodea() {
        return new String(kodea);
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    public double getPrezioa() {
        return prezioa;
    }

    public void setPrezioa(double prezioa) {
        this.prezioa = prezioa;
    }

    @Override
    public String toString() {
        return "Produktua=" + getStrKodea() + ", " + izena + ", " + prezioa + '}';
    }

}
