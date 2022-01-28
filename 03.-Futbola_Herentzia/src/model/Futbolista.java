/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import enumak.Demarkazioa;

/**
 *
 * @author lomana.markel
 */
public class Futbolista extends IntegranteSeleccion{
    private int dorsal;
    private Demarkazioa demarcacion; //Enum-ean

    public Futbolista(int id, String nombre, String apellidos, int edad,
                      int dorsal, Demarkazioa demarcacion) {
        
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    /**
     * Jokalariaren dortsalaren balorea itzuliko du.
     * @return 
     */
    public int getDorsal() {
        return dorsal;
    }
    /**
     * Jokalariaren dortsalaren balorea zehaztuko du.
     * @param dorsal 
     */
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    /**
     * Jokalariaren posizioa balorea itzuliko du.
     * @return 
     */
    public Demarkazioa getDemarcacion() {
        return demarcacion;
    }
    /**
     * Jokalariaren posizio balorea zehaztuko du.
     * @param demarcacion 
     */
    public void setDemarcacion(Demarkazioa demarcacion) {
        this.demarcacion = demarcacion;
    }
    /**
     * Jokalariak entrenatuko du.
     */
    public void entrenar(){
        System.out.println("Jokalaria entrenatzera doa");
    }
    /**
     * Jokalariak partida bat jokatuko du.
     */
    public void jugarPartido(){
        System.out.println("Jokalaria partidua jolastera doa.");
    }

    @Override
    public String toString() {
        return  "Id: " + id +
                ", Nombre: " + nombre +
                ", Appelidos: " + apellidos +
                ", Edad: " + edad +
                ", Dorsal: " + dorsal + 
                ", Demarcacion: " + demarcacion;
    }

    
    
}
