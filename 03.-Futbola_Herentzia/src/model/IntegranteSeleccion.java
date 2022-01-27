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
public class IntegranteSeleccion {
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;

    public IntegranteSeleccion(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    /**
     * Jokalariaren izena itzuliko du.
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Jokalariaren izena zehaztuko du.
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Jokalariaren abizenak itzuliko ditu.
     * @return 
     */
    public String getApellidos() {
        return apellidos;
    }
    /**
     * Jokalariaren abizenak zehaztuko ditu.
     * @param apellidos 
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    /**
     * Jokalariaren urteak itzuliko ditu.
     * @return 
     */
    public int getEdad() {
        return edad;
    }
    /**
     * Jokalariaren urteak zehaztuko ditu.
     * @param edad 
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * Jokalariak batu egingo dira.
     */
    public void concentrarse(){
        System.out.println("Selekzioa batu egingo da.");
    }
    /**
     * Jokalariak bidaiatu egingo du.
     */
    public void viajar(){
        System.out.println("Taldea bidaiatzera doa.");
    }
}
