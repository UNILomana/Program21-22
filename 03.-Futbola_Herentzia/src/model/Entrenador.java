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
public class Entrenador extends IntegranteSeleccion {
    private String idFederacion;
    
    /**
     * Entrenadorearen idFederazioa zehaztuko du.
     * @param idFederacion 
     */
    public Entrenador(String idFederacion, int id, String nombre, String apellidos, int edad) {   
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    /**
     * Entrenadorearen idFederazioa itzuliko du.
     * @return 
     */
    public String getIdFederacion() {
        return idFederacion;
    }
    /**
     * Entrenadorearen idFederazioa aldatuko du.
     * @param idFederacion 
     */
    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    /**
     * Entrenamendu bat zuzenduko du.
     */
    public void dirigirEntrenamiento(){
        
    }
    /**
     * Partida bat zuzenduko du.
     */
    public void dirigirPartido(){
        
    }

    @Override
    public String toString() {
        return  "  ID: " + id +
                ", Nombre: " + nombre +
                ", Apellidos: " + apellidos +
                ", Edad: " + edad + 
                ", idFederacion=" + idFederacion;
    }
    
}
