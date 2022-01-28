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
public class Masajista extends IntegranteSeleccion {
    private String titulacion;
    private int aniosExperiencia;

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
    public void darMasaje(){
        System.out.println("Esta dando un masaje");
    }
     @Override
    public String toString() {
        return "  ID: " + id +
               ", Nombre: " + nombre +
               ", Apellidos: " + apellidos +
               ", Edad: " + edad + 
               ", Titulación: " + titulacion +
               ", Años de experiencia: " + aniosExperiencia;
    }
}
